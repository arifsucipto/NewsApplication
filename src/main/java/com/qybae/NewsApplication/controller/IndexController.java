package com.qybae.NewsApplication.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.qybae.NewsApplication.entity.Feedback;
import com.qybae.NewsApplication.service.FeedbackRepository;

@Controller
public class IndexController {
	private static final Logger LOG = LoggerFactory.getLogger(IndexController.class);
	@Autowired
	private FeedbackRepository feedbackRepository;
	
	
	@GetMapping("/")
	public String home() {
		return "index";
	}
	
	@GetMapping("/about")
	public String about() {
		return "view/about";
	}

	@GetMapping("/contact")
	public String contact(Model theModel) {
		Feedback theFeedback = new Feedback();		
		theModel.addAttribute("feedback", theFeedback);
		return "view/contact";
	}
	
	@PostMapping("/contact")
	public String saveContact(@ModelAttribute("feedback") Feedback theFeedback) {
		LOG.debug("Feedback  content: {}", theFeedback);
		feedbackRepository.save(theFeedback);
		return "view/contact";
	}
	
	@GetMapping("/login")
	public String login() {
		return "view/login";
	}
	
	@PostMapping("/login")
	public String ceklogin() {
		return "view/login";
	}
}
