package com.straypets.shiva.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.straypets.shiva.service.StraypetsService;

@RestController
public class Straypets {
	@Autowired
	StraypetsService strayService;
	@GetMapping(value="fetchDetails")
	public List<Straypets> getAllPets() {
		List<Straypets> petsList=strayService.getAllPets();
		return petsList;
	}
	@PostMapping(value="/savePets")
	public Straypets savePets(@RequestBody Straypets s)
	{
		return strayService.savePets(s);
	}

}
