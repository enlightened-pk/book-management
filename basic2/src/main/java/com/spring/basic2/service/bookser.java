package com.spring.basic2.service;




import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.basic2.model.book;
import com.spring.basic2.repository.bookrepo;

@Service
public class bookser {
	@Autowired
	private bookrepo br;

	public void save(book b) {
		br.save(b);
			}
	
	public List<book> getAllBook(){
		return br.findAll();
	}

	public book getBookById(int id) {
		return br.findById(id).get();
	}
	public void deleteById(int id) {
		br.deleteById(id);
	}
}
