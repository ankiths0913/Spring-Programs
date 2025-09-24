package in.as.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.as.beans.Student;

public class App 
{
    public static void main( String[] args )
    {
    	String configLocation="/in/as/resources/applicationContext.xml";
        ApplicationContext context=new ClassPathXmlApplicationContext(configLocation);
        
        Student std=context.getBean(Student.class);
        std.display();
    }
}
