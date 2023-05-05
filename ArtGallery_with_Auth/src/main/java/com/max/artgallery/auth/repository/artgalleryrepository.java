package com.max.artgallery.auth.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.max.artgallery.auth.model.artgallery;

public interface artgalleryrepository extends JpaRepository<artgallery, Integer> {
	
	artgallery findByuname(Stirng uname);

}
