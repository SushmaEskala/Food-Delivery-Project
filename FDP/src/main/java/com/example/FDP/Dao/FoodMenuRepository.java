package com.example.FDP.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.FDP.Model.FoodMenu;

public interface FoodMenuRepository extends JpaRepository<FoodMenu, Integer> {

	
}
