package com.haji.Restfulwebservice.user;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import jakarta.validation.Valid;

@RestController
public class UserController {
	@Autowired
	UserDao ud;

	@GetMapping("users")
	public List<User> GetAllUsers() {
		return ud.FindAllUsers();
	}

	@GetMapping("users/{id}")
	public User returnUser(@PathVariable int id) {
		User u = ud.getUserByID(id);
		
		if(u==null) {
			throw new UserNotFoundException("id : "+ id);
		}
		
		return u;
	}

	@PostMapping("users")
	public ResponseEntity<User> adduser(@Valid @RequestBody User u) {
		User saved = ud.addUser(u);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(saved.getId())
				.toUri();
		return ResponseEntity.created(location).build();
	}
	
	
	@DeleteMapping("users/{id}")
	public void DeleteUser(@PathVariable int id) {
		
		
		ud.deleteByID(id);
	}

}
