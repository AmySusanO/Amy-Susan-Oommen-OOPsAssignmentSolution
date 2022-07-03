package com.greatLearning.model;

public class AdminDepartment extends SuperDepartment {
	String dept,work,deadLine,holiday;
	
//	Constructor

	public AdminDepartment(String dept, String work, String deadLine, String holiday) {
		super(dept,work,deadLine,holiday);
	}
	
//	getters and setters
	
	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getWork() {
		return work;
	}

	public void setWork(String work) {
		this.work = work;
	}

	public String getDeadLine() {
		return deadLine;
	}

	public void setDeadLine(String deadLine) {
		this.deadLine = deadLine;
	}

	public String getHoliday() {
		return holiday;
	}

	public void setHoliday(String holiday) {
		this.holiday = holiday;
	}
	
	
//	function starts
	
	public String departmentName  () { 
		dept = super.departmentName();
		return dept;			
	}
	
	public String getTodaysWork () {
		work=super.getTodaysWork();
		return work;
	}
					
	public String getWorkDeadline () {
		deadLine=super.getWorkDeadline();
		return deadLine;
	}	
	
}
