package com.admin.service;

import org.springframework.stereotype.Service;

import com.admin.dto.User;
@Service
public interface UserService {
	public void add(User user);
}
