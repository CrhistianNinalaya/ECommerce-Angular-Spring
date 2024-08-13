package com.ecommerce.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import jakarta.persistence.Id;
import jakarta.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "tb_type_user")
@Data

public class TypeUserEntity {
	@Id
	@Column(name = "cod_type_user", length = 7)
//	@Check(constraints = "cod_type_user ~ '^TYP[0-9]{4}$'")
	private String codTypeUser;

	@Column(length = 25, nullable = false)
	private String description;
}