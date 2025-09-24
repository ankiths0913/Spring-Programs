package in.an.backend;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/submitForm")
public class MyServ extends HttpServlet
{
	
@Override
protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
{

String myname1=req.getParameter("name1");
String myemail1=req.getParameter("email1");

System.out.println("Name 1 : "+myname1);
System.out.println("Email 1 : "+myemail1);
resp.setContentType("text/html");

PrintWriter out = resp.getWriter();
out.print("Name : "+myname1);
out.print("Email : "+myemail1);
}
}
