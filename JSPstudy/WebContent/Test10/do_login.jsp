<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String username = request.getParameter("username");
	String password = request.getParameter("password");
	if (username != null && password != null) {
     session.setAttribute("username", username);
     response.setHeader("refresh", "2;URL=welcome.jsp");//设置服务器响应数据后即直接跳转到welcome页面
	}
%>