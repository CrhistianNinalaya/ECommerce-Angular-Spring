package com.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.entity.GenderEntity;
import com.ecommerce.entity.UserEntity;
import com.ecommerce.model.LoginRequest;
import com.ecommerce.repository.GenderRepository;
import com.ecommerce.repository.TypeUserRepository;
import com.ecommerce.repository.UserRepository;
import com.ecommerce.service.UserService;

import jakarta.servlet.http.HttpSession;

@RestController
@RequestMapping("/api/v1/")
@CrossOrigin(origins = "http://localhost:4200/")
public class AuthController {

	@Autowired
	private UserService userService;

	@Autowired
	private GenderRepository genderRepository;
	

	@GetMapping("/register")
	public List<GenderEntity> register() {
//		List<UserEntity> lstUsers = userRepository.findAll();

		List<GenderEntity> lstGenders = genderRepository.findAll();
		return lstGenders;
	}

	@PostMapping("/register")
	public void registrarUsuario(@RequestBody UserEntity userEntity) {
//		System.out.println(userEntity.getEmail());
//		System.out.println(userEntity.getNumberTelephone());
//		System.out.println(userEntity.getGenderId().getCodGender());
//		System.out.println(userEntity.getTypeUserId().getCodTypeUser());
//		System.out.println(userEntity.getTypeUserId().getDescription());
		userService.saveUser(userEntity);
	}

	@PostMapping("/login")
	public UserEntity login(@RequestBody UserEntity userEntity) {
		boolean validatedUser = userService.validateUser(userEntity);
		
		if (!validatedUser) {
			return null;
		}
		return userService.findByEmail(userEntity);
	}
}