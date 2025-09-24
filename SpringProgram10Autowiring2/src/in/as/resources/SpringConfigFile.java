package in.as.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.as.beans.Address;
import in.as.beans.Student;
import in.as.beans.Subjects;

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
	public Address createAddrObj2()
	{
		Address addr=new Address();
		
		addr.setHouseno(100);
		addr.setCity("Indore");
		addr.setPincode(452010);
		
		return addr;
	}
	
	@Bean
	public Subjects createSubjObj() {
		Subjects subj=new Subjects();
		
		List<String> subjects_list=new ArrayList<String>();
		subjects_list.add("Java");
		subjects_list.add("C++");
		subjects_list.add("Python");
		
		subj.setSubjects(subjects_list);
		
		return subj;
	}
	
	@Bean
	public Student createStdObj()
	{
		Student std=new Student();
		
		std.setName("Ankit");
		std.setRollno(11);
//		std.setAddress(createAddrObj());
//		std.setSubjects(createSubjObj());
		
		return std;
	}

}
