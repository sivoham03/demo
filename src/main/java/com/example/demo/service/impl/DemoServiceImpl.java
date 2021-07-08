package com.example.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Demo;
import com.example.demo.repository.DemoRepository;
import com.example.demo.service.DemoService;

@Service
public class DemoServiceImpl implements DemoService{
	@Autowired
	private DemoRepository demoRepository;

	@Override
	public Integer saveStudent(Demo demo) {
		return  demoRepository.save(demo).getStudentId();
		
		
	}

}
