package in.as.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.as.beans.Example4;
import in.as.resources.SpringConfigFile; 

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context=new AnnotationConfigApplicationContext(SpringConfigFile.class);
		
		Example4 exp=(Example4) context.getBean("example4");
		exp.display();

	}

}
