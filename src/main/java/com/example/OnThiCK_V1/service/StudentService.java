/*
*(#) StudentService.java  1.0    Dec 21, 2024
*Copyright (c) 2024 IUH. All rights reserved.
*/
package com.example.OnThiCK_V1.service;
/*
* @description :
* @author: Bach Van Cuong
* @date:   Dec 21, 2024
* @version: 1.0
*/

import java.util.List;

import com.example.OnThiCK_V1.entities.Student;

public interface StudentService {
	List<Student> findAllWithAccounts();

	List<Student> findStudentsByYearOfBirth(int year);
}
