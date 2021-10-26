package com.OnlineShopping.entityrepo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.OnlineShopping.entity.ProCategory;



public interface CategoryRepo extends JpaRepository<ProCategory, Long>{

}
