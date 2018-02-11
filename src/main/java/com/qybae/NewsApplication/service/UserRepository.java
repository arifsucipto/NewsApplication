package com.qybae.NewsApplication.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import com.qybae.NewsApplication.entity.User;



public interface UserRepository extends JpaRepository<User, Long>{

	List<User> findByEmail(String email);

	User findByUsername(String username);


}
