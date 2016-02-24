package com.spring.controller;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class StudentEntry {
@RequestMapping(value="/StudentDemo.html",method= RequestMethod.GET)
public ModelAndView getStudentForm()
{
	ModelAndView obj=new ModelAndView("StudentDemo");
	return obj;
}
@Autowired
DataSource datasource;
@RequestMapping(value="/submitStudent.html",method= RequestMethod.POST)

	public ModelAndView submitFormInDatabase(@ModelAttribute("student") Student student)
	{
		String sql="insert into student(name,age,gender)values(?,?,?)";
		JdbcTemplate jdbctemp=new JdbcTemplate(datasource);
		jdbctemp.update(sql,new Object[]{student.getName(),student.getAge(),student.getGender()});
		ModelAndView mdv=new ModelAndView("SuccessPage");
		mdv.addObject("msg","SUCCESSFULL");
		return mdv;
		
	}
}

