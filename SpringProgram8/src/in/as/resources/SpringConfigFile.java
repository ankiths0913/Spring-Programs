package in.as.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.as.beans.Address;
import in.as.beans.Student;

@Configuration
public class SpringConfigFile {
	
	@Bean
	public Address createAddrObj()
	{
		Address addr=new Address(505,"Maksi",537890);
		
		return addr;
	}
	
	@Bean
	public Student createStdObj() {
		
		Student std=new Student("Shubham",450, createAddrObj());
		
		return std;
	}

}
