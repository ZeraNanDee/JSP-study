<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>response</title>
</head>
<body>
	<%
		response.setHeader("Cache-Control", "no-cache");//设置无cache缓存 
	    response.setIntHeader("Refresh",2);//设置每两秒网页刷新一次 
	    out.println("data is"+new Date().toString()+"<br>");//显示信息 
	%>
</body>
</html>