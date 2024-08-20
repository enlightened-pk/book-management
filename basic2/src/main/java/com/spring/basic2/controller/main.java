package com.spring.basic2.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.spring.basic2.model.book;
import com.spring.basic2.model.mybook;
import com.spring.basic2.service.bookser;
import com.spring.basic2.service.mybookser;

@Controller
public class main {
	
	@Autowired
	private bookser bs;
	
	@Autowired
	private mybookser mbs;

	@GetMapping("hh")
	public String h() {
		return "hoi";
		
	}
	
	@GetMapping("/bookreg")
	public String hi() {
		return "bookregtr";
		
	}
	
	@GetMapping("/mybook")
	public String hil(Model model) {
		
		List<mybook>list=mbs.getAllMyBooks();
		model.addAttribute("book",list);
		return "mybook";
		
	}
	@PostMapping("/save")
	public String addBook(@ModelAttribute book b){
		bs.save(b);
		return "redirect:/ab";
	}
//	@GetMapping("/ab")
//	public String ab() {
//		return "availbooks";
//		
//	}
	@GetMapping("/ab")
	public ModelAndView getAllBook() {
		List<book>list=bs.getAllBook();
//		ModelAndView m=new ModelAndView();
//		m.setViewName("bookList");
//		m.addObject("book",list);
		return new ModelAndView("availbooks","book",list);
	}

	@GetMapping("/")
	public String s() {
		return "index";
	}
	
	@RequestMapping("/mylist/{id}")
	public String getMyList(@PathVariable("id") int id) {
		book b=bs.getBookById(id);
		mybook mb=new mybook(b.getId(),b.getName(),b.getAuthor(),b.getPrice());
		mbs.savemb(mb);
		return "redirect:/mybook";
	}
	
	@PostMapping("hi/{name}/{age}")
	public String hh(@PathVariable("name")  String data,@PathVariable("age")  String dataa){
		return data+dataa;
		
	}
}
