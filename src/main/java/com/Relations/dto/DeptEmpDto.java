package com.Relations.dto;

public class DeptEmpDto {
	private String empDept;
	private String empName;
	private String empEmail;
	private String empAddress;
	private long deptNo;

	public DeptEmpDto(String empDept, String empName, String empEmail, String empAddress,long deptNo) {
		this.empDept = empDept;
		this.empName = empName;
		this.empEmail = empEmail;
		this.empAddress = empAddress;
		this.deptNo=deptNo;
	}

	public String getEmpDept() {
		return empDept;
	}

	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpEmail() {
		return empEmail;
	}

	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}

	public String getEmpAddress() {
		return empAddress;
	}

	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}
	
	

	public Long getDeptNo() {
		return deptNo;
	}

	public void setDeptNo(Long deptNo) {
		this.deptNo = deptNo;
	}

	@Override
	public String toString() {
		return "DeptEmpDto [empDept=" + empDept + ", empName=" + empName + ", empEmail=" + empEmail + ", empAddress="
				+ empAddress + ", deptNo=" + deptNo + "]";
	}

	
}
