/*
*(#) StudentRepository.java  1.0    Dec 21, 2024
*Copyright (c) 2024 IUH. All rights reserved.
*/
package com.example.OnThiCK_V1.reposities;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.OnThiCK_V1.entities.Student;

/*
* @description :
* @author: Bach Van Cuong
* @date:   Dec 21, 2024
* @version: 1.0
*/
@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
	@Query("SELECT s FROM Student s LEFT JOIN FETCH s.accounts")
	List<Student> findAllWithAccounts();
	
	 // Lấy danh sách sinh viên có năm sinh là 2002
    @Query("SELECT s FROM Student s WHERE FUNCTION('YEAR', s.birthday) = :year")
    List<Student> findStudentsByYearOfBirth(int year);
}
