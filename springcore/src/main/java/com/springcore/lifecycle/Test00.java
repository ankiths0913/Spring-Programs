package com.springcore.lifecycle;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test00 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/lifecycle/lcconfig.xml");
		context.registerShutdownHook();
		/*
		 * Bread b1=(Bread) context.getBean("b1"); System.out.println(b1);
		 * 
		 * 
		 * Juice j1=(Juice) context.getBean("j1"); System.out.println(j1);
		 */
		
		Example example=(Example) context.getBean("example");
		System.out.println(example);
	}

}
