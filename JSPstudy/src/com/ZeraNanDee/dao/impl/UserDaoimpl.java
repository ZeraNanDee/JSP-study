package com.ZeraNanDee.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.ZeraNanDee.dao.UserDao;
import com.ZeraNanDee.entity.User;

public class UserDaoimpl implements UserDao {

	@Override//用来保存用户的信息
	public void save(Connection connection, User user) throws SQLException {
		PreparedStatement preparedStatement = connection
				.prepareCall("insert into user(name,password,email) values(?,?,?)");// JDBC用来执行参数化查询,？？？代表具体的值
		preparedStatement.setString(1, user.getName());// 第一个参数是索引
		preparedStatement.setString(2, user.getPassword());
		preparedStatement.setString(3, user.getEmail());
		preparedStatement.execute();// boolean型 判断是否插入成功。
	}

	@Override//根据用户指定的ID来更新信息
	public void update(Connection connection, Long id, User user) throws SQLException {
		String updatesql = "update user set name=?,password=?,email=? where id=?";
		PreparedStatement preparedStatement = connection.prepareStatement(updatesql);
		preparedStatement.setString(1, user.getName());
		preparedStatement.setString(2, user.getPassword());
		preparedStatement.setString(3, user.getEmail());
		preparedStatement.setLong(4,id);
		preparedStatement.execute();// boolean型 判断是否更新成功。
	}

	@Override//用于删除指定的用户信息
	public void delete(Connection connection, User user) throws SQLException {
		PreparedStatement preparedStatement = connection.prepareStatement("delete from user where id=?");
		preparedStatement.setLong(1, user.getId());
		preparedStatement.execute();
	}

	@Override//用于查询用户信息
	public ResultSet get(Connection connection, User user) throws SQLException {
		PreparedStatement preparedStatement=connection.prepareStatement("select *from user where name=? AND password=?");
	  preparedStatement.setString(1, user.getName());
	  preparedStatement.setString(2, user.getPassword());
		return preparedStatement.executeQuery();//用于查询的方法，只限于查询,判断
	}

}
