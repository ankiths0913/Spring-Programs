package in.as.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.as.beans.Example3; 

public class Main {

	public static void main(String[] args) {
		String resources_file_path="/in/as/resources/applicationContext.xml";
		ApplicationContext context=new ClassPathXmlApplicationContext(resources_file_path);
		
		Example3 exp = (Example3) context.getBean("example3");
		exp.display();

	}

}
