package com.ecommerce;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;


import com.ecommerce.entity.UserEntity;
import com.ecommerce.repository.UserRepository;

@RestController
public class UserController {
	
	@Autowired
	private UserRepository userRepository;
	
	@GetMapping("/")
	public List<UserEntity> home(Model model){
		List<UserEntity> lstUsers = userRepository.findAll();
		
		model.addAttribute("msj", "hola");
		
		return lstUsers;
	}
	
//	@PostMapping("/")
//	public void registrarUsuario(UserEntity userEntity) {		
//		userRepository.save(nuevoUser);
//	}
}
