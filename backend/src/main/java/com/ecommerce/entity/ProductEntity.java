package com.ecommerce.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "tb_products")

@Data
public class ProductEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codProduct;

	@Column(name = "description", length = 45, nullable = false)
	private String description;

	@Column(name = "stock")
	private Integer stock;

	@Column(name = "price")
	private double price;

	private boolean isActive = true;
	
	@ManyToMany(mappedBy = "products")
	private List<CategoryEntity> categories;
}