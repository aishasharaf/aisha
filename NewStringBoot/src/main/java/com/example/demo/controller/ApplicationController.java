package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.beans.UserBean;
import com.example.demo.respository.StudentRespository;

@Controller
public class ApplicationController {
	
	
	@Autowired
	private StudentRespository repo;
	
	@GetMapping("/user")
	public String showHomePage() {
		System.out.println("/user mapping");
		return "home";
	}
	
	@GetMapping("/user/insert")
	public String insertUser() {
		System.out.println("/insert mapping page");
		return "insert";
	}
	
	@PostMapping("save")
	public String insertActionUser(UserBean userbean) {
		System.out.println("/insert action");
		System.out.println(userbean.getName());
		System.out.println(userbean.getPassword());
		repo.save(userbean);	
		return "home";
	}
	
	@GetMapping("/display")
	public String displayUser(Model model) {
		List<UserBean> studentList=new ArrayList<UserBean>();
		studentList=repo.findAll();
		model.addAttribute("studentList",studentList);
		System.out.println("/display mapping page");
		return "view";
	}
	
}
