package com.practice;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {
	public static void main(String[] args) {
	      ApplicationContext context = 
	             new ClassPathXmlApplicationContext("Beans.xml");
	      helloSpring obj = (helloSpring) context.getBean("helloWorld");

	      obj.getMessage();
	   }
}
