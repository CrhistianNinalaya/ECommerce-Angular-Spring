package com.ecommerce.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "tb_persons")
@Data
public class PersonEntity {
	
	@Id
	@Column(length = 7)
//	@Check(constraints = "cod_person ~ '^PER[0-9]{4}$'")
	private String codPerson;
	
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
	
	@Column(length = 10)
	private String numberTelephone;
}
