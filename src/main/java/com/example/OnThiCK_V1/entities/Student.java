/*
*(#) Student.java  1.0    Dec 21, 2024
*Copyright (c) 2024 IUH. All rights reserved.
*/
package com.example.OnThiCK_V1.entities;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import jakarta.persistence.*;

/*
* @description :
* @author: Bach Van Cuong
* @date:   Dec 21, 2024
* @version: 1.0
*/
@Entity
@Table(name = "student")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "stu_id")
	private long id;
	
	@Column(name = "stu_name" , nullable = false, columnDefinition = "nvarchar(255)")
	private String name;
	
	@Column(name = "stu_address")
	private String address;
	
	@Column(name = "stu_email")
	private String email;
	
	@Column(name = "stu_phone")
	private String phone;

	@Column(name = "stu_birthday")
	private LocalDate birthday;
	
	@OneToMany(mappedBy = "student", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<AccountStudent> accounts;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public LocalDate getBirthday() {
		return birthday;
	}

	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}

	public List<AccountStudent> getAccounts() {
		return accounts;
	}

	
	public Student(String name, String address, String email, String phone, LocalDate birthday,
			List<AccountStudent> accounts) {
		super();
		this.name = name;
		this.address = address;
		this.email = email;
		this.phone = phone;
		this.birthday = birthday;
		this.accounts = accounts;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	
}
