package com.spring.artgallery.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.artgallery.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{
	User findByusername(String username);
}
