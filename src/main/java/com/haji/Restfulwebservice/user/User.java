package com.haji.Restfulwebservice.user;

import java.time.LocalDate;

import org.springframework.validation.annotation.Validated;

import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;
@Validated
public class User {
	
	private int id;
	@Size(min = 2,message = "NAME MUST BE ATLEAST 2 CHARACTERS")

	private String name;
	@Past(message = "BIRTHDATE MUST BE FROM THE PAST")
	private LocalDate birthDate;

	User() {
	}

	User(int id, String name, LocalDate birthDate) {
		super();
		this.id = id;
		this.name = name;
		this.birthDate = birthDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

}
