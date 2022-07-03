package com.greatLearning.model;

public class TechDepartment extends SuperDepartment{
	
	String dept,work,deadLine,holiday,stackInfo;

//	constructor
	public TechDepartment(String dept, String work, String deadLine, String holiday, String stackInfo) {
		super(dept, work, deadLine, holiday);
		this.stackInfo = stackInfo;
	}
//getters and setters
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

	public String getStackInfo() {
		return stackInfo;
	}

	public void setStackInfo(String stackInfo) {
		this.stackInfo = stackInfo;
	}
	
//	Function starts
	public String departmentName  () { 	
		dept = super.departmentName();
		return dept;				
	}
	
	public String getTodaysWork () {
		work = super.getTodaysWork();
		return work;
	}	
			
	public String getWorkDeadline () {
		deadLine=super.getWorkDeadline();
		return deadLine;
	}
	
	public String getTechStackInformation() {
		return stackInfo;
	}
	
	
	
	
	

}
