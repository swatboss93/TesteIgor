package com.in28minutes.learning.jpa;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.in28minutes.learning.jpa.entity.User;
import com.in28minutes.learning.jpa.service.UserDAOService;
import com.in28minutes.learning.jpa.service.UserRepository;

@Component
public class UserDaoServiceCommandLine implements CommandLineRunner {

	private static final Logger log = LoggerFactory.getLogger(UserDaoServiceCommandLine.class);
	
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void run(String... arg0) throws Exception {
		User user = new User("Wallison", "Admin");
		userRepository.save(user);
		log.info("User created: " + user.toString());
	}

}
