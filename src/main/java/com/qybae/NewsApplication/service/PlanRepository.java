package com.qybae.NewsApplication.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.qybae.NewsApplication.entity.Plan;

public interface PlanRepository extends JpaRepository<Plan, Long> {
	
}
