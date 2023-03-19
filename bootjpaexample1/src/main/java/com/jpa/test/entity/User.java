package com.jpa.test.entity;

import javax.persistence.*;

@Entity
@Table(name = "user_table")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long userId;

	@Column(name = "user_name")
	private String userName;

	@Column(name = "user_city")
	private String userCity;

	@Column(name = "user_status")
	private String userStatus;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
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

	public String getUserCity() {
		return userCity;
	}

	public void setUserCity(String userCity) {
		this.userCity = userCity;
	}

	public String getUserStatus() {
		return userStatus;
	}

	public void setUserStatus(String userStatus) {
		this.userStatus = userStatus;
	}

	public User(Long userId, String userName, String userCity, String userStatus) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userCity = userCity;
		this.userStatus = userStatus;
	}



	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userCity=" + userCity + ", userStatus="
				+ userStatus + "]";
	}

}
