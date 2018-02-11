package com.qybae.NewsApplication.service;

import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.qybae.NewsApplication.entity.PasswordResetToken;

public interface PasswordResetTokenRepository extends JpaRepository<PasswordResetToken, Long>{
	

	    PasswordResetToken findByToken(String token);

	    @Query("select ptr from PasswordResetToken ptr inner join ptr.user u where ptr.user.id = ?1")
	    Set<PasswordResetToken> findAllByUserId(long userId);
}
