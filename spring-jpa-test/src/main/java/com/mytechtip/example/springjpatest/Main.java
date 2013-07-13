package com.mytechtip.example.springjpatest;

import java.util.Calendar;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("beans.xml");
		
		UserDao dao = context.getBean(UserDao.class);
		
		User u = new User();
		u.setAddress("my address");
		u.setName("John Smith II");
		
		Calendar cal = Calendar.getInstance();
		cal.set(2001, 0, 1);
		u.setDob(cal.getTime());
		
		dao.save(u);
		
		List<User> list = dao.getNameStartsWith("J");
		for (User user : list) {
			System.out.println(u.getName());
		}
		context.close();
	}
}
