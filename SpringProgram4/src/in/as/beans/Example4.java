package in.as.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Example4 {
	
	@Value("Ankit")
	private String name;
	
	@Value("13")
	private int rollno;
	
	@Value("65.89f")
	private float marks;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public float getMarks() {
		return marks;
	}
	public void setMarks(float marks) {
		this.marks = marks;
	}
	
	public void display() {
		System.out.println("Name: "+name);
		System.out.println("Roll No. : "+rollno);
		System.out.println("Marks: "+marks);
	}

}
