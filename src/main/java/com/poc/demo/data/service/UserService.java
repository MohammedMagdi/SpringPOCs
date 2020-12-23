package com.poc.demo.data.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.poc.demo.data.dto.UserDTO;
import com.poc.demo.data.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public UserDTO getUserSammary(String username) {
//		UserCustomInf userSummary = userRepository.findByUserName(username);

		UserDTO userSummary = userRepository.findByUserName(username, UserDTO.class);
		return userSummary;
	}

}
