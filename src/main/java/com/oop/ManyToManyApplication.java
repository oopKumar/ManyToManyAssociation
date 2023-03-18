package com.oop;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.oop.entity.Role;
import com.oop.entity.User;
import com.oop.repo.RoleRepo;
import com.oop.repo.UserRepo;

@SpringBootApplication
public class ManyToManyApplication  {
	
	public static void main(String[] args) {
		
		
		ConfigurableApplicationContext context = SpringApplication.run(ManyToManyApplication.class, args);
		
		User user = new User("Om Prakash Kumar");
		User user1 = new User("Raju Kumar");
		
		UserRepo userRepository = context.getBean(UserRepo.class);
		userRepository.saveAll(Arrays.asList(user,user1));
		
		Role role = new Role("Manager");
		Role role2 = new Role("Admin");	
		Role role3 = new Role("User");
		
		
		 
		
		RoleRepo roleRepository = context.getBean(RoleRepo.class);
		roleRepository.saveAll(Arrays.asList(role,role2,role3));
		
		
		 user.getLikedRoles().addAll(Arrays.asList(role, role2,role3));
		 user1.getLikedRoles().addAll(Arrays.asList(role,role2));

		 userRepository.saveAll(Arrays.asList(user,user1));
			
		
	}

}
