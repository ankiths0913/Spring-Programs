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
		Address addr=new Address();
		
		addr.setHouseno(100);
		addr.setCity("Dewas");
		addr.setPincode(989063);
		
		return addr;
	}
	
	@Bean
	public Student createStdObj() {
		Student std=new Student();
		
		std.setName("Rohan");
		std.setRollno(890);
		std.setAddress(createAddrObj());
		
		return std;
	}

}
