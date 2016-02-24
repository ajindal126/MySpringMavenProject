<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:errors path="student.*"/> <!-- include taglib also above -->
<form method="post" action="/MySpringMavenProject/submitForm.html">
<p>
Student's Name:<input type="text" name="sname" />
</p>
<p>
Student's Hobby:<input type="text" name="shobby" />
</p>
Student's mobile:<input type="text" name="mobile" />
<p>
Student's DOB:<input type="text" name="dateofbirth" />
</p>
<p>
Student's country:<input type="text" name="studentaddress.country" />
</p>
<p>
Student's city:<input type="text" name="studentaddress.city" />
</p>
<p>
Student's street:<input type="text" name="studentaddress.street" />
</p>
<p>
Student's pincode:<input type="text" name="studentaddress.pincode" />
</p>
<input type="submit" value="submit" />
</form>
</body>
</html>