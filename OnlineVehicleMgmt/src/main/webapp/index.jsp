<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<script type="text/javascript">
function loginForm() {
         alert("Helloooo")
		document.loginform.action = "userReg.htm";
		document.loginform.method = "GET";
		document.loginform.submit();
	}
</script>
</head>
<body onload="loginForm()">

 <a href="userReg.htm">Click here</a>
<form:form name="loginform" commandName="userRegBean"></form:form>
</body>
</html>
