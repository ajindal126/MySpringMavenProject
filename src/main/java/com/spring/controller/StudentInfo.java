package com.spring.controller;

import java.util.Date;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

public class StudentInfo {
	Address studentaddress;
	public Address getStudentaddress() {
		return studentaddress;
	}
	public void setStudentaddress(Address studentaddress) {
		this.studentaddress = studentaddress;
	}
	/*String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	String hobby;
*/	
	@NotEmpty @Pattern(regexp="[^0-9]*")
	String sname;
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getShobby() {
		return shobby;
	}
	public void setShobby(String shobby) {
		this.shobby = shobby;
	}
	@NotEmpty @Size(min=2,max=30/*, message="Please provide student hobby between {min} and {max} characters"*/) //we can use write {min} instead of 2   //instead all this use student message .properties file.
	String shobby;
	@NotNull @Max(2224) //to chck value not greater than 2224....simalr is@Min-to chck value not smaller than this
	long mobile;
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public Date getDateofbirth() {
		return dateofbirth;
	}
	public void setDateofbirth(Date dateofbirth) {
		this.dateofbirth = dateofbirth;
	}
	@Past //used so that user cant put date greater than today's date
	Date dateofbirth; //date  is typecasted from string to date itself when we use model atribute
	//user defined type... model att is applicable for this also
	
}
