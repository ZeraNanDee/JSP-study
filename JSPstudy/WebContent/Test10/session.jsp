<%@page import="java.util.Date"%>
<%@page import="org.apache.naming.java.javaURLContextFactory"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>session实例</title>
</head>
<body>
<%--服务器用于跟踪客户端的用户ID，一个seesion标识符用于记录客户端当前浏览了数据被服务器跟踪并将数据保存 --%>
session的唯一标识符：<%=session.getId() %><br>
session的创建时间：<%=new Date (session.getCreationTime()).toString()%><br>
session的最后访问时间：<%=new Date(session.getLastAccessedTime()).toString() %><br>
session的实效时间（单位为秒）：<%=session.getMaxInactiveInterval() %><br>

</body>
</html>