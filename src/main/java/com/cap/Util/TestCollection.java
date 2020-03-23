package com.cap.Util;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Time;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.HashSet;
import com.cap.bean.*;
import java.util.Map;
import java.util.Set;

import com.cap.bean.*;
public class TestCollection {
	private static Map<Integer,Test> Tests=new HashMap<Integer,Test>();
	
	static Question que = new Question();
	
	static QuestionCollection coll = new QuestionCollection();
	
	static Set<Question> questions=new HashSet<Question>(); //creating set of question for java test 
	
	
	static QuestionCollection coll1 = new QuestionCollection();
	
	static Set<Question> question2=new HashSet<Question>();  //creating set of question for C++ test
	
	
	static QuestionCollection coll3 = new QuestionCollection();
	
	static Set<Question> question3=new HashSet<Question>(); //creating set of question of Python test
	
	static {
			
		questions.add(coll.ShowQuestion(BigInteger.valueOf(1001)));
		questions.add(coll.ShowQuestion(BigInteger.valueOf(1002))); // assigning question to test 1
		questions.add(coll.ShowQuestion(BigInteger.valueOf(1003)));
		
		
		question2.add(coll1.ShowQuestion(BigInteger.valueOf(1004)));
		question2.add(coll1.ShowQuestion(BigInteger.valueOf(1005)));  //assigning question to test 2
		question2.add(coll1.ShowQuestion(BigInteger.valueOf(1006)));
		
		
		
		question3.add(coll3.ShowQuestion(BigInteger.valueOf(1008)));
		question3.add(coll3.ShowQuestion(BigInteger.valueOf(1009)));  //Assigning question to test 3
		question3.add(coll3.ShowQuestion(BigInteger.valueOf(1010)));
		
		
		Tests.put(1001, new Test(BigInteger.valueOf(1001),"Java Test",new Time(2,30,0),questions,BigDecimal.valueOf(00),BigDecimal.valueOf(00)
				,que,  LocalDateTime.of(2020,03,21,9,30,00),  LocalDateTime.of(2020,03,21,12,00,00)));
		
		
		
		Tests.put(1002, new Test(BigInteger.valueOf(1002),"C++ Test",new Time(2,30,0),question2,BigDecimal.valueOf(00),BigDecimal.valueOf(00)
				,que,  LocalDateTime.of(2020,03,21,9,30,00),  LocalDateTime.of(2020,02,21,12,00,00)));
		
		Tests.put(1003, new Test(BigInteger.valueOf(1003),"Python Test",new Time(2,30,0),question3,BigDecimal.valueOf(00),BigDecimal.valueOf(00)
				,que,  LocalDateTime.of(2020,03,21,9,30,00),  LocalDateTime.of(2020,04,22,12,00,00)));
		
		
		
		
	}
	public static Map<Integer, Test> ShowTest()
	{
		return Tests;
	}
	
public static Test ShowTest(BigInteger id)
{
	
	for(Map.Entry<Integer, Test> map : Tests.entrySet())
	{
		if(BigInteger.valueOf(map.getKey()) ==  id)
			return map.getValue();
	}
	
	return null;
}
}
	
