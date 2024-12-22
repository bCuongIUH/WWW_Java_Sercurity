/*
*(#) StudentServiceImpl.java  1.0    Dec 21, 2024
*Copyright (c) 2024 IUH. All rights reserved.
*/
package com.example.OnThiCK_V1.service.impl;
/*
* @description :
* @author: Bach Van Cuong
* @date:   Dec 21, 2024
* @version: 1.0
*/

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.OnThiCK_V1.entities.Student;
import com.example.OnThiCK_V1.reposities.StudentRepository;
import com.example.OnThiCK_V1.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public List<Student> findAllWithAccounts() {
		// TODO Auto-generated method stub
		return studentRepository.findAllWithAccounts();
	}

	@Override
	public List<Student> findStudentsByYearOfBirth(int year) {
		// TODO Auto-generated method stub
		return studentRepository.findStudentsByYearOfBirth(year);
	}

}
