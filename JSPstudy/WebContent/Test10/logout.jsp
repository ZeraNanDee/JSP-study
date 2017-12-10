<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
session.invalidate();//干掉session对象,会清除的很彻底 ，相当于 清除 刷新  
response.setHeader("refresh", "2;URL=welcome.jsp");//刷新页面，实现 注销
%>