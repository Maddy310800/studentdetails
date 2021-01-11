package com.studata.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.studata.test.bean.Student;
import com.studata.test.service.ProcessRecordService;

@RestController
public class Controller {

	
	@Autowired
    private ProcessRecordService processRecordService;
	
	
	@GetMapping("/get")
	public Student getName(@RequestParam Integer id) {
		return processRecordService.getName(id);
	}
	
	@PostMapping("/post")
	public Integer postName(@RequestBody Student student) {
		return processRecordService.postName(student);
	}

}
