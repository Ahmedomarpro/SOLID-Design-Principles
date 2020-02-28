package com.ao.soliddesignprinciples.dependencyInversion;

/*Entities must depend on abstraction not concretion*/
public class A {
	private B b;
	private C c;

	public A() {
		b = new B();    // inheritance oop
		if (b == null) {

		}
		c = new C();
		c.toString();        // object in class
	}
}
