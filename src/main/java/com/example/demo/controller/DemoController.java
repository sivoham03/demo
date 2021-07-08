package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Demo;
import com.example.demo.service.DemoService;

@RestController
@RequestMapping("/student")

public class DemoController {
	@Autowired
	private DemoService service;// has a relationship
	//method syntax <access modifier> <return type> <method name>
	@PostMapping("/save")
	public ResponseEntity<String> saveStudent(@RequestBody Demo demo)
	{
		Integer saveStudent = service.saveStudent(demo);
		ResponseEntity<String> responseEntity = new ResponseEntity<>("student record saved successfully"+saveStudent, HttpStatus.OK);
		
		System.out.println("hello shiva");
		System.out.println("hello krish");
		System.out.println("hello kamutam");
		System.out.println("hello shivakrish");

		return responseEntity;
		
		
	}
}
