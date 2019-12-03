package com.vivek.myhibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


/*
 * We can give annotation on the level of field as well as level of getter,If it is on
 * field level it will save field value else it will take value from getter 
 * 
 * 
 */
@Entity
@Table(name="user_details2")
public class UserDetails2 {

	@Id
	private int id;

	//@Column(name="user_name")
	private String userName;
	
	@Column(name="dept")
	private String dept;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name="user_name")
	public String getUserName() {
		return userName+"Hello Vivek Here";
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
	
	

}
