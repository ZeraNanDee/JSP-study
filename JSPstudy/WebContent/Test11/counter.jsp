<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>页面访问计数器</title>
</head>
<body>
	<%
		Object object = application.getAttribute("counter");//在不知道数据类型的情况下都是用Object类型声明，他可以分配任何引用类型 
		if (object == null) {
			application.setAttribute("counter", new Integer(1));
			out.println("页面被访问了一次<br> ");
		} else {
			int countervalue = Integer.parseInt(object.toString());
			countervalue++;
			out.println("页面被访问了" + countervalue + "次<br>");
			application.setAttribute("counter", countervalue);//保存到application
		}
	%>
</body>
</html>