<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%--这里的do_register.jsp用于处理表单信息--%>
<%

String name=request.getParameter("userName");
String skills="";
String[] skillArr=request.getParameterValues("skills"); 
if(skillArr!=null&&skillArr.length>0)
{
	for(String skill:skillArr)
	{
		skills=skills+skill+'\n';
	}
}
request.setAttribute("userName", name);//设置分配的值 
request.setAttribute("skills", skills);

%>
<jsp:forward page="welcome.jsp"></jsp:forward>>
