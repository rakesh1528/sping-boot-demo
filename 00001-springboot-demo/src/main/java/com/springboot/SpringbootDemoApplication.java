package com.springboot;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.PropertySource;

import com.springboot.controller.Prod;

@SpringBootApplication
@EnableConfigurationProperties
@PropertySource("classpath:db.properties")
public class SpringbootDemoApplication implements CommandLineRunner, ApplicationRunner {

	public static void main(String[] args) {
		ConfigurableApplicationContext context= SpringApplication.run(SpringbootDemoApplication.class, args);
//		A a=context.getBean(A.class);
//		a.m1();
		
//	    System.out.println("count of beans : "+ context.getBeanDefinitionCount());
//		String[] beans =context.getBeanDefinitionNames();
//		
//		for(String bean: beans) {
//			System.out.println(bean);
//		}
		
		Prod prod=context.getBean(Prod.class);
		prod.getDetalis();
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(" Entered into Command line runner");
		
		for(String arg: args) {
			System.out.println("args are : "+arg);
		}
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		System.out.println("non option args are ");
		for(String nonOptionArg: args.getNonOptionArgs()) {
			System.out.println("Non optional args : "+nonOptionArg);
		}
		
		for(String optionArg: args.getOptionNames()) {
			System.out.println("optional args : "+optionArg);
		}
	}

}
