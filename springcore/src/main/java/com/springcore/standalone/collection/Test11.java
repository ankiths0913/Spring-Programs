package com.springcore.standalone.collection;
import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		ApplicationContext con=
				new ClassPathXmlApplicationContext("com/springcore/standalone/collection/aloneconfig.xml");
	            
		        Person person1 = con.getBean("person1",Person.class);
		        System.out.println(person1);
		        System.out.println(person1.getFriends().getClass().getName());
		        System.out.println(person1.getFeestructure());
		
	}

}
