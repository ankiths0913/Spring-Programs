package com.springcore.auto.wire.annotation;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test22 {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/auto/wire/annotation/autoconfig.xml");
		Empr emp2=context.getBean("emp2", Empr.class);
		System.out.println(emp2); 

	}

}
