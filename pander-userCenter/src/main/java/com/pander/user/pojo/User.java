package com.pander.user.pojo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "tb_user")
public class User {

	@Id
	@Column(name="id")
	private Long userId;

	/**
	 * 用户名
	 */
	@Column(name="username")
	private String username;

	/**
	 * 密码
	 */
	@Column(name="password")
	private String password;

	/**
	 * 电话
	 */
	@Column(name="phone")
	private String phone;

	/**
	 * 创建时间
	 */
	@Column(name="created")
	private Date created;

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", username=" + username + ", password=" + password + ", phone=" + phone
				+ ", created=" + created + "]";
	}
	
	

}
