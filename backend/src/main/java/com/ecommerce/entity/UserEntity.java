package com.ecommerce.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Table(name = "tb_users")
@Data
@AllArgsConstructor
public class UserEntity {
	@Id	
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private Integer codUser;

	@Column(length = 60, nullable = false)
	private String names;

	@Column(length = 60, nullable = false)
	private String lastName;
	
	@ManyToOne
	@JoinColumn(name= "gender_id")
	private GenderEntity gender;

	private LocalDate dateRegistration;

	@Column(length = 60, nullable = false, unique = true)
	private String email;
	
	@Column(length = 25, nullable = false)
	private String password;
	
	@Column(length = 10)
	private String numberTelephone;
		
	
	@ManyToOne
	@JoinColumn(name = "type_user_id")
	private TypeUserEntity typeUser;
}