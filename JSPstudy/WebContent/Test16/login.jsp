<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>login->servlet->JDBC->mysql</title>
<%--这个Test用于登录,验证数据库里是否有此用户，返回登录成功或者失败 --%>
<%--这个Test16相当于，项目规范版本的用户登录实例,通过JSP提交表单到servlet类中通过与mysql判断成功和失败返回不同的页面，同时也需要配置web-xml--%>
<script type="text/javascript">
function check(form) {
	if (document.forms.form1.uname.value=="") {
		alert("请输入用户名");
		document.forms.form1.uname.focus();
		return false;
	}
	if (document.forms.form1.upwd.value=="") {
		alert("请输入密码");
		document.forms.form1.upwd.focus();
		return false;
	}
}
</script>
</head>
<body>
	<form action="<%=request.getContextPath() %>/CheckServlet" method="post" name="form1">
		<table border="1" cellpadding="5" cellspacing="0" bordercolor="silver"
			align="center">
			<tr>
				<td colspan="2" align="center" bgcolor="#E8E8E8">用户登录</td>
			</tr>
			<tr>
				<td>用户名：</td>
				<td><input type="text" name="uname" id="uname"></td>
			</tr>
			<tr>
				<td>密码：</td>
				<td><input type="password" name="upwd" id="upwd"></td>
			</tr>
			<tr>
				<td colspan="2" align="center">
				<input type="submit" name="submit" onclick="return check(this);"/> 
				<input type="reset" name="reset"/> 
				</td>
			</tr>
		</table>
	</form>
</body>
</html>