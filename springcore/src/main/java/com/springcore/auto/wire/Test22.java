package com.springcore.auto.wire;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test22 {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/auto/wire/autoconfig.xml");
		Empe emp1=context.getBean("emp1", Empe.class);
		System.out.println(emp1); 

	}

}
