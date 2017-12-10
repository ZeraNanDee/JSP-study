<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page  import="java.util.ArrayList" %>//导入JAVA包
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>This is my first real web</title>
</head>
<body>
声明的变量 ：<%="hello world"%>
<br/>
<%
    String str="hello world";//声明的是全局变量
   out.println(str);
    ArrayList arrayList=new  ArrayList();
    arrayList.add(1);
    arrayList.add(2);
%>
</body>
</html>