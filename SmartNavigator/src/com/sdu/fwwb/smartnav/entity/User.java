package com.sdu.fwwb.smartnav.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="sn_user")
public class User implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -2706351076671946316L;
	private long id;
	private String userName;
	private String email;
	private String password;
	private String avatar;
	private String sex;
	
	public User(){}
	
	public User(long id, String userName, String email, String password,
			String avatar, String sex) {
		super();
		this.id = id;
		this.userName = userName;
		this.email = email;
		this.password = password;
		this.avatar = avatar;
		this.sex = sex;
	}

	public User(String userName, String email, String password,
			String avatar, String sex) {
		this.userName = userName;
		this.email = email;
		this.password = password;
		this.avatar = avatar;
		this.sex = sex;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="user_id")
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	@Column(name="user_name")
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	@Column(name="user_email")
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Column(name="user_pw")
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Column(name="user_avatar")
	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	@Column(name="user_sex")
	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", email=" + email
				+ ", password=" + password + ", avatar=" + avatar + ", sex="
				+ sex + "]";
	}

	
}
