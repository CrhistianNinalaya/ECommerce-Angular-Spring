package com.ecommerce.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
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
	@Column(name = "cod_order", length = 7)
	private String codOrder;

	private LocalDateTime saleDate;
	
	private double amount;
	
	@ManyToOne
	@JoinColumn(name = "cod_user")
	private UserEntity user;
}