   package com.cap.Service;

public interface Validation {
	String pattern1="[1-9][0-9][0-9][0-9]";
	String testid="[1-9][0-9][0-9][0-9]";
	String questionid="[1-9][0-9][0-9][0-9]";
	String userName="[A-Z]*";
	String pattern="((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,20})";
	
	public static boolean validatedata(String data,String pattern)
	{
		return data.matches(pattern);
	}
	
	public static boolean validatedata1(String data,String pattern1)
	{
		return data.matches(pattern1);
	}

}

	
	




