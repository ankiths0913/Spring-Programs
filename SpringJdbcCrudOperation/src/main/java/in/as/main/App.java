package in.as.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import in.as.beans.Student;
import in.as.mappers.StudentRowMapper;
import in.as.resources.SpringConfigFile;

public class App {
	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);

		JdbcTemplate jdbcTemplate = context.getBean(JdbcTemplate.class);

		// ------------Insert Operation----------
//		int std_rollno = 103;
//		String std_name = "Akash";
//		float std_marks = 70.9f;
//		String insert_sql_query = "INSERT INTO student VALUES(?,?,?)";
//		int count = jdbcTemplate.update(insert_sql_query, std_rollno, std_name, std_marks);
//		if (count > 0) {
//			System.out.println("Insertion Success!!");
//		} else {
//			System.out.println("Insertion Failed!!");
//		}
		
		
		
		//------------Update Operation---------
//		float marks=98.3f;
//		int rollno=101;
//		
//		String update_sql_query="UPDATE student SET std_marks=? WHERE std_roll=?";
//		int count = jdbcTemplate.update(update_sql_query, marks,rollno);
//		if(count>0)
//		{
//			System.out.println("Updation Successfull!!");
//		}
//		else
//		{
//			System.out.println("Updation Failed!!");
//		}
		
		
		//-----------Deletion Operation---------
	
//		int rollno=102;
//		
//		String delete_sql_query="DELETE FROM student WHERE std_roll=?";
//		int count = jdbcTemplate.update(delete_sql_query,rollno);
//		if(count>0)
//		{
//			System.out.println("Deletion Successfull!!");
//		}
//		else
//		{
//			System.out.println("Deletion Failed!!");
//		}
		
		
		//-----------Select Operation  >1  -----
		
//		String select_sql_query="SELECT * FROM student";
//		List<Student> std_list=jdbcTemplate.query(select_sql_query, new StudentRowMapper());
//		for(Student std : std_list) {
//			System.out.println("Rollno : "+std.getRollno());
//			System.out.println("Name : "+std.getName());
//			System.out.println("Marks : "+std.getMarks());
//			System.out.println("------------------------------------");
//		}
		
		//---------------Select Operation 2--------
//		int rollno=101;
//		String select_sql_query="SELECT * FROM student WHERE std_roll=?";
//		List<Student> std_list=jdbcTemplate.query(select_sql_query, new StudentRowMapper(),rollno);
//		for(Student std : std_list) {
//			System.out.println("Rollno : "+std.getRollno());
//			System.out.println("Name : "+std.getName());
//			System.out.println("Marks : "+std.getMarks());
//			System.out.println("------------------------------------");
//		}
		
		
		//---------------Select Operation 3--------
				int rollno=103;
				String select_sql_query="SELECT * FROM student WHERE std_roll=?";
				Student std=jdbcTemplate.queryForObject(select_sql_query, new StudentRowMapper(),rollno);
		
				System.out.println("Rollno : "+std.getRollno());
				System.out.println("Name : "+std.getName());
				System.out.println("Marks : "+std.getMarks());
		
		
		
		
	}
	
}
