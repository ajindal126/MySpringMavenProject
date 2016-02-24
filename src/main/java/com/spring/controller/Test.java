package com.spring.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {  
		    ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationdao.xml");  
		      
		    StudentDao dao=(StudentDao)ctx.getBean("edao");
		    Student st=new Student();
		    st.setName("Akshit");
		    st.setAge(21);
		    st.setGender("Male");
		    int status=dao.saveStudent(st);  
		    System.out.println(status);  

	}

}
