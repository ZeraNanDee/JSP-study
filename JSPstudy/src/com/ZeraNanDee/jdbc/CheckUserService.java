package com.ZeraNanDee.jdbc;

import java.sql.ResultSet;

import com.ZeraNanDee.dao.UserDao;
import com.ZeraNanDee.dao.impl.UserDaoimpl;
import com.ZeraNanDee.entity.User;
import com.ZeraNanDee.utill.ConnectionFactory;
import com.mysql.jdbc.Connection;

public class CheckUserService {
private UserDao userDao=new UserDaoimpl();


public boolean  check(User user) {//用于判断登录是否成功,查询语句如果和表单提交的相同return true，
	Connection connection=null;
	try {
		connection=ConnectionFactory.getInstance().makeConnection();
		connection.setAutoCommit(false);
		
		ResultSet resultSet=userDao.get(connection, user);
		while (resultSet.next()) {
			return true;
		}
	   connection.commit();
	} catch (Exception e) {
	 e.printStackTrace();
	 try {
		connection.rollback();
	} catch (Exception e2) {
		e2.printStackTrace();
	}
	}finally {
		try {
			connection.close();
		} catch (Exception e3) {
			e3.printStackTrace();
		}
	}
	return false;
}
}
