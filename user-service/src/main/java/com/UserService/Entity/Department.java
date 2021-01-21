package com.UserService.Entity;


public class Department {
	
    private int departmentId;
	
	private String departmentName;
	
	private String departmentAddress;
	
	public Department() {
		
	}

	public Department(String departmentName, String departmentAddress) {
		super();
		this.departmentName = departmentName;
		this.departmentAddress = departmentAddress;
	}

	public int getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getDepartmentAddress() {
		return departmentAddress;
	}

	public void setDepartmentAddress(String departmentAddress) {
		this.departmentAddress = departmentAddress;
	}
	

}
