package com.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.springboot.beans.Book;

@Component
public class Prod {

	@Value("${dburl}")
	private String dburl;
	
	@Value("${password}")
	private String password;
	
	@Autowired
	Book b;
	
	public void getDetalis() {
		System.out.println("dburl :"+dburl);
		System.out.println("password :"+password);
		System.out.println("book id: "+b.getId());
		System.out.println("book Author: "+b.getAuthor());
		System.out.println("book price: "+b.getPrice());
	}
}
