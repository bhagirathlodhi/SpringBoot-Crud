package com.student.student.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String fName;
	
	private String lName;
	
	private int rollnumber;
	
	private String address;
	
	private String school_name;
	
	private long phone_number;
	
	private String gender;

	public Student(int id, String fName, String lName, int rollnumber, String address, String school_name,
			long phone_number, String gender) {
		super();
		this.id = id;
		this.fName = fName;
		this.lName = lName;
		this.rollnumber = rollnumber;
		this.address = address;
		this.school_name = school_name;
		this.phone_number = phone_number;
		this.gender = gender;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public int getRollnumber() {
		return rollnumber;
	}

	public void setRollnumber(int rollnumber) {
		this.rollnumber = rollnumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getSchool_name() {
		return school_name;
	}

	public void setSchool_name(String school_name) {
		this.school_name = school_name;
	}

	public long getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(long phone_number) {
		this.phone_number = phone_number;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", fName=" + fName + ", lName=" + lName + ", rollnumber=" + rollnumber
				+ ", address=" + address + ", school_name=" + school_name + ", phone_number=" + phone_number
				+ ", gender=" + gender + "]";
	}
	
	

	
	

}
