package com.StayMate.spec.Register;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Register_Service {
@Autowired
Register_Repo R_Repo;

public Register_Entity addNewUser(Register_Entity user) {
	// TODO Auto-generated method stub
	return R_Repo.save(user);
}
}
