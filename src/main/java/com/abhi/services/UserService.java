package com.abhi.services;

import com.abhi.binding.LoginForm;
import com.abhi.binding.SignupForm;
import com.abhi.binding.UnlockForm;
import com.abhi.entities.UserDtlsEntity;

public interface UserService {

	String createUser(SignupForm form);
	
	String unlockAccount(UnlockForm form);
	
	String resetPassword(String email);
	
	String loginUser(LoginForm form);

}
