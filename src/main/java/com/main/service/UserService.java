package com.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.dto.UserRequest;
import com.main.repository.UserRepository;
import com.main.translator.UserTranslator;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	@Autowired
	private UserTranslator translator;
	
	public String addentity(UserRequest req) {
		 repository.save(translator.requestentity(req));
		 return "ok";
	}
	
}

