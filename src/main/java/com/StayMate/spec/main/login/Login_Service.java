package com.StayMate.spec.main.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;





@Service
public class Login_Service {

	@Autowired
	Login_Repo lgRepo;


	public Login_Entity addNewUser(Login_Entity lgUser) {
		// TODO Auto-generated method stub
		return lgRepo.save(lgUser);
	}

	public String checkIsValidUser(String name, String password) {
		

Login_Entity lgUser = lgRepo.findByName(name);

if( (lgUser != null) && (lgUser.getPassword().contentEquals(password) == true)){
	
	return "success";
}

return "failure";
}
}

