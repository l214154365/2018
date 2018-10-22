package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.LoginUser;
import com.dao.LoginDao;



@Service
public class StudentService {
	 
	@Autowired
	private LoginDao lingdao;
	
	public LoginUser login(LoginUser lu){
		
		return lingdao.login(lu);
	}


}
