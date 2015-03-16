package com.admin.service.impl;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.admin.dto.User;
import com.admin.service.UserService;
@Repository
public class UserServiceImpl implements UserService{
	@Autowired  
    private SqlSessionTemplate sqlSessionTemplate;
	public void add(User user) {
		sqlSessionTemplate.insert("insertUser" ,user);
		
	}
	
}
