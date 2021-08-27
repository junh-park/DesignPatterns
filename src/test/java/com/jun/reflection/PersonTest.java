package com.jun.reflection;


import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class PersonTest {
	@Test
	public void givenObject_whenGetsFieldNamesAtRuntime_thenCorrect() {
		Person person = new Person();
		Field[] fields = person.getClass().getDeclaredFields();
		
		List<String> actualFieldNames = getFieldNames(fields);
		
		assertTrue(Arrays.asList("name", "age").containsAll(actualFieldNames));
		assertThat(person, is(instanceOf(Person.class)));
	}

	private List<String> getFieldNames(Field[] fields) {
		List<String> fieldNames = new ArrayList<>();
		for (Field field : fields) {
			fieldNames.add(field.getName());
		}
		return fieldNames;
	}
	

}
