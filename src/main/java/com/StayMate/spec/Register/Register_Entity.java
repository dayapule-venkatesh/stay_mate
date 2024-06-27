package com.StayMate.spec.Register;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Register_Entity {
	
 private String name;
 @Id
 private String email;
 private String password;
 public Register_Entity(String name, String email, String password, String repeat_password) {
	super();
	this.name = name;
	this.email = email;
	this.password = password;
	this.repeat_password = repeat_password;
}
public Register_Entity() {
	super();
	// TODO Auto-generated constructor stub
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getRepeat_password() {
	return repeat_password;
}
public void setRepeat_password(String repeat_password) {
	this.repeat_password = repeat_password;
}
private String repeat_password;
}
