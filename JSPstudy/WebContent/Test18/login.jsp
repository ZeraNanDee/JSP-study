<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>login->servlet->JDBC->mysql</title>
<%--这是实现了用户成功登录后，用session传值跟踪代表登录成功，可以选择退出重新登录 --%>
<%--同时在登录页面上，如果用户没有先登录，就用过滤器拦截点击hello.jsp--%>
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
	<form action="<%=request.getContextPath() %>/LoginServlet18" method="post" name="form1">
<%if(request.getAttribute("return_uri")!=null) {%>
	<input type="hidden" name="return_uri" id="return_uri" value="<%=request.getAttribute("return_uri")%>">
	<%}%> 
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