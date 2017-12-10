<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>录入表单信息</title>
</head>
<body>
	<form action="do_register.jsp" method="post">
		用户名：<input type="text" name="userName" id="userName"><br>
		技能：<input type="checkbox" id="skills" name="skills" value="java">java <br>
		<input type="checkbox" id="skills"  name="skills" value="python"> python<br>
		<input type="checkbox" id="skills"  name="skills" value="php">php<br>
		<input type="checkbox" id="skills"  name="skills" value="c++">c++ <br>
		<input type="submit" value="确定"> <input type="reset"
			value="重选">
	</form>
</body>
</html>