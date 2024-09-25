package com.ecommerce.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.entity.UserEntity;
import com.ecommerce.repository.UserRepository;
import com.ecommerce.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository userRepository;
		
	@Override
	public boolean validateUser(UserEntity userEntity) {
		try {
			UserEntity userFoundByEmail = userRepository.findByEmail(userEntity.getEmail());
			
			if(userFoundByEmail == null) {
				return false;
			}
			
			if(!userFoundByEmail.getPassword().equals(userEntity.getPassword())  ) {			
				return false;
			}		
			return true;	
		} catch (Exception e) {			
			return false;
		}
		
	}

	@Override
	public void saveUser(UserEntity userEntity) {
		userRepository.save(userEntity);
	}

	@Override
	public UserEntity findByEmail(UserEntity userEntity) {
		return userRepository.findByEmail(userEntity.getEmail());
	}
}
