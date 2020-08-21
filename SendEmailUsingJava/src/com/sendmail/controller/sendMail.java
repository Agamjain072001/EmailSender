package com.sendmail.controller;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class sendMail {
	Session session=null;
	public  sendMail() throws AddressException, MessagingException {
		Properties p= new Properties();
		p.put("mail.smtp.host", "smtp.gmail.com");
		p.put("mail.smtp.auth", "true");
		p.put("mail.smtp.starttls.enable", "true");
		p.put("mail.smtp.EnableSSL.enable", "true");
		p.put("mail.smtp.socketFactory.class",
				"javax.net.ssl.SSLSocketFactory");
		p.put("mail.smtp.socketFactory.fallback", "false");
		p.put("mail.smtp.port", "465");
		p.put("mail.smtp.socketFactory.port", "465");
        session=Session.getInstance(p, new SimpleAuthenticator("SendersEmail","SendersPassword"));
	}
	public String emailUnlock(String to, String from, String content) throws AddressException, MessagingException {			
		Message msg=new MimeMessage(session);
		msg.setFrom(new InternetAddress(from));
		msg.setRecipient(Message.RecipientType.TO, new InternetAddress(to));
		msg.setSubject("Email sending application");
		msg.setContent(content, "text/html");	
		Transport.send(msg);
		return  "ThankYou";
	}
}
