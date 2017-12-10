package com.ZeraNanDee.jdbc;

import java.sql.DriverManager;
import java.sql.ResultSet;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class JDBCtest {// 数据库的连接操作在配置JAVA文件src中写，配置的文件可以直接被JSP调用
	public static Connection getConnection() {//用于连接数据库
		Connection connection=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/jsp_db", "root", "");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return connection;//返回静态的connection方法
	}
	
	public static void insert() {//插入数据（增）
		Connection connection=getConnection();//获取一个数据库连接
		try {
			String sql="insert into user(name,password,email)"+"values('tom','shac123','391445@qq.com')";
			Statement statement=(Statement) connection.createStatement();
			int count=statement.executeUpdate(sql);//用statement的这个方法来返回刚刚插入的更新sql语句
			System.out.println("向用户表中插入了"+count+"条语句");
			connection.close();//关闭数据库连接
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void update() {//更改数据（改）
		Connection connection=getConnection();//获取一个数据库连接
		try {
			String sql1="update user set name='fucker' where id=3";
			Statement statement=(Statement) connection.createStatement();
			int count=statement.executeUpdate(sql1);//用statement的这个方法来返回刚刚插入的更新sql语句
			String sql2="select *from user";
			ResultSet resultSet=statement.executeQuery(sql2);
			System.out.println("向用户表中更新了"+count+"条语句");
			while (resultSet.next()) {
				System.out.print(resultSet.getInt("id")+" ");
				System.out.print(resultSet.getString("name")+" ");
				System.out.print(resultSet.getString("password")+" ");
				System.out.print(resultSet.getString("email")+" ");
				System.out.println();
			}
			resultSet.close();
			statement.close();
			connection.close();//关闭数据库连接
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void delete() {
		Connection connection=getConnection();//获取一个数据库连接
		try {
			String sql="delete from user where name='xiaomng'";
			Statement statement=(Statement) connection.createStatement();// 用于在已经建立数据库连接的基础上，向数据库发送要执行的SQL语句
			int count=statement.executeUpdate(sql);//用statement的这个方法来返回刚刚插入的更新sql语句
			System.out.println("向用户表中删除了"+count+"条语句");
			connection.close();//关闭数据库连接
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void select() {
		Connection connection=getConnection();//获取一个数据库连接
		try {
			String sql="select *from user where name='xiaoming'";
			Statement statement=(Statement) connection.createStatement();// 用于在已经建立数据库连接的基础上，向数据库发送要执行的SQL语句
			ResultSet resultSet=statement.executeQuery(sql);
			while (resultSet.next()) {
				System.out.print(resultSet.getInt("id")+" ");
				System.out.print(resultSet.getString("name")+" ");
				System.out.println();
			}
			resultSet.close();
			statement.close();
			connection.close();//关闭数据库连接
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public static void main(String[] args) {
		//insert();
		//update();
 		//delete();
		//select();
		
		
		
		
		
		
		
		
		
//		public static void main(String[] args) {//查询语句（查）
//		String sql = "select *from user";
//		Connection connection = null;
//		Statement statement = null;
//		ResultSet resultSet = null;
//
//		try {
//			Class.forName("com.mysql.jdbc.Driver");// 封装到JVM的编译上,参数的字符串的jdbc的驱动程序
//			connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/jsp_db", "root", "");// 连接数据库
//			statement = (Statement) connection.createStatement();// 用于在已经建立数据库连接的基础上，向数据库发送要执行的SQL语句
//			resultSet = statement.executeQuery(sql);// 此对象用来返回sql语句
//			while (resultSet.next()) {// 直接进入循环
//				System.out.print(resultSet.getInt("id") + "  ");
//				System.out.print(resultSet.getString("name") + "  ");
//				System.out.print(resultSet.getString("password") + "  ");
//				System.out.print(resultSet.getString("email") + "  ");
//				System.out.println();
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				resultSet.close();
//			} catch (Exception e2) {
//			}
//			try {
//				statement.close();
//			} catch (Exception e3) {
//			}
//			try {
//				connection.close();
//			} catch (Exception e4) {
//			}
//		}
//	}
	}
}
