package com.ZeraNanDee.jdbc;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class transactiomTest {// JDBC的事务处理,统一性的管理数据,这样会有利于数据更安全的更改，例如如果插入多条数据时某条数据出错，
	// 那么所有数据都无法插入，这样就保证了数据的一致性，这就是JDBC的事务处理（一组业务整体处理）
	public static Connection getConnection() {// 用于连接数据库
		Connection connection = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/jsp_db", "root", "");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return connection;// 返回静态的connection方法
	}

	public static void insertUser(Connection connection) throws SQLException {
		String sql = "insert into user(id,name,password,email)" + "values(8,'ket','shdkv111','24235211@qq.com')";
		Statement statement = (Statement) connection.createStatement();
		int count = statement.executeUpdate(sql);
		System.out.println("向用户表插入了" + count + "条记录");

	}

	public static void insertAddress(Connection connection) throws SQLException {
		String sql = "insert into address(id,city,country,user_id)" + "values(1,'lanzhou','China','8')";
		Statement statement = (Statement) connection.createStatement();
		int count = statement.executeUpdate(sql);
		System.out.println("向地址表插入了" + count + "条记录");

	}
public static void main(String[] args) {
	Connection connection=null;
	try {
		connection=getConnection();
		connection.setAutoCommit(false);//判断事务提交，false代表设置connection使他不能自动连接提交
		insertUser(connection);
		insertAddress(connection);
		connection.commit();//将上面的方法作为一次事务提交
	} catch (Exception e) {
		System.out.println("捕获到SQL的异常");
		e.printStackTrace();
		try {
			connection.rollback();//事务的回滚,用来撤销之前的操作,滚回
			System.out.println("事务回滚成功");
		} catch (Exception e2) {
			e2.printStackTrace();
		}
	}finally {//资源清理,关闭connection
		try {
			if (connection!=null) {
				connection.close();
			}
		} catch ( Exception e3) {
			e3.printStackTrace();
		}
	}
}
}
