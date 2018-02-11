package com.qybae.NewsApplication.service;
import org.springframework.data.jpa.repository.JpaRepository;
import com.qybae.NewsApplication.entity.Feedback;

public interface FeedbackRepository extends JpaRepository<Feedback, Long>{

}
