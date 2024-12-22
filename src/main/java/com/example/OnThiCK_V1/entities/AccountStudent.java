/*
*(#) AccountStudent.java  1.0    Dec 21, 2024
*Copyright (c) 2024 IUH. All rights reserved.
*/
package com.example.OnThiCK_V1.entities;

import com.example.OnThiCK_V1.enums.StatusAccount;

import jakarta.persistence.*;

/*
* @description :
* @author: Bach Van Cuong
* @date:   Dec 21, 2024
* @version: 1.0
*/
@Entity
@Table(name = "account_student")
public class AccountStudent {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "acc_id")
	private long id;
	
	@Column(name = "acc_balance")
	private double balance;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "acc_status")
	private StatusAccount status;
	
	@ManyToOne
	@JoinColumn(name = "stu_id")
	private Student student;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public StatusAccount getStatus() {
		return status;
	}

	public void setStatus(StatusAccount status) {
		this.status = status;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public AccountStudent() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AccountStudent(double balance, StatusAccount status, Student student) {
		super();
		this.balance = balance;
		this.status = status;
		this.student = student;
	}

	@Override
	public String toString() {
		return "AccountStudent [id=" + id + ", balance=" + balance + ", status=" + status + ", student=" + student
				+ "]";
	}
	
	
}
