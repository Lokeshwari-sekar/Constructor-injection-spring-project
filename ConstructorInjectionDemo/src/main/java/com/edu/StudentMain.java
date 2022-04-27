package com.edu;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentMain {

	public static void main(String[] args) {

		ApplicationContext ctxob=new ClassPathXmlApplicationContext("spring.xml");
		Student stuob=(Student) ctxob.getBean("sob");
		stuob.studentDisplay();

	}

}
