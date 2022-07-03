package com.greatLearning.model;

public class SuperDepartment {
	
	String dept ;
	String work;
	String deadLine;
	String holiday;
	
//	constructor
	             
	public SuperDepartment(String dept, String work, String deadLine, String holiday) {
		super();
		this.dept = dept;
		this.work = work;
		this.deadLine = deadLine;
		this.holiday = holiday;
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


//Function starts

	public String departmentName  () { 
		return dept;			
	}
	
	
	public String 	getTodaysWork () {
		 return work;
	}
			
			
	public String 	getWorkDeadline () {
		 return deadLine;
	}
			
	public String 	isTodayAHoliday () {
		 return holiday;
	}

}
