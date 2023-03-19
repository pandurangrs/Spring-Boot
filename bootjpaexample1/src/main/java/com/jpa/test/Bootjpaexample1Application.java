package com.jpa.test;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jpa.test.Repository.UserRepo;
import com.jpa.test.entity.User;

@SpringBootApplication
public class Bootjpaexample1Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Bootjpaexample1Application.class, args);

		UserRepo userRepo = context.getBean(UserRepo.class);

		// Insert Data
//		User user=new User();
//		user.setUserName("Jay");
//		user.setUserCity("Warje");
//		user.setUserStatus("progress");
//		userRepo.save(user);

		// Saving multiple user
//		User user1=new User();
//		user1.setUserName("Maya");
//		user1.setUserCity("Parje");
//		user1.setUserStatus("CREDITprogress");
//		
//		User user2=new User();
//		user2.setUserName("Laxmi");
//		user2.setUserCity("Khirvire");
//		user2.setUserStatus("CREDIT");
//		List<User> list = List.of(user1,user2);
//		userRepo.saveAll(list);

		// Get Data All
//		List<User> users=new ArrayList<>();
//		users = (List<User>) userRepo.findAll();		
//		users.forEach(usr -> System.out.println(usr));

		// Get Data using id
//		User user = userRepo.findByUserId((long) 1);
//		System.out.println(user);

		// Update Data
//		User user=userRepo.findByUserId((long) 1);
//		System.err.println(user);
//		
//		user.setUserName("Om");
//		user.setUserCity("Nashik");
//		user.setUserStatus("Pending");
//		userRepo.save(user);

		// Delete Data
//		User user = userRepo.findByUserId((long) 1);
//		userRepo.delete(user);
//		System.out.println("Deleted");

//		https://docs.spring.io/spring-data/jpa/docs/1.8.x/reference/html/#jpa.query-methods.query-creation

//		List<User> result = userRepo.findByUserNameAndUserCity("Jay", "Warje");
//
//		result.forEach(usr -> {
//			System.err.println(usr);
//		});

		List<User> allUser = userRepo.getAllUser();

		allUser.forEach(usr -> {
			System.out.println(usr);
		});

		List<User> userByName = userRepo.getUserByName("Jay");

		userByName.forEach(u -> {
			System.err.println(u);
		});

		List<User> userByNameAndCity = userRepo.getUserByNameAndCity("Maya", "Parje");
		userByNameAndCity.forEach(uu -> {
			System.err.println(uu);
		});
		
		List<User> nativeQ = userRepo.getUsers();
		nativeQ.forEach(uu -> {
			System.err.println(uu);
		});

	}

}
