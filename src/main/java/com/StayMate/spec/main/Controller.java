package com.StayMate.spec.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.StayMate.spec.Register.Register_Entity;

import com.StayMate.spec.Register.Register_Service;
import com.StayMate.spec.main.login.Login_Entity;
import com.StayMate.spec.main.login.Login_Service;
@CrossOrigin("*")
@RestController
public class Controller {
	@Autowired
	Register_Service RService;
	Login_Service lgService;
	
	
	
	//Login_form
	@PostMapping("/add")
	public Login_Entity addUser(@RequestBody Login_Entity lgUser) {
		
		
		return lgService.addNewUser(lgUser);
		
	}
	
	//Register_form
	@GetMapping("/login")
	public String checkLogin(@RequestParam String name,String password) {
		
		return lgService.checkIsValidUser(name,password);
		
		//return "";
	}
	

	@PostMapping("/register/add")
	public Register_Entity add(@RequestBody Register_Entity  user) {
		
		
		return RService.addNewUser(user);
		
	}
	
	

	

}

