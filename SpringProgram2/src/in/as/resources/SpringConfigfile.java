package in.as.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.as.beans.Example2;

@Configuration
public class SpringConfigfile {
	
	@Bean
	public Example2 expId1()
	{
		Example2 exp=new Example2();
		
		exp.setName("Ankit");
		exp.setRollno(13);
		exp.setEmail("anki14cs@gmail.com");
		
		return exp;
	}

}
