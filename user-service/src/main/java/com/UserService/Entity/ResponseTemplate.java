package com.UserService.Entity;

public class ResponseTemplate {
	
	private User user;
	private Department department;
	private Rating rating;

	public ResponseTemplate() {
		
	}

	public ResponseTemplate(User user, Department department, Rating rating) {
		super();
		this.user = user;
		this.department = department;
		this.rating = rating;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Rating getRating() {
		return rating;
	}

	public void setRating(Rating rating) {
		this.rating = rating;
	}
	
	
}
