package com.springcore;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan
@PropertySource("classpath:db.properties")
public class JavaConfig {

//	@Bean
//	public B b() {
//		return new B();
//	}
//	
//	@Bean
//	public A a(B b) {
//		A a =new A();
//		a.setB(b);
//		return a;
//	}
}
