package com.ZeraNanDee.test0;

import java.io.Serializable;

public class userEntity implements Serializable {

	private String username;
	private String password;

	public userEntity() {
		super();
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
