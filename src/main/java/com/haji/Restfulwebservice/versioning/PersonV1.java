package com.haji.Restfulwebservice.versioning;

public class PersonV1 {
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	PersonV1(String name) {
		super();
		this.name = name;
	}

	PersonV1() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
