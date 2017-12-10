package com.ZeraNanDee.dao;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.ZeraNanDee.entity.User;//这个只是接口，所以要具体另外写出实现

public interface UserDao {//此接口用于数据库的增删改查
	
public void save(Connection connection,User user) throws SQLException;

public void update(Connection connection,Long id,User user)throws SQLException; 

public void delete(Connection connection,User user)throws SQLException; 

public ResultSet get(Connection connection,User user)throws SQLException;
}
