package com.springboot.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class A {

	B b;
	
	@Autowired
	A(B b){
	  this.b=b;
	}
	
	
	
	public void m1() {
		System.out.println("m1() method");
		b.m2();
	}

//	@Autowired
//	public void setB(B b) {
//		this.b = b;
//	}
}
