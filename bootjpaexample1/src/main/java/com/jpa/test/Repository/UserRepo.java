package com.jpa.test.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.jpa.test.entity.User;

public interface UserRepo extends CrudRepository<User, Long> {

	User findByUserId(Long i);

	List<User> findByUserNameAndUserCity(String userName, String userCity);
	
	@Query("select u FROM User u")
	public List<User> getAllUser();

	
	@Query("select u FROM User u where u.userName =:n")
	public List<User> getUserByName(@Param("n") String name);
	
	
	@Query("select u FROM User u where u.userName =:n and u.userCity =:c")
	public List<User> getUserByNameAndCity(@Param("n") String name,@Param("c") String city);
	
	@Query(value = "select * from user_table", nativeQuery = true)
	public List<User> getUsers();



}
