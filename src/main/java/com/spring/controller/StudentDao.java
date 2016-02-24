package com.spring.controller;

import org.springframework.jdbc.core.JdbcTemplate;

public class StudentDao {
	private JdbcTemplate jdbcTemplate;  
	  
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {  
	    this.jdbcTemplate = jdbcTemplate;  
	}  
	  
	public int saveStudent(Student e){  
	    String query="insert into student values('"+e.getName()+"','"+e.getAge()+"','"+e.getGender()+"')";  
	    return jdbcTemplate.update(query);  
	}  
/*	public int updateEmployee(Employee e){  
	    String query="update employee set   
	    name='"+e.getName()+"',salary='"+e.getSalary()+"' where id='"+e.getId()+"' ";  
	    return jdbcTemplate.update(query);  
	}  
	public int deleteEmployee(Employee e){  
	    String query="delete from employee where id='"+e.getId()+"' ";  
	    return jdbcTemplate.update(query);  
	}  
*/	  
}
