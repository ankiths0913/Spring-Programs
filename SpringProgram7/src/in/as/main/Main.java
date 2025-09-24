package in.as.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.as.beans.Student;
import in.as.resources.SpringConfigFile;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context=new AnnotationConfigApplicationContext(SpringConfigFile.class);
		
		Student std=context.getBean(Student.class);
		std.display();

	}

}
    