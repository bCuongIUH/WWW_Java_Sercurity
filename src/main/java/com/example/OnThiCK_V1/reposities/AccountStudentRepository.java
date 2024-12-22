/*
*(#) AccountStudentRepository.java  1.0    Dec 21, 2024
*Copyright (c) 2024 IUH. All rights reserved.
*/
package com.example.OnThiCK_V1.reposities;
/*
* @description :
* @author: Bach Van Cuong
* @date:   Dec 21, 2024
* @version: 1.0
*/

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.OnThiCK_V1.entities.AccountStudent;
import com.example.OnThiCK_V1.entities.Student;

public interface AccountStudentRepository extends JpaRepository<AccountStudent, Long> {
	

}
