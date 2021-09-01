package com.jun.structural.proxy.protectionproxy;

import java.lang.reflect.Proxy;

public class PersonProxy {

	Person getOwnerProxy(Person person) {
		return (Person) Proxy.newProxyInstance(
				person.getClass().getClassLoader(), 
				person.getClass().getInterfaces(),
				new OwnerInvocationHandler(person));
	}
	
	Person getNonOwnerProxy(Person person) {
		return (Person) Proxy.newProxyInstance(
				person.getClass().getClassLoader(), 
				person.getClass().getInterfaces(), 
				new NonOwnerInvocationHandler(person));
	}

}
