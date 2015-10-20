<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Registration</title>
<style type="text/css">

</style>

<script>
	function UserReg() {
         alert("Hiiiii")
		document.userRegBean.action = "saveUserReg.htm";
		document.userRegBean.method = "POST";
		document.userRegBean.submit();
	}
</script>
</head>
<body>
	<pre>
	<form:form name="userRegBean"
		commandName="userRegBean">

First Name	:	<input type="text" placeholder="Example - Dheeraj"
				name="fname" /></br>
Middle Name	: 	<input type="text" placeholder="Example - Kumar"
				name="mname" /></br>
Last Name	: 	<input type="text" placeholder="Example - Roy" name="lname" /></br>
Date Of Birth	: 	<input type="text" placeholder="Example - 10-Mar-1991"
				name="dob" /></br>
Email-Id	:	<input type="text" placeholder="mr.dheeraj@gmail.com"
				name="email"></br>
Password	:	<input type="password" placeholder="**************"
				name="pass" /></br>
Select Id	:	<input type="file" placeholder="Browse File" name="id" /></br>
Address		:	<textarea rows="2" cols="15" name="address"></textarea>
			</br>
Pin Code	:	<input type="text" placeholder="851101" name="pin" /></br>
Country		:	<select name=country id="country">
                   <option value="">Select Country</option>
                   <option value="1">India</option>
                   <option value="2">US</option>
                   <option value="3">UK</option>
                   <option value="4">Russia</option>
                   <option value="5">French</option>
                </select></br>
State		:	<select name=state id="state">
                   <option value="">Select State</option>
                   <option value="1">Uttar Pradesh</option>
                   <option value="2">Bihar</option>
                   <option value="3">Orissa</option>
                   <option value="4">Andhra Pradesh</option>
                   <option value="5">Delhi</option>
                </select>
                </br>
City		:	<select name=city id="city">
                   <option value="">Select City</option>
                   <option value="1">Hyderabad</option>
                   <option value="2">Lucknow</option>
                   <option value="3">Patna</option>
                   <option value="4">Bhuneshwar</option>
                   <option value="5">Delhi</option>
                </select>
                <br>
<input type="submit" name="submit" value="Sign Up" onclick="UserReg()" />        <input
				type="reset" name="submit" value="Clear" />
</form:form>
</pre>


</body>
</html>