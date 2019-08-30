package com.hervey.app;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyObjectsTest {

	@Test
	public void testGetTheObject() {
		MyObjects myObjects = new MyObjects();

		assertNull(myObjects.getTheObject());

		assertNotNull(myObjects.getTheObject()); // produces failure
	}

	@Test
	public void testGetTheSameObject() {
		MyObjects myObjects = new MyObjects();

		assertSame(myObjects.getTheSameObject(), myObjects.getTheSameObject());

		assertNotSame(myObjects.getTheSameObject(), myObjects.getTheSameObject()); // returns failure because clearly
																					// they are
																					// the same object
	}

}
