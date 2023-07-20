package com.haji.Restfulwebservice.versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonVersioningController {

	@GetMapping("v1/person")
	public PersonV1 retPerson() {
		return new PersonV1("Arbab Naved");
	}

	@GetMapping("v2/person")
	public PersonV2 retPerson2() {
		return new PersonV2(new Name("ARBAB", "NAVED"));
	}

	@GetMapping(path = "person", params = "version=1")
	public PersonV1 req() {

		return new PersonV1("Arbab Naved");
	}

	@GetMapping("personn")
	public Object Persona(@RequestParam("version") int id) {
		return (id == 1) ? (new PersonV1("Arbab Naved")) : new PersonV2(new Name("ARBAB", "NAVED"));
	}

	@GetMapping(path = "perso", headers = "version=1")
	public PersonV1 asd() {
		return new PersonV1("SARYA");
	}

	@GetMapping(path = "perso", headers = "version=2")
	public PersonV2 dsa() {
		return new PersonV2(new Name("AA", "VAA"));
	}

}
