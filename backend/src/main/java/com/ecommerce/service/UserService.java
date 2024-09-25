package com.ecommerce.service;

import com.ecommerce.entity.UserEntity;

public interface UserService {
	boolean validateUser(UserEntity userEntity);
	void saveUser(UserEntity userEntity);
	UserEntity findByEmail (UserEntity userEntity);
}
