package com.max.artgallery.auth.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.max.artgallery.auth.repository.*;
import com.max.artgallery.auth.model.*;

@Service
public class artgalleryservice {
	
	@Autowired

	private artgallery repository;

	

	public String checkLogin(String uname, String pwd) {

	    artgallery user = repository.findByuname(uname);

	    if (user == null) {

	      return "no user found";

	    }

	    else{

	    	if(user.getPwd().equals(pwd)) {	    		

	    		return"Login Succesfull"; 

	    	}

	    	else {

	    		return "Login Failed";

	    	}

	    }

	}

	public artgallery addUser(artgallery art) {

		return repository.save(art);

	}

	public List<artgallery> getUser(){

		return repository.findAll();

	}

}
