package com.ecommerce.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "tb_target_audience")
@Data
public class TargetAudienceEntity {
	@Id
	private Integer id;
	
	@Column(length = 25,nullable = false,unique = true)
	private String name;
}
