package com.in28minutes.learning.jpa;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.in28minutes.learning.jpa.entity.User;
import com.in28minutes.learning.jpa.service.UserDAOService;

@Component
public class UserRepositoryCommandLine implements CommandLineRunner {

	private static final Logger log = LoggerFactory.getLogger(UserRepositoryCommandLine.class);
	
	@Autowired
	private UserDAOService userDAO;
	
	@Override
	public void run(String... arg0) throws Exception {
		User user = new User("Wallison", "Admin");
		long id = userDAO.insert(user);
		log.info("User created: " + user.toString());
	}

}
