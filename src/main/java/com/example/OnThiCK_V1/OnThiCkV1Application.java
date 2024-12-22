package com.example.OnThiCK_V1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.OnThiCK_V1.entities.AccountStudent;
import com.example.OnThiCK_V1.entities.Student;
import com.example.OnThiCK_V1.enums.StatusAccount;
import com.example.OnThiCK_V1.reposities.AccountStudentRepository;
import com.example.OnThiCK_V1.reposities.StudentRepository;

import net.datafaker.Faker;

@SpringBootApplication
public class OnThiCkV1Application {


	public static void main(String[] args) {
		SpringApplication.run(OnThiCkV1Application.class, args);
	}
	
//	 @Bean
//	    CommandLineRunner initData(StudentRepository studentRepository, AccountStudentRepository accountStudentRepository) {
//	        return args -> {
//	            // Khởi tạo Faker
//	            Faker faker = new Faker();
//
//	            // Tạo dữ liệu cho Student
//	            for (int i = 0; i < 3; i++) {
//	                Student student = new Student();
//	                student.setName(faker.name().fullName()); // Tên đầy đủ
//	                student.setAddress(faker.address().fullAddress()); // Địa chỉ
//	                student.setEmail(faker.internet().emailAddress()); // Email
//	                student.setPhone(faker.phoneNumber().cellPhone()); // Số điện thoại
//	                student.setBirthday(faker.date().birthday().toInstant()
//	                        .atZone(java.time.ZoneId.systemDefault()).toLocalDate()); // Ngày sinh
//
//	                studentRepository.save(student);
//	            }
//
//	            // Tạo dữ liệu cho AccountStudent
//	            studentRepository.findAll().forEach(student -> {
//	                for (int j = 0; j < 2; j++) { // Mỗi sinh viên có 2 tài khoản
//	                    AccountStudent accountStudent = new AccountStudent();
//	                    accountStudent.setBalance(faker.number().randomDouble(2, 50000, 200000)); // Số dư ngẫu nhiên
//	                    accountStudent.setStatus(faker.options().option(StatusAccount.class)); // Trạng thái ngẫu nhiên
//	                    accountStudent.setStudent(student);
//	                    accountStudentRepository.save(accountStudent);
//	                }
//	            });
//	        };
//	    }
	}
