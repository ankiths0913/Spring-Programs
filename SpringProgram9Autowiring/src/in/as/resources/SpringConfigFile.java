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
		addr.setCity("Indore");
		addr.setPincode(452010);
		
		return addr;
	}
	
	@Bean
	public Student createStdObj()
	{
		Student std=new Student();
		
		std.setName("Ankit");
		std.setRollno(11);
//		std.setAddress(createAddrObj());
		
		return std;
	}

}
