package com.cap.ui;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import com.cap.Service.TestService;
import com.cap.Service.Validation;
import com.cap.Util.QuestionCollection;
import com.cap.Util.TestCollection;
import com.cap.bean.Question;
import com.cap.bean.Test;
import com.cap.bean.User;
import com.cap.exception.ExceptionJava;

public class MainClient {
	public static Test calculateTestMarks()
	{
		TestService uService = new TestService();  //creating object of user service class
		
	    double totalmarks = 0.0;
	    double total =0.0;
	    System.out.println("*********************Welcome to Online Test Management System*************************");
		System.out.println("........................................................................................");
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter user id");
		long id = scanner.nextLong();
		
		boolean val = true;
		while(val)
		{
		String string=String.valueOf(id);
		boolean b1 = Validation.validatedata1(string,Validation.pattern1);  //Applying Validation On User Id
		if(b1 == true)
		{
			System.out.println("valid id");
			val = false;
			break;
		}
		else
		{
			
			System.out.println("inValid id");
			System.out.println("enter again");
			id=scanner.nextLong();
		}
		
		}
		
		System.out.println("Enter user password");
		String pass=scanner.next();
		
		boolean val1=true;
		while(val1)
		{
			boolean c=Validation.validatedata(pass, Validation.pattern);   //Applying VAlidation on User Password
		if(c==true)
		{
			System.out.println("");
			val1=false;
			break;
		}
		else
		{
			
			System.out.println("try again");
			 pass=scanner.next();
		}
		}
		
       

	    User user = uService.getUser(id);   				//getting user from from getuser method which is in user service class

	    System.out.println("User name "+" "+user.getUserName());
	    
	    
	    Test uTest = user.getUserTest();                    //getting assigned test to the user
	    
	    System.out.println("Test type"+":"+uTest.getTestTitle());
	    
	    
	    System.out.println("Test Duration"+":"+uTest.getTestDuration());
	    
	    
	    
	    System.out.println("Start Time"+":"+uTest.getStartTime());
	  
	    
	    Set<Question> set = uTest.getTestQuestions();
	    

	    for(Question question : set)
	    {
	    	
	    	System.out.println("Marks scored in the question "+" "+question.getQuestionTitle()+"   "+" IS: "+question.getMarksScored());
	    	
	    	System.out.println("***************************************************************************************");
	    	
	    	System.out.println("choosen option"+" :"+question.getChosenAnswer());
	    	
	    	System.out.println("****************************************************************************************");
	    	 
	    	System.out.println("correct option"+" :"+question.getQuestionAnswer());
	    	
	    	
	    	System.out.println("*****************************************************************************************");
	    	
	    	totalmarks = totalmarks+question.getMarksScored().doubleValue();
	    	
	    	System.out.println("total marks in the question"  +"   "+question.getQuestionTitle()+"  "+" IS: "+question.getQuestionMarks());
	    	
	    	System.out.println("*****************************************************************************************");
	    	
	    	
	    	total=total+question.getQuestionMarks().doubleValue();
	    }
	    
	    
	    uTest.setTestMarksScored(BigDecimal.valueOf(totalmarks));
	    
	    System.out.println("marks Scored"+" "+uTest.getTestMarksScored());
	    
	    
	    try
	    {
	    	if(uTest.getTestMarksScored().doubleValue() <40)                          //applying exception
	    		throw new ExceptionJava("you are fail");
	    }
	    catch(ExceptionJava exe)
	    {
	    	System.out.println(exe.getMessage());
	    }
	    
	    uTest.setTestTotalMarks(BigDecimal.valueOf(total));
	    
	    System.out.println("total marks"+"  "+uTest.getTestTotalMarks());
	    
	    
	    System.out.println("**********************************************************************************************");
	    
	    System.out.println("ThankYou For Taking test ");
	    
	    System.out.println("HAve A Nice Day");
	    
	    return uTest;
	    
}

	public static void main(String[] args) {
		
		calculateTestMarks();                           //calling Method
	}
}
