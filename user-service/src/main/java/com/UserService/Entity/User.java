package com.UserService.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user1")
public class User {
	
	@Id
	@GeneratedValue
	private int userId;
	private String firstName;
	private String lastName;
	private int departmentId;
	private int ratingId;
	
	public User() {
		
	}
	
	public User(String firstName, String lastName, int departmentId, int ratingId) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.departmentId = departmentId;
		this.ratingId = ratingId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	public int getRatingId() {
		return ratingId;
	}

	public void setRatingId(int ratingId) {
		this.ratingId = ratingId;
	}
	
	

}
