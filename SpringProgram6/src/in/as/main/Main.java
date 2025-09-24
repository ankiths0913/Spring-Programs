package in.as.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.as.beans.Student;

public class Main {

	public static void main(String[] args) {
		String config_file_xml = "in/as/resources/applicationContext.xml";
		ApplicationContext context=new ClassPathXmlApplicationContext(config_file_xml);
		
		Student std= (Student) context.getBean("stdId");
		std.display();

	}

}
    