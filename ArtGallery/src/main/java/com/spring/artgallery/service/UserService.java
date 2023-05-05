package com.spring.artgallery.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.artgallery.model.User;
import com.spring.artgallery.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	UserRepository uRepo;
	
	public User signup(User u) {
		return uRepo.save(u);
	}
	
	public String loginAuth(String username,String password)
	{
		User user = uRepo.findByusername(username);
		if(user == null) {
			return "No User Found/nPlease Try Again!!!!";
		}
		else {
			if(user.getPassword().equals(password)) {
				return "Login Successful";
			}
			else {
				return "Login Failed";
			}
		}
	}
	
}
