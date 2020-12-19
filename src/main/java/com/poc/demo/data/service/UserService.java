package com.poc.demo.data.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.poc.demo.data.dto.UserSummary;
import com.poc.demo.data.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public UserSummary getUserSammary(String username) {
		UserSummary userSummary = userRepository.findByUserName(username, UserSummary.class);
		return userSummary;
	}

}
