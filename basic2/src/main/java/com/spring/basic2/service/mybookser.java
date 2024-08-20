package com.spring.basic2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.basic2.model.mybook;
import com.spring.basic2.repository.mbrep;

@Service
public class mybookser {
	@Autowired
	private mbrep mbr;
	
	public void savemb(mybook mb)
	{
		mbr.save(mb);
	}
	
	public List<mybook> getAllMyBooks(){
		return mbr.findAll();
	}
	
	public void deleteById(int id) {
		mbr.deleteById(id);
	}

}
