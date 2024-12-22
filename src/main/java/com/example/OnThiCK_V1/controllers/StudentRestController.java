/*
*(#) StudentRestController.java  1.0    Dec 22, 2024
*Copyright (c) 2024 IUH. All rights reserved.
*/
package com.example.OnThiCK_V1.controllers;
/*
* @description :
* @author: Bach Van Cuong
* @date:   Dec 22, 2024
* @version: 1.0
*/

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.OnThiCK_V1.entities.Student;
import com.example.OnThiCK_V1.service.StudentService;


@RestController
@RequestMapping("/students")
public class StudentRestController {
	  @Autowired
	    private StudentService studentService;

	   
	    @GetMapping
	    public List<Student> getAllStudents() {
	        return studentService.findAllWithAccounts(); 
	    }

	    
	    @GetMapping("/year/2002")
	    public List<Student> getStudentsBornIn2002() {
	        return studentService.findStudentsByYearOfBirth(2002); 
	    }

	   
	    @GetMapping("/year/{year}")
	    public List<Student> getStudentsByYear(@PathVariable int year) {
	        return studentService.findStudentsByYearOfBirth(year);
	    }
	}
