<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>展示页面</title>
</head>
<body>
<%--这里的welcome用于post输出表单信息,需要另外创建JSP--%>
<%--<% =（变量）是<% 里面out.println（变量）的简写方式--%>
用户名：<%=request.getAttribute("userName") %><br>
技能：<%=request.getAttribute("skills") %>
</body>
</html>