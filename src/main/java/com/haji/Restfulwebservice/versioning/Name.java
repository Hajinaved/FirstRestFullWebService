package com.haji.Restfulwebservice.versioning;

public class Name {
	private String FirstName;
	private String SecondName;
	Name(String firstName, String secondName) {
		super();
		FirstName = firstName;
		SecondName = secondName;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getSecondName() {
		return SecondName;
	}
	public void setSecondName(String secondName) {
		SecondName = secondName;
	}
	

}
