package com.ecommerce.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "tb_order_details")
@Data
public class OrderDetailsEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codDet;
	
	private Integer cant;
	
	@ManyToOne
	@JoinColumn(name= "cod_order")
	private OrderEntity order;
	
	@ManyToOne
	@JoinColumn(name= "cod_product")
	private ProductEntity product;
}
