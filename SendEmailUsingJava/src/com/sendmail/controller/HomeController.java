package com.sendmail.controller;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class HomeController {
	
	@RequestMapping(value="/")
	public String EmailHome() {
		System.out.println("Controller called");
		return "EmailHome";
	}
	
	@RequestMapping(value="/SendMail",method=RequestMethod.POST)
	public String EmailSender(HttpServletRequest req,HttpSession session) throws AddressException, MessagingException
	 {
			String content="<!DOCTYPE html>\r\n" + 
					"<html lang=\"en\">\r\n" + 
					" <head>\r\n" + 
					"  <meta charset=\"UTF-8\">\r\n" + 
					"  <meta name=\"Generator\" content=\"EditPlus®\">\r\n" + 
					"  <meta name=\"Author\" content=\"\">\r\n" + 
					"  <meta name=\"Keywords\" content=\"\">\r\n" + 
					"  <meta name=\"Description\" content=\"\">\r\n" + 
					"  <link rel=\"stylesheet\" href=\"http://localhost:1000/SendEmailUsingJava/resources/css/bootstrap.min.css\" />"+
					"<title>Document</title>\r\n" + 
					" </head>\r\n" + 
					" <body>\r\n" + 
					"	\r\n" + 
					"\r\n" + 
					"<div class=\"jumbotron text-center\">\r\n" + 
					"  <h1 class=\"display-3\">Thank You For Registration!</h1>\r\n" + 
					"  <p class=\"lead\">Please check in to the place on time.</p>\r\n" + 
					"  <hr>\r\n" + 
					"  <p>\r\n" + 
					"    Having trouble? <a href=\"https://www.codeplanet.co.in/contact\">Contact us</a>\r\n" + 
					"  </p>\r\n" + 
					"  <p class=\"lead\">\r\n" + 
					"    <a class=\"btn btn-primary btn-sm\" href=\"http://www.google.com/calendar/event?action=TEMPLATE&text=Talent%20Search%20Exam&dates=20200822T160000/20200822T170000&details=Interns%20Hiring%20Program&location=Pratap%20Nagar%2C%20CodePlanet%20Technologies%2C%20Jaipur\\ role=\"button\">Add to Google Calendar</a>\r\n" + 
					"  </p>\r\n" + 
					"</div>\r\n" + 
					"\r\n" + 
					"\r\n" + 
					" </body>\r\n" + 
					"</html>";
			session.setAttribute("content", content);
			session.setMaxInactiveInterval(120);
			String to=req.getParameter("username");
			sendMail ss=new sendMail();
			return ss.emailUnlock(to,"SendersEmail", content);
		}
}
