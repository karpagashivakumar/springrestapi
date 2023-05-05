package com.spring.artgallery.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.spring.artgallery.model.artgallery;
import com.spring.artgallery.repository.artgalleryRepository;

@Service
public class ArtService {
	
	@Autowired
	artgalleryRepository aRepo;

	public List<artgallery> get() {
		List<artgallery> aList=aRepo.findAll();
		return aList;
	}

	public artgallery save(artgallery a) {

		artgallery obj=aRepo.save(a);
		return obj;
	}
	
	public artgallery update(artgallery a) {
		artgallery obj=aRepo.save(a);
		return obj;
	}
	
	public void delete(int id) {
		aRepo.deleteById(id);
	}
	public artgallery get(int id) {
		artgallery obj=aRepo.findById(id).get();
		return obj;
	}

	public List<artgallery> sort(String field) {
		// TODO Auto-generated method stub
		return aRepo.findAll(Sort.by(field));
		//return aRepo.findAll(Sort.by(Direction.DESC,field));
		
	}	

	
	public List<artgallery>pagingSorting(int offset,int pageSize,String field){
		
		Pageable paging=PageRequest.of(offset,pageSize).withSort(Sort.by(field));
		Page<artgallery>lapData= aRepo.findAll(paging);	
		List<artgallery>lapList=lapData.getContent();
		return lapList;
	}

	public List<artgallery> Paging(int offset, int pageSize) {
		Pageable paging=PageRequest.of(offset, pageSize);
		Page<artgallery>artdata=aRepo.findAll(paging);
		List<artgallery>artlist=artdata.getContent();
		return artlist;
	}


}
