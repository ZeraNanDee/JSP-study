package com.ZeraNanDee.utill;

import java.io.InputStream;
import java.io.Reader;
import java.sql.DriverManager;
import java.util.Properties;

import com.mysql.jdbc.Connection;

//相当于配置好的文件，可以用这个类读取property文件，而不用再JAVA文件中每次都重新写,连接数据库获取数据库内容
public class ConnectionFactory {// JDBC的优化
	private static String driver;
	private static String dburl;
	private static String user;
	private static String password;
	private static final ConnectionFactory FACTORY = new ConnectionFactory();// 定义唯一静态方法,用于连接数据库
	private Connection connection;
	static {// 静态方法块会直接被调用
		Properties properties = new Properties();// 用于处理属性文件中的键值对，很方便
		try {
			InputStream in = ConnectionFactory.class.getClassLoader()
					.getResourceAsStream("dbconfig.properties");// 读取输入流属性文件的内容
			properties.load(in);// 从输入流中读取属性列表
		} catch (Exception e) {
			System.out.println("=========文件配置错误========");
			e.printStackTrace();
		}
		driver = properties.getProperty("driver");// 从property文件中获取的数据赋值给上面的变量
		dburl = properties.getProperty("dburl");
		user = properties.getProperty("user");
		password = properties.getProperty("password");

	}

	private ConnectionFactory() {
	}

	public static ConnectionFactory getInstance() {
		return FACTORY;// 保证只有一个ConnectionFactory实例变量

	}
	public Connection makeConnection() {//连接数据库
		try {
			Class.forName(driver);
			connection=(Connection) DriverManager.getConnection(dburl,user,password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return  connection;
	}
}
