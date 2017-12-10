<%@page import="com.ZeraNanDee.servlet.HelloServlet"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>首页</title>
</head>
<body>
首页
<br>
<br>
<p><a href="<%=request.getContextPath()%>/Test18/Hello.jsp ">hello.jsp</a></p>
<%
String flag="";
Object object=session.getAttribute("flag");
if(object!=null)
{
	flag=object.toString();
}
if(flag.equals("Login_success"))//如果当前用户是登录状态就显示一个退出的链接，如果是未登录状态就显示一个登录 
{%>
<a href="<%=request.getContextPath()%>/LogoutServlet18">退出</a>
	<% }else{ %>
	<a href="<%=request.getContextPath()%>/Test18/login.jsp">登录</a>
<% }%>
</body>
</html>