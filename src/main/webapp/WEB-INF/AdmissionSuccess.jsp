<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>${headermsg}</h1>
<h1>Congrats ...form is submitted..Below is ur details</h1>
<table>
<tr>
<td>Student name:</td>
<td>${student.sname}</td>
</tr>
<tr>
<td>Student hobby:</td>
<td>${student.shobby}</td>
</tr>
<tr>
<td>Student mobile:</td>
<td>${student.mobile}</td>
</tr>
<tr>
<td>Student date of birth:</td>
<td>${student.dateofbirth}</td>
</tr>
<tr>
<td>Student country:</td>
<td>${student.studentaddress.country}</td>
</tr>
<tr>
<td>Student city:</td>
<td>${student.studentaddress.city}</td>
</tr>
<tr>
<td>Student street:</td>
<td>${student.studentaddress.street}</td>
</tr>
<tr>
<td>Student pincode:</td>
<td>${student.studentaddress.pincode}</td>
</tr>
</table>
</body>
</html>