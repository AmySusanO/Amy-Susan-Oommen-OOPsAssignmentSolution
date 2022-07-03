package com.greatLearning.main;

import com.greatLearning.model.AdminDepartment;
import com.greatLearning.model.HrDepartment;
import com.greatLearning.model.SuperDepartment;
import com.greatLearning.model.TechDepartment;

public class Main {
	public static void main(String args[]) {
		
//		 String spDept,spWork,spDeadLine,spHoliday;	
		
		 String adDept,adWork,adDeadLine,adHoliday;
		 
		 String hrDept,hrWork,hrDeadLine,hrHoliday,hrActivity;
		 
		 String teDept,teWork,teDeadLine,teHoliday,teStackInfo;
		 
		 
		 SuperDepartment sp = new SuperDepartment("Super Department","No Work as of now","Nil","Today is not a holiday");		 
		
		 AdminDepartment ad = new AdminDepartment("Admin Department","Complete your documents submission","Complete by EOD","Today is not a Holiday");
		
		 HrDepartment hr = new HrDepartment("HR Department","Fill today’s timesheet and mark your attendance","Complete by EOD","Today is not a Holiday","team Lunch");
		
		 TechDepartment te = new TechDepartment("Tech Department","Complete coding of Module 1","Complete by EOD","Today is not a Holiday","Core Java");
		
		
//		 spDept = sp.departmentName();
//		 spWork = sp.getTodaysWork();
//		 spDeadLine = sp.getWorkDeadline();
//		 spHoliday = sp.isTodayAHoliday(); 
		 
		 adDept = ad.departmentName();
		 adWork = ad.getTodaysWork();
		 adDeadLine = ad.getWorkDeadline();
		 adHoliday = ad.isTodayAHoliday();
		 
		 hrDept = hr.departmentName();
		 hrWork = hr.getTodaysWork();
		 hrDeadLine = hr.getWorkDeadline();
		 hrHoliday = hr.isTodayAHoliday();
		 hrActivity = hr.doActivity();
		 
		 teDept = te.departmentName();
		 teWork = te.getTodaysWork();
		 teDeadLine = te.getWorkDeadline();
		 teHoliday = te.isTodayAHoliday();
		 teStackInfo = te.getTechStackInformation();
		 
//		 System.out.println("Welcome to "+spDept);
//		 System.out.println(spWork);
//		 System.out.println(spDeadLine);
//		 System.out.println(spHoliday);
//		 
//		 System.out.println("\n");
		 
		 System.out.println("Welcome to "+adDept);
		 System.out.println(adWork);
		 System.out.println(adDeadLine);
		 System.out.println(adHoliday);
		 
		 System.out.println("\n");
		
		 System.out.println("Welcome to "+hrDept);
		 System.out.println(hrActivity);
		 System.out.println(hrWork);
		 System.out.println(hrDeadLine);
		 System.out.println(hrHoliday);
		 
		 System.out.println("\n");
			
		 System.out.println("Welcome to "+teDept);
		 System.out.println(teWork);
		 System.out.println(teDeadLine);
		 System.out.println(teStackInfo);
		 System.out.println(teHoliday);
		 	 
		
	}

}
