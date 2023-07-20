package com.haji.Restfulwebservice.versioning;

public class PersonV2 {
	private Name name;

	PersonV2(Name name) {
		this.name = name;
	}

	public Name getNm() {
		return name ;
	}
	
}
