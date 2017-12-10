package com.ZeraNanDee.entity;

public class User extends idEntity {//DTO类,这就是用来继承idEmtity类,让每个用户有ID，最后需要有他toString来表达
	private String name;
	private String password;
	private String email;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", password=" + password + ", email=" + email + ", id=" + id + "]";
	}

}
