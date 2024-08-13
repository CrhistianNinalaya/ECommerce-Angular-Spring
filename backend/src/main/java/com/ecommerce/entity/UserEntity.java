package com.ecommerce.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "tb_users")
@Data
public class UserEntity {
	@Id
	@Column(name = "cod_user", length = 7)
//	@Check(constraints = "cod_user ~ '^USU[0-9]{4}$'")
	private String codUser;

	@Column(length = 25, nullable = false, unique = true)
	private String password;

	@OneToOne
	@JoinColumn(name = "person_id")
	private PersonEntity person;
	
	@ManyToOne
	@JoinColumn(name = "type_user_id")
	private TypeUserEntity typeUser;
}