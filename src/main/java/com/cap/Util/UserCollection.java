package com.cap.Util;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.omg.CORBA.TCKind;

import com.cap.bean.*;
public class UserCollection {
	private static Map<Integer,User> Users=new HashMap<Integer,User>();
	
	static TestCollection tColl = new TestCollection();
	
	static Map<Integer, Test> map = tColl.ShowTest();  
	static Test test1 = map.get(1001);                          //creating test1

	
	static Map<Integer, Test> map1 = tColl.ShowTest();
	static Test test2 = map.get(1002);                         //creating test2
	
	static Map<Integer, Test> map2 = tColl.ShowTest();
	static Test test3 = map.get(1003);                         //creating test3
	

	static
	{
		
		Users.put(1001, new User(Long.valueOf(1001),"Nikhil",test1,false,"Kapil@118"));
		Users.put(1002, new User(Long.valueOf(1002),"Sumit",test2,false,"Sumit@1"));
		Users.put(1003, new User(Long.valueOf(1003),"Ram",test3,false,"Ram@31"));
		Users.put(1004, new User(Long.valueOf(1004),"Akhil",test1,false,"Ram@11"));
		
		
		Users.put(1005, new User(Long.valueOf(1005),"Lakhan",test2,false,"lqW@1"));
		Users.put(1006, new User(Long.valueOf(1006),"Punam",test1,false,"Kap@1"));
		Users.put(1007, new User(Long.valueOf(1007),"Aditya",test2,false,"pil@11"));
		Users.put(1008, new User(Long.valueOf(1008),"Jatin",test3,false,"Kil@11"));
	}
	public static Map<Integer, User> ShowUser()
	{
		return Users;
	}
	public static User showuser(long id)
	
	{
		for(Map.Entry<Integer, User> map : Users.entrySet())
		{
			if(map.getKey()==id)
				return map.getValue();
		}
		return null;
	}

}
