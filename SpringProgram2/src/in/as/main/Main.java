package in.as.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.as.beans.Example2;
import in.as.resources.SpringConfigfile;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context=new AnnotationConfigApplicationContext(SpringConfigfile.class);
		
		Example2 exp=(Example2)context.getBean("expId1");
		exp.display();
	}

}
