package in.as.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.as.beans.Example1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String config_loc="/in/as/resources/applicationContext.xml";
		ApplicationContext context=new ClassPathXmlApplicationContext(config_loc);
		
		Example1 exp= (Example1) context.getBean("expId");
		exp.display();

	}

}
/*1.spring-beans-xxx.jar
2.spring-core-xxx.jar
3.spring-context-xxx.jar
4.commons-logging-xxx.jar
5.spring-expression-xxx.jar
*/  