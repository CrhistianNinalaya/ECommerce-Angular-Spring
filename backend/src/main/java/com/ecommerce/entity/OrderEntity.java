package com.ecommerce.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import lombok.Data;

@Entity
//@Table(name = "tb_orders", uniqueConstraints = {@UniqueConstraint(columnNames = {"nombre"})})
@Table(name = "tb_orders")
@Data
public class OrderEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codOrder;

	private LocalDateTime saleDate;
	
	private double amount;
	
	@ManyToOne
	@JoinColumn(name = "cod_user")
	private UserEntity user;
}