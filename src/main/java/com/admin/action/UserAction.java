package com.admin.action;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.admin.dto.User;
import com.admin.service.UserService;
import com.opensymphony.xwork2.ActionSupport;

@Controller  
@Scope("prototype") 
public class UserAction extends ActionSupport{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Autowired
	private UserService userService;
	
	private User user;
	
	
	public String add(){
		userService.add(user);
		return "addUser";
	}


	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}
	
	
}
