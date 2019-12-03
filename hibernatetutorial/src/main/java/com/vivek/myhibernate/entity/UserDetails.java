package com.vivek.myhibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/*
 *If we will not not give name attribute to entity,
 *it will create table with class name else it will pick from name attribute 
 * 
 * If we will give name attributes to table annotation it will take table name
 * 
 * if we will not give column with name attribute 
 * it will take class fields as table column else it will pick from 
 * column name attributes
 */
@Entity
//@Entity(name = "user_details")
@Table(name="user_details")
public class UserDetails {

	@Id
	private int id;

	//@Column
	@Column(name="user_name")
	private String userName;
	
	@Column(name="dept")
	private String dept;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
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
