package com.ecommerce.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Table(name = "tb_type_user")
@Data
@AllArgsConstructor
public class TypeUserEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codTypeUser;

	@Column(length = 25, nullable = false)
	private String description;
}