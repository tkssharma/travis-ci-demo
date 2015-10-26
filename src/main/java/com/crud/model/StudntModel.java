package com.crud.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class StudntModel {

	 public StudntModel() {
		// TODO Auto-generated constructor stub
	}
	
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int studentID;
	@Column
	private String name;
	@Column
	private String password;
	@Column
	private String year;
	public int getStudentID() {
		return studentID;
	}
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}





}
