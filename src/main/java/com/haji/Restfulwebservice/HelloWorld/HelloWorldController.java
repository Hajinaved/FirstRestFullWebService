package com.haji.Restfulwebservice.HelloWorld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

record HelloWorldBean(String name) {
};

@RestController
public class HelloWorldController {

	@GetMapping("add/{num1}/{num2}")
	public String Add(@PathVariable int num1, @PathVariable("num2") int n2) {
		return "" + (num1 + n2);
	}

	@GetMapping("hello")
	public String Ret(@RequestParam String s) {
		return s;
	}

	@GetMapping("1")
	public HelloWorldBean retHElloworldbean() {
		return new HelloWorldBean("HAJI");
	}
}
