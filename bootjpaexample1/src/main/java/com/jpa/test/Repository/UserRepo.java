package com.jpa.test.Repository;

import org.springframework.data.repository.CrudRepository;

import com.jpa.test.entity.User;

public interface UserRepo extends CrudRepository<User, Long> {

	User findByUserId(Long i);

	



}
