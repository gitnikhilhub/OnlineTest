package com.cap.Util;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import com.cap.bean.*;

public class QuestionCollection {
	public static Map<Integer,Question> questions=new HashMap<Integer,Question>();
	
	static
	{
		ArrayList<String> questionOptions=new ArrayList<String>();
		questionOptions.add("1. Runtime error");  
		questionOptions.add("2.Throws exception");
		questionOptions.add("3.compile time error");
		questionOptions.add("4. Runs successfully");
		questions.put(1001, new Question(BigInteger.valueOf(1001),questionOptions,". What would be the behaviour if this() and super() used in a method?",3,BigDecimal.valueOf(30.0),2,BigDecimal.valueOf(0.0)));
	
	
		ArrayList<String> questionoption1=new ArrayList<String>();
		questionoption1.add("1. It can contain return type") ;
				
		questionoption1.add("2.any number of parameters ");
		questionoption1.add("3. It can have any non access modifiers");
		questionoption1.add("4. Constructor cannot throw an exception");
		questions.put(1002, new Question(BigInteger.valueOf(1002),questionoption1,"Select true statement about constructor",2,BigDecimal.valueOf(30.0),2,BigDecimal.valueOf(30.0)));
		
		
		ArrayList<String> questionoption2=new ArrayList<String>();
		questionoption2.add("1.True");
		questionoption2.add("2.False  ");
		questions.put(1003, new Question(BigInteger.valueOf(1003),questionoption2," Abstract class cannot have a constructor.",2,BigDecimal.valueOf(30.0),2,BigDecimal.valueOf(30.0)));
		
		ArrayList<String> questionoption3=new ArrayList<String>();
		questionoption3.add("1. It can contain return type") ;
				
		questionoption3.add("2.any number of parameters ");
		questionoption3.add("3. It can have any non access modifiers");
		questionoption3.add("4. Constructor cannot throw an exception");
		questions.put(1004, new Question(BigInteger.valueOf(1004),questionoption3,"Select true statement about constructor in c++ ",2,BigDecimal.valueOf(30.0),2,BigDecimal.valueOf(30.0)));
		
		
		ArrayList<String> questionoption4=new ArrayList<String>();
		questionoption4.add("1.std::vector<int>"); 
		questionoption4.add("2.std::vector<short> ");
		questionoption4.add("3.std::vector<long>" );
		questionoption4.add("4.std::vector<bool>");
		questions.put(1005, new Question(BigInteger.valueOf(1005),questionoption4," Find the odd one out.",4,BigDecimal.valueOf(30.0),2,BigDecimal.valueOf(0.0)));
		
		ArrayList<String> questionoption5=new ArrayList<String>();
		questionoption5.add("1.True"); 
		questionoption5.add("2.False");
		questionoption5.add("3.1" );
		questionoption5.add("4.2");
		questions.put(1006, new Question(BigInteger.valueOf(1006),questionoption4,"value of bool:bool is_int(789.54)",2,BigDecimal.valueOf(30.0),2,BigDecimal.valueOf(30.0)));
		
		ArrayList<String> questionoption6=new ArrayList<String>();
		questionoption6.add("1.0"); 
		questionoption6.add("2.False");
		questionoption6.add("3.1" );
		questionoption6.add("4.2");
		questions.put(1007, new Question(BigInteger.valueOf(1007),questionoption4,"Evaluate the following :(false && true) || false || true",3,BigDecimal.valueOf(30.0),3,BigDecimal.valueOf(30.0)));
		
		
		ArrayList<String> questionoption7=new ArrayList<String>();
		questionoption7.add("1.list1 = list()");
		questionoption7.add("2.list1 = []");
		questionoption7.add("3. list1 = list([1, 2, 3])" );
		questionoption7.add("4. all of the mentione);");
		questions.put(1008, new Question(BigInteger.valueOf(1008),questionoption4,"Which of the following commands will create a list?",4,BigDecimal.valueOf(30.0),4,BigDecimal.valueOf(30.0)));

		ArrayList<String> questionoption8=new ArrayList<String>();
		questionoption8.add("1.1");
		questionoption8.add("2.9");
		questionoption8.add("3.15" );
		questionoption8.add("4.Error");
		questions.put(1009, new Question(BigInteger.valueOf(1009),questionoption8,"Suppose list1 is [1, 5, 9], what is sum(list1)?",3,BigDecimal.valueOf(30.0),2,BigDecimal.valueOf(0.0)));
		

		ArrayList<String> questionoption9=new ArrayList<String>();
		questionoption9.add("1.3");
		questionoption9.add("2.5");
		questionoption9.add("3.25" );
		questionoption9.add("4.1");
		questions.put(1010, new Question(BigInteger.valueOf(1010),questionoption8," Suppose list1 is [3, 5, 25, 1, 3], what is min(list1)",4,BigDecimal.valueOf(30.0),4,BigDecimal.valueOf(30.0)));
		
	 
	}
	
		public static Map<Integer, Question> Show()
		{
			return questions;
		}
		
		public  Question ShowQuestion(BigInteger id)
		{
			
			for(Map.Entry<Integer, Question> map : questions.entrySet())
			{
				
				if(BigInteger.valueOf(map.getKey()).compareTo(id) == 0)
				
					return map.getValue();
			}
			
			
			return null;
		}
			
		}
	
	

