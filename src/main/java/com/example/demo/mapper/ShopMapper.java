package com.example.demo.mapper;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Shop;

public interface ShopMapper extends JpaRepository<Shop,Long>{


	Shop findBySid(Long sid);

}