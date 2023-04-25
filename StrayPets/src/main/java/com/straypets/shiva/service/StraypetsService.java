package com.straypets.shiva.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.straypets.shiva.controller.Straypets;

@Service
public class StraypetsService {
@Autowired	
StraypetsRepository StrayRepository;
	public List<Straypets> getAllPets(){
		List<Straypets>petsList=StrayRepository.findAll();
		return petsList;
	}	

public StrayPets savePets(Straypets s) {
	
StrayPets obj=StrayRepository.save(s);
return obj;

}
}
