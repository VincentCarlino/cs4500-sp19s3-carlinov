package edu.neu.cs4500.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.neu.cs4500.models.User;

@RestController
public class UserService {
	static List<User> users = new ArrayList();
	
	static {
		users.add(new User(123, "alice", "alice", "Alice", "Wonderland"));
		users.add(new User(234, "bob", "bob", "Bob", "Marley"));
	}
	
	@RequestMapping("/api/user")
	public List<User> findAllUsers() {
		return users;
	}



}
