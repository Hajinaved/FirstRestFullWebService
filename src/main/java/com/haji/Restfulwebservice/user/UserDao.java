package com.haji.Restfulwebservice.user;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserDao {
	private static int userCount = 0;
	private static List<User> list = new ArrayList<>();
	static {
		list.add(new User(++userCount, "haji", LocalDate.now()));
		list.add(new User(++userCount, "aaliyah", LocalDate.now()));

		list.add(new User(++userCount, "satyam", LocalDate.now()));

	

	}

	public User addUser(User u) {
		
		u.setId(++userCount);
		list.add(u);
		return u;
	}

	public User getUserByID(int id) {
		return list.stream().filter(u -> (u.getId() == id)).findFirst().orElse(null);
	}

	public List<User> FindAllUsers() {
		return list;
	}

	public void deleteByID(int id) {
		list.removeIf(u -> (u.getId() == id));
	}
}
