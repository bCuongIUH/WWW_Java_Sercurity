/*
*(#) StudentController.java  1.0    Dec 21, 2024
*Copyright (c) 2024 IUH. All rights reserved.
*/
package com.example.OnThiCK_V1.controllers;
/*
* @description :
* @author: Bach Van Cuong
* @date:   Dec 21, 2024
* @version: 1.0
*/

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.OnThiCK_V1.entities.Student;
import com.example.OnThiCK_V1.service.StudentService;

@Controller
public class StudentController {

	@Autowired
	private StudentService studentService;
	@GetMapping("/list-student")
	public String getStudent(Model model) {
		List<Student> students = studentService.findAllWithAccounts();
		model.addAttribute("students", students);
		return "list-student";
	}
	@GetMapping("/list-student-year")
	 public String listStudentsBornIn2002(Model model) {
        List<Student> students = studentService.findStudentsByYearOfBirth(2002);
        model.addAttribute("students", students);
        return "list-student-year";
    }
}
