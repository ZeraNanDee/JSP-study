<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<jsp:include page="head.html"></jsp:include>
<jsp:include page="body.jsp">
<jsp:param value="red" name="bgcolor"/>
</jsp:include>
这是一个动态包含的指令，和@include指令不同,编译指令不会启作用，@include是静态导入，使得编译指令起作用
</html>