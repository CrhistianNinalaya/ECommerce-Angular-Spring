package com.ecommerce.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "tb_categories")

@Data
public class CategoryEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codCategory;
	
	@Column(length = 45)
	private String name;

	@ManyToOne
	@JoinColumn(name="target_audience_id")
	private TargetAudienceEntity targetAudience;
	
	@ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.MERGE)
	@JoinTable(name = "tb_product_category", joinColumns = @JoinColumn(name = "cod_category", referencedColumnName = "codCategory"),
	inverseJoinColumns = @JoinColumn(name = "cod_product", referencedColumnName = "codProduct"))	
	private List<ProductEntity> products;
}
