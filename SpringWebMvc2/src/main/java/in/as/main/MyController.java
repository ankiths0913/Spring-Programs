package in.as.main;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import in.as.beans.User;
import jakarta.annotation.PostConstruct;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;

@Controller
public class MyController {
	
//	@RequestMapping(value = "/helloPage", method = RequestMethod.GET)
	@GetMapping("/helloPage")
	public ModelAndView openHelloPage()
	{
		System.out.println("openHelloPage() method Executed");
		
		ModelAndView mav=new ModelAndView();
		mav.setViewName("hello");
		
		return mav;
	}
	
	@GetMapping("/myForm")
	public String openMyFormPage()
	{
		return "myform";
	}
	
//	@PostMapping("/submitForm")
//	public String handleMyForm(HttpServletRequest req)
//	{
//		String myname=req.getParameter("name1");
//		String myemail=req.getParameter("email1");
//		String myphone=req.getParameter("phoneno1");
//		
//		System.out.println("Name : "+myname);
//		System.out.println("Email : "+myemail);
//		System.out.println("Phoneno : "+myphone);
//		
//		return "profile";
//	}
	
//	@PostMapping("/submitForm")
//	public String handleMyForm(
//			@RequestParam("name1") String myname,
//			@RequestParam("email1") String myemail,
//			@RequestParam("phoneno1") String myphone,
//			Model model
//			) {
//		System.out.println("Name : " +myname);
//		System.out.println("Email : " +myemail);
//		System.out.println("Phoneno : " +myphone);
//		
//		model.addAttribute("model_name", myname);
//		model.addAttribute("model_email", myemail);
//		model.addAttribute("model_phone", myphone);
//		
//		return "profile";
//		
//	}
	
//	@PostMapping("/submitForm")
//	public String handleMyForm(
//			@RequestParam("name1") String myname,
//			@RequestParam("email1") String myemail,
//			@RequestParam("phoneno1") String myphone,
//			Model model
//			) 
//	{
//		System.out.println("Name : " +myname);
//		System.out.println("Email : " +myemail);
//		System.out.println("Phoneno : " +myphone);
//		
//		User user =new User();
//		user.setName(myname);
//		user.setEmail(myemail);
//		user.setPhoneno(myphone);
//		
//		model.addAttribute("model_user", user);
//		
//		
//		return "profile";
//		
//	}
	
	@PostMapping("/submitForm")
	public String handleMyForm(@ModelAttribute User user) 
	{
		System.out.println("Name : " +user.getName());
		System.out.println("Email : " +user.getEmail());
		System.out.println("Phoneno : " +user.getPhoneno());
		
		
		
		return "profile";
		
	}
	

}
