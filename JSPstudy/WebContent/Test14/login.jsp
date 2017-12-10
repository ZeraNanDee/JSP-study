<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录页面-->传递到类文件loginServlet.java进行处理</title>
</head>
<body>
<%--此Test是将login.jsp传递给tomcat服务器用loginservlet.做处理，最后打印到eclipse当中 --%>
<%--get和post的区别是get用于获取数据（不对服务器修改内容）,post用于提交数据（对服务器内容修改）
post方法提交时如果服务器返回给客户端别的页面不会显示用户名和密码，而get会从服务器获取数据并显示数据， 
--%>
	<form action="<%=request.getContextPath() %>/loginServlet" method="post">
		username;<input type="text" name="uname" id="uname"><br>
		password:<input type="password" name="upwd" id="upwd"><br>
		<input type="submit" value="提交"> <input type="reset"
			value="重填">
	</form>
</body>
</html>