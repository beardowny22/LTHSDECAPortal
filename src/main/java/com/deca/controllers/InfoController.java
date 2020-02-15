package com.deca.controllers;

import com.deca.Domain.Student;
import com.deca.Domain.StudentInformation;
import com.deca.service.InfoService;

public class InfoController {
	
	public Student getStudentDetails() {
		//creating a variable studentDetails to return from the method
		Student studentDetails;
		//creating a copy of actual InfoService class
		InfoService infoService = new InfoService();
		//calling getStudentDetails() of infoService instance
		studentDetails = infoService.getStudentDetails();
		
		return studentDetails;
		
	}
	
	public StudentInformation updateStudentInformation() {
		StudentInformation studentInfo;
		InfoService infoService = new InfoService();
		studentInfo = infoService.updateStudentInformation();
		
		return studentInfo;
		
		
		
	}

}
