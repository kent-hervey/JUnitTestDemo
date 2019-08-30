package com.hervey.app;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class MyBooleansTest {

	@Test
	public void testGetTheBoolean() {
		MyBooleans myBooleans = new MyBooleans();

		assertTrue(myBooleans.getTheBoolean()); // this shows failure because over in MyUnit the return is set to false

		assertFalse(myBooleans.getTheBoolean());
	}
}