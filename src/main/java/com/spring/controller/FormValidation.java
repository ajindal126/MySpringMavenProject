package com.spring.controller;
//import java.util.Map;

import java.sql.Date;
import java.text.SimpleDateFormat;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FormValidation {
	@InitBinder
	void initBinder(WebDataBinder binder)
	{
	//	binder.setDisallowedFields(new String[] {"mobile"}); //write this at top of alll functions in class
		SimpleDateFormat dateformat=new SimpleDateFormat("yyyy***MM***dd");
		binder.registerCustomEditor(Date.class,"dateofbirth",new CustomDateEditor(dateformat,false)); // typeconversion with data binding
	}
@RequestMapping(value="/admissionForm.html",method= RequestMethod.GET)
public ModelAndView getAdmissionForm()
{
	ModelAndView obj=new ModelAndView("AdmissionForm");
	return obj;
}
  
@RequestMapping(value="/submitForm.html", method= RequestMethod.POST)
public ModelAndView submitAdmissionForm(/*@RequestParam Map<String,String> values*/@Valid @ModelAttribute("student") StudentInfo student, BindingResult results)
{
	//String name=values.get("sname");
	//String hobby=values.get("shobby");
	
	//StudentInfo student=new StudentInfo();
	//student.setName(name);
	//student.setHobby(hobby);
	if(results.hasErrors())
	{
		ModelAndView model=new ModelAndView("AdmissionForm"); // to use this we use form-errors tag in jsp page.. which will print tha errors of binding
		return model;
	}
	ModelAndView model=new ModelAndView("AdmissionSuccess");
/*	model.addObject("msg","Student name is:"+name+" , My hobby is//:"+hobby);*/
	model.addObject("headermsg","Welcome to JUET");
	//model.addObject("student1",student);
	return model;
}
	
	
}
