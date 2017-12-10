package com.ZeraNanDee.Test;
import java.sql.SQLException;

import com.ZeraNanDee.utill.ConnectionFactory;
import com.mysql.jdbc.Connection;
public class ConnectionFactoryTest {//这个导入了刚才自己配置的JDBC优化包，这样一来就可以直接调用那个类来构造数据库连接，
	//使得连接更加优化方便。
//用来测试配置文件ConnectionFactory所创建的类
	public static void main(String[] args) throws SQLException {
	ConnectionFactory cf=ConnectionFactory.getInstance();
	Connection connection= cf.makeConnection();
	System.out.println(connection.getAutoCommit());//用来查看提交事务是否成功
	}

}
