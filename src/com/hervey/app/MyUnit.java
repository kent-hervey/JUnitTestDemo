package com.hervey.app;

public class MyUnit {

	private Object MyUnit;

	public String concatenate(String one, String two) {
		return one + two;
	}

	public String[] getTheStringArray() {
		String[] expectedArray = { "one", "two", "three" };

		return expectedArray;
	}

	public Boolean getTheBoolean() {
		return false;
	}

	public Object getTheObject() {
		Object nothing = MyUnit;
		return nothing;
	}

	public Object getTheSameObject() {
		Object nothing = MyUnit;
		return nothing;
	}

}
