<%@page import="org.apache.jasper.tagplugins.jstl.core.If"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>欢迎页面</title>
</head>
<body>
<%--以下if else的<%%>这么写的原因是因为那里面只能识别JAVA代码，而如果添加静态文本就会报错，所以看懂看就不会别扭了 --%>
	<%
		if (session.getAttribute("username") != null) {
	%>
	欢迎：<%=session.getAttribute("username")%>
	<a href="logout.jsp"><button>注销</button></a>
	<br>
	<%
		} else {
	%>
     请先登录：
     <a href="login.jsp"><button>登录</button></a>
	<%
		}
	%>
	<%--isNew()是用来判断session是否是新创建的 --%>
	<%if(session.isNew()){ %>
	<br>欢迎新用户
	<%}else{ %>
	<br>欢迎老用户
	<%} %>
</body>
</html>