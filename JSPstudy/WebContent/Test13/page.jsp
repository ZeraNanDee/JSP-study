<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>page对象实例</title>
</head>
<body>
	<%
		out.println("page对象的字符串：" + page.toString());
	    out.println(page.getClass());//返回当前类 
	    out.println(page.hashCode());//返回page对象的哈希code值
	%>
</body>
</html>