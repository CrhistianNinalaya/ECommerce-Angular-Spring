package com.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.entity.GenderEntity;
import com.ecommerce.entity.UserEntity;

@Repository
public interface GenderRepository extends JpaRepository<GenderEntity, Integer>{
	
}
