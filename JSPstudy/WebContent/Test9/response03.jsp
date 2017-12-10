<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>response用于cookie</title>
</head>
<body>
	<%
		Cookie mycookie = new Cookie("Name", "NanDee");//参数1表示Cookie的用户对象 ，参数2是对应的值
		mycookie.setMaxAge(3600);//设置过期时间 单位是秒 
		response.addCookie(mycookie);
	%>
</body>
</html>