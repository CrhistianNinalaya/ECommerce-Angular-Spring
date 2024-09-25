package com.ecommerce.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tb_gender")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class GenderEntity {
    @Id    
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codGender;

    @Column(name = "name", length = 25)
    private String name;
}