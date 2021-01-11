/**
 * 
 */
package com.studata.test.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import com.studata.test.bean.Student;
import com.studata.test.controller.Controller;
import com.studata.test.repositories.StudentRepository;

import lombok.extern.log4j.Log4j2;

/**
 * @author Madhaw Agrawal
 *
 */
@Service
@Log4j2
public class ProcessRecordService {
	
	@Autowired
    private StudentRepository studentRepository;
	

	
	public Integer postName(Student student) {
		Student studentRetrieved=studentRepository.save(student);
		log.info("Added student details with student id:{}",studentRetrieved.getStudentId());
		return studentRetrieved.getStudentId();
		
	}
	
	public Student getName(Integer id) {
		log.info("processing to fetch student details with student id:{}",id);
		Optional<Student> student=studentRepository.findById(id);
		return student.get();
	}

}
