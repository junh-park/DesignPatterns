package com.jun.reflection;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class GoatTest {
	Object goat;
	Class<?> goatClass;
	Class<?> animalClass;
	Class<?> birdClass;

	@Before
	public void setup() throws ClassNotFoundException {
		goat = new Goat("goat");
		goatClass = Class.forName("com.jun.reflection.Goat");
		animalClass = Class.forName("com.jun.reflection.Animal");
		birdClass = Class.forName("com.jun.reflection.Bird");
	}

	@Test
	public void givenObject_whenGetsClassName_thenCorrect() {
		Class<?> clazz = goat.getClass();

		assertEquals("Goat", clazz.getSimpleName());
		assertEquals("com.jun.reflection.Goat", clazz.getName());
		assertEquals("com.jun.reflection.Goat", clazz.getCanonicalName());
	}

	@Test
	public void givenClassName_whenCreatesObject_thenCorrect() {
		assertEquals("Goat", goatClass.getSimpleName());
		assertEquals("com.jun.reflection.Goat", goatClass.getName());
		assertEquals("com.jun.reflection.Goat", goatClass.getCanonicalName());
	}

	@Test
	public void givenClass_whenRecognisesMOdifiers_thenCorrect() throws ClassNotFoundException {
		int goatMods = goatClass.getModifiers();
		int animalMods = animalClass.getModifiers();

		assertTrue(Modifier.isPublic(goatMods));
		assertTrue(Modifier.isAbstract(animalMods));
		assertTrue(Modifier.isPublic(animalMods));
	}

	@Test
	public void givenClass_whenGetsPackageInfo_thenCorrect() {
		Class<?> goatClass = goat.getClass();
		Package pck = goatClass.getPackage();

		assertEquals("com.jun.reflection", pck.getName());
	}

	@Test
	public void givenClass_whenGetsSuperClass_thenCorrect() {
		String str = "any string";

		Class<?> goatClass = goat.getClass();
		Class<?> goatSuperClass = goatClass.getSuperclass();

		assertEquals("Animal", goatSuperClass.getSimpleName());
		assertEquals("Object", str.getClass().getSuperclass().getSimpleName());
	}

	@Test
	public void givenClass_whenImplementedInterfaces_thenCorrect() {
		Class<?>[] goatInterfaces = goatClass.getInterfaces();
		Class<?>[] animalInterfaces = animalClass.getInterfaces();

		assertEquals(1, goatInterfaces.length);
		assertEquals(1, animalInterfaces.length);
		assertEquals("Locomotion", goatInterfaces[0].getSimpleName());
		assertEquals("Eating", animalInterfaces[0].getSimpleName());
	}

	@Test
	public void givenClass_whenGetsConstructor_thenCorrect() {
		Constructor<?>[] constructors = goatClass.getConstructors();

		assertEquals(2, constructors.length);
		assertEquals("com.jun.reflection.Goat", constructors[0].getName());
	}

	@Test
	public void givenObject_whenGetsFieldNamesAtRuntime_thenCorrect() {
		Field[] fields = animalClass.getDeclaredFields();

		List<String> actualFields = getFieldNames(fields);

		assertEquals(2, actualFields.size());
		assertTrue(actualFields.containsAll(Arrays.asList("name", "CATEGORY")));
	}

	@Test
	public void givenClass_whenGetsMethods_thenCorrect() {
		Method[] methods = animalClass.getDeclaredMethods();

		List<String> actualMethods = getMethodNames(methods);

		assertEquals(3, actualMethods.size());
		assertTrue(actualMethods.containsAll(Arrays.asList("getName", "setName", "getSound")));
	}

	private List<String> getMethodNames(Method[] methods) {
		List<String> methodNames = new ArrayList<>();
		for (Method method : methods) {
			methodNames.add(method.getName());
		}
		return methodNames;
	}

	private List<String> getFieldNames(Field[] fields) {
		List<String> fieldNames = new ArrayList<>();
		for (Field field : fields) {
			fieldNames.add(field.getName());
		}
		return fieldNames;
	}

	@Test
	public void givenClass_whenGetsEachConstructorByParamTypes_thenCorrect()
			throws NoSuchMethodException, SecurityException {
		Constructor<?> cons1 = birdClass.getConstructor();
		Constructor<?> cons2 = birdClass.getConstructor(String.class);
		Constructor<?> cons3 = birdClass.getConstructor(String.class, boolean.class);
	}

	@Test
	public void givenClass_whenINstantiatesObjectsAtRuntime_thenCorrect()
			throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException {
		Constructor<?> cons1 = birdClass.getConstructor();
		Constructor<?> cons2 = birdClass.getConstructor(String.class);
		Constructor<?> cons3 = birdClass.getConstructor(String.class, boolean.class);

		Bird bird1 = (Bird) cons1.newInstance();
		Bird bird2 = (Bird) cons2.newInstance("Weaver bird");
		Bird bird3 = (Bird) cons3.newInstance("dove", true);

		assertEquals("bird", bird1.getName());
		assertEquals("Weaver bird", bird2.getName());
		assertEquals("dove", bird3.getName());

		assertFalse(bird1.walks());
		assertTrue(bird3.walks());
	}

	@Test
	public void givenClass_whenGetsPublicFields_thenCorrect() {
		Field[] fields = birdClass.getFields();

		assertEquals(1, fields.length);
		assertEquals("CATEGORY", fields[0].getName());
	}

	@Test
	public void givenClass_whenGetsPublicFieldByName_thenCorrect() throws NoSuchFieldException, SecurityException {
		Field field = birdClass.getField("CATEGORY");

		assertEquals("CATEGORY", field.getName());
	}

	@Test
	public void givenClass_whenGetsDeclaredFields_thenCorrect() {
		Field[] fields = birdClass.getDeclaredFields();

		assertEquals(1, fields.length);
		assertEquals("walks", fields[0].getName());
	}

	@Test
	public void givenClassField_whenGetsType_thenCorrect()
			throws NoSuchFieldException, SecurityException, ClassNotFoundException {
		Field field = birdClass.getDeclaredField("walks");
		Class<?> fieldClass = field.getType();

		assertEquals("boolean", fieldClass.getSimpleName());
	}

	@Test
	public void givenClassField_whensetsAndGetsValue_thenCorrect()
			throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException,
			NoSuchMethodException, SecurityException, NoSuchFieldException {
		Bird bird = (Bird) birdClass.getConstructor().newInstance();
		Field field = birdClass.getDeclaredField("walks");
		field.setAccessible(true);

		// shows that walks variable set in bird object is false through
		// field.getBoolean() method
		assertFalse(field.getBoolean(bird));
		// proves that walks variable is set to false
		assertFalse(bird.walks());

		field.set(bird, true);

		assertTrue(field.getBoolean(bird));
		assertTrue(bird.walks());
	}

	@Test
	public void givenClassField_whenGetsAndSetsWithNull_thenCorrect()
			throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		Field field = birdClass.getField("CATEGORY");
		field.setAccessible(true);
		assertEquals("domestic", field.get(null));
	}

	@Test
	public void givenClass_whenGetsAllPublicMethods_thenCorrect() {
		Method[] methods = birdClass.getMethods();
		List<String> methodNames = getMethodNames(methods);

		assertTrue(methodNames
				.containsAll(Arrays.asList("equals", "notifyAll", "hashCode", "walks", "eating", "toString")));
	}

	@Test
	public void givenClass_whenGetsOnlyDeclaredMethods_thenCorrect() {
		List<String> actualMethodNames = getMethodNames(birdClass.getDeclaredMethods());

		List<String> expectedMethodNames = Arrays.asList("setWalks", "walks", "getSound", "eating");

		assertEquals(expectedMethodNames.size(), actualMethodNames.size());
		assertTrue(expectedMethodNames.containsAll(actualMethodNames));
		assertTrue(actualMethodNames.containsAll(expectedMethodNames));
	}
	
	@Test
	public void givenMethod_whenInvokes_thenCorrect() throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
	    Bird bird = (Bird) birdClass.getConstructor().newInstance();
	    Method setWalksMethod = birdClass.getDeclaredMethod("setWalks", boolean.class);
	    Method walksMethod = birdClass.getDeclaredMethod("walks");
	    boolean walks = (boolean) walksMethod.invoke(bird);

	    assertFalse(walks);
	    assertFalse(bird.walks());

	    setWalksMethod.invoke(bird, true);

	    boolean walks2 = (boolean) walksMethod.invoke(bird);
	    assertTrue(walks2);
	    assertTrue(bird.walks());
	}
}
