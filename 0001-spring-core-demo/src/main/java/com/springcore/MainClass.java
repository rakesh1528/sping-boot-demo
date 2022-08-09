package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		ApplicationContext context= new AnnotationConfigApplicationContext(JavaConfig.class);
		A a=context.getBean(A.class);
		a.m1();
	}

}
