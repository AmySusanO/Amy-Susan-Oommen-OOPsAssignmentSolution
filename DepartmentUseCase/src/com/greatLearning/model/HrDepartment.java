package com.greatLearning.model;

public class HrDepartment extends SuperDepartment {

	
	String dept,work,deadLine,holiday,activity;

//	constructor
	public HrDepartment(String dept, String work, String deadLine, String holiday, String activity) {
		super(dept,work,deadLine,holiday);
		this.activity = activity;
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

	public String getActivity() {
		return activity;
	}

	public void setActivity(String activity) {
		this.activity = activity;
	}
	
	
//	Function starts
	public String departmentName  () { 
		dept=super.departmentName();	
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
	
	public String doActivity(){
		return activity;	
	}	
	
	
}
