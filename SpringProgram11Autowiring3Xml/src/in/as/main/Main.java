package in.as.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.as.beans.Student;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("/in/as/resources/applicationContext.xml");
		
		Student std=(Student) context.getBean("stdId");
		std.display();

	}

}
