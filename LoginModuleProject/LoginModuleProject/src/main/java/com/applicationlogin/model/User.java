package com.applicationlogin.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="login_detail")
public class User {
	
	@Id
	@Column(name="userid")
	private Long userId;
	
	@Column(name="username")
	private String userName;
	
	@Column(name="password")
	private Long password;
	
	

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}



	public User(Long userId, String userName, Long password) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.password = password;
	}



	public Long getUserId() {
		return userId;
	}



	public void setUserId(Long userId) {
		this.userId = userId;
	}



	public String getUserName() {
		return userName;
	}



	public void setUserName(String userName) {
		this.userName = userName;
	}



	public Long getPassword() {
		return password;
	}



	public void setPassword(Long password) {
		this.password = password;
	}



	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", password=" + password + "]";
	}

	
}
