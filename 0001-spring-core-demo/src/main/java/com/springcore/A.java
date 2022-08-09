package com.springcore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class A {

	B b;
	
	@Value("${dburl.id}")
	private String dburl;
	
	@Value("${password.p}")
	private String password;
	
	
//	@Autowired
//	A(B b){
//	  this.b=b;
//	}
//	
	
	
	public void m1() {
		System.out.println("m1() method "+dburl+":"+password);
		System.out.println("dburl : "+dburl);
		System.out.println("password : "+password);
		b.m2();
	}

	@Autowired
	public void setB(B b) {
		this.b = b;
	}
}
