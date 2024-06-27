package com.StayMate.spec.main.login;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Login_Entity {
	@Id
	private String name;
	private String Password;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public Login_Entity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Login_Entity(String name, String password) {
		super();
		this.name = name;
		Password = password;
	}
	

}
