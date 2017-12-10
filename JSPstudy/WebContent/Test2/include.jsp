<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>include method</title>
</head>
<body>
<%@include file ="cool.html" %>//用于导入html,jsp各种文件，此JSP相当于包含了footer.jsp和cool.html
<br/>
<%@include file="footer.jsp" %>
</body>
</html>