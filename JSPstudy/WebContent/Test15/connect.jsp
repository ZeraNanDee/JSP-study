<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ page language="java" import="java.sql.*,java.io.*,java.util.*" %>
<%@ page language="java" import="com.mysql.jdbc.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
 <%  
 String name=request.getParameter("uname");
        //驱动程序名   
        String driverName = "com.mysql.jdbc.Driver";  
        //数据库用户名   
        String userName = "root";  
        //密码   
        String userPasswd = "";  
        //数据库名   
        String dbName = "jsp_db";  
        //表名   
        String tableName = "user";  
        //连接字符串   
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection=null;  
    	connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/jsp_db", "root", "");
    	Statement statement=(Statement) connection.createStatement();
        String sql = "select *from user where name='"+name+"' ";  //这个测试的最重要的问题，如何拼接sql和传递的用户名值 
        ResultSet rs = statement.executeQuery(sql);  
    %>  
       
    <table align="center">  
        <tr>  
            <th>  
                <%  
                    out.print("id");  
                %>  
            </th>  
            <th>  
                <%  
                    out.print("姓名");  
                %>  
            </th>  
            <th>  
                <%  
                    out.print("密码");  
                %>  
            </th>  
            <th>  
                <%  
                    out.print("邮箱");  
                %>  
            </th>  
        </tr>  
   
        <%  
            while (rs.next()) {  
        %>  
        <tr>  
            <td>  
                <%  
                    out.print(rs.getString(1));  
                %>  
            </td>  
            <td>  
                <%  
                    out.print(rs.getString(2));  
                %>  
            </td>  
            <td>  
                <%  
                    out.print(rs.getString(3));  
                %>  
            </td>  
            <td>  
                <%  
                    out.print(rs.getString(4));  
                %>  
            </td>  
        </tr>  
        <%  
            }  
        %>  
    </table>  
    <div align="center">  
             
        <%  
            out.print("数据查询成功，恭喜你");  
        %>  
    </div>  
    <%  
        rs.close();  
        statement.close();  
        connection.close();  
    %>  
</body>
</html>