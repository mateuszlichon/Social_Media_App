<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@	taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Warsztat6 home</title>
</head>
<body>
<%@ include file = "jspf/header.jspf" %>
<%@ include file = "jspf/mainmenu.jspf" %>

<form:form method="post" modelAttribute="user">
<p>User Name<form:input path="userName" /></p>
<p>Email<form:input path="email" /></p>
<p>Password<form:input path="password" type="password" /></p>
<p><input type="submit" /></p>
<form:errors></form:errors>
</form:form>
<%@ include file = "jspf/footer.jspf" %>
</body>
</html>