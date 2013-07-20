package com.sdu.fwwb.smartnav.admin.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="sn_admin")
public class Admin implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -2706351076671946316L;
	private long id;
	private String name;
	private String email;
	private String password;
	
	public Admin(){}
	
	public Admin(String name, String email, String password) {
		this.name = name;
		this.email = email;
		this.password = password;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="admin_id")
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	@Column(name="admin_email")
	public String getEmail() {
		return email;
	}
	
	@Column(name="admin_name")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	@Column(name="admin_pw")
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "admin [id=" + id + ", name=" + name + ", email=" + email
				+ ", password=" + password + "]";
	}
	
	
}
