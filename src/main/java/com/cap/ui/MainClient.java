package com.cap.ui;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import com.cap.Service.QSService;
import com.cap.Service.USService;
import com.cap.Service.Validation;
import com.cap.Util.QuestionCollection;
import com.cap.Util.TestCollection;
import com.cap.bean.Question;
import com.cap.bean.Test;
import com.cap.bean.User;

public class MainClient {
	public static Test calculateTestMarks()
	{
USService usrvice = new USService();
		
	    double totalmarks = 0.0;
	    double total =0.0;
	    System.out.println("Welcome to Online Test Management System");
		System.out.println("................................................");
		Scanner s = new Scanner(System.in);
		System.out.println("enter user id");
		long id = s.nextLong();
		
		int x=0;
		while(x<3)
		{
		String st=String.valueOf(id);
		boolean b1 = Validation.validatedata1(st,Validation.pattern1);
		if(b1 == true)
		{
			System.out.println("valid id");
			break;
		}
		else
		{
			x++;
			System.out.println("inValid id");
			System.out.println("enter again");
			id=s.nextLong();
		}
		
		}
		
		System.out.println("Enter user password");
		String pass=s.next();
		
		int i=0;
		while(i<3)
		{
			boolean c=Validation.validatedata(pass, Validation.pattern);
		if(c==true)
		{
			System.out.println("correct value");
			break;
		}
		else
		{
			i++;
			System.out.println("try again");
			 pass=s.next();
		}
		}
		
       

	    User user = usrvice.getUser(id);
   //System.out.println(user);
	    System.out.println("User name "+" "+user.getUserName());
	    
	    Test uTest = user.getUserTest();
	    
	  
	    
	    System.out.println("Test type"+":"+uTest.getTestTitle());
	    
	    
	    System.out.println("Test Duration"+":"+uTest.getTestDuration());
	    
	    
	    
	    System.out.println("Start Time"+":"+uTest.getStartTime());
	    //System.out.println(uTest);
	    
	    Set<Question> set = uTest.getTestQuestions();
	    
	    //System.out.println(set);
	    
	    for(Question question : set)
	    {
	    	
	    	System.out.println("Marks scored in the question "+" "+question.getQuestionTitle()+" is "+question.getMarksScored());
	    	
	    	System.out.println(".......................");
	    	 
	    	System.out.println("correct option"+" "+question.getQuestionAnswer());
	    	
	    	totalmarks = totalmarks+question.getMarksScored().doubleValue();
	    	
	    	System.out.println("total marks in the question"  +"   "+question.getQuestionTitle()+" is "+question.getQuestionMarks());
	    	
	    	
	    	total=total+question.getQuestionMarks().doubleValue();
	    }
	    
	    
	    uTest.setTestMarksScored(BigDecimal.valueOf(totalmarks));
	    
	    System.out.println("marks Scored"+" "+uTest.getTestMarksScored());
	    
	    uTest.setTestTotalMarks(BigDecimal.valueOf(total));
	    
	    System.out.println("total marks"+"  "+uTest.getTestTotalMarks());
	    
	    return uTest;
	    
}





	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	calculateTestMarks();
	}
}
