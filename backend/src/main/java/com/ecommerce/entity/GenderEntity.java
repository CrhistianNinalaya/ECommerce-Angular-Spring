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
@Table(name = "tb_gender")
@Data
@AllArgsConstructor
public class GenderEntity {
    @Id    
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private byte codGender;

    @Column(name = "name", length = 25)
    private String name;
}