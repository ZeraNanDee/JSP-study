<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@page buffer="100kb" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		out.println("jiagengxueyuan.com");//换行只有在代码有显示，浏览器看不到 
		out.println("<br/>");
		out.println("Zera");
		out.newLine();//同样代表换行
		out.println("<br/>");
		out.flush();//将缓冲区的内容强制输出到客户端浏览器 
		out.clearBuffer();//清空缓冲区的内容 
		out.println("获取当前缓冲区大小： "+out.getBufferSize());
		out.println("<br/>");
		out.println("获取缓冲区剩余字节数目：  "+out.getRemaining());
	%>
</body>
</html>