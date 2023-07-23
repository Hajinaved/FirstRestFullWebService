package com.haji.Restfulwebservice.user;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UserDaoUsingUserRepo {
	private UserRepo ur;

	UserDaoUsingUserRepo(UserRepo ur) {
		super();
		this.ur = ur;
	}
	public User addUser(User u) {
		ur.save(u);
		return u;
	}

	public User getUserByID(int id) {
		return ur.findAll().stream().filter(u -> (u.getId() == id)).findFirst().orElse(null);
	}

	public List<User> FindAllUsers() {
		return ur.findAll();
	}

	public void deleteByID(int id) {
		ur.deleteById(id);
	}

}
