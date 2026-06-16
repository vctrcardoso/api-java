package com.paulo.api_java.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.paulo.api_java.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	

}
