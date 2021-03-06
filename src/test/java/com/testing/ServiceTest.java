package com.testing;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;
import java.math.BigInteger;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.cap.Service.TestService;
import com.cap.Service.Validation;
import com.cap.Util.QuestionCollection;
import com.cap.bean.Question;

class ServiceTest {

	@Test
	void test() {
		
		TestService u = new TestService();
		assertFalse(u.getUser(1001).isAdmin());
		
		
	}
	@Test
	void test1() {
		QuestionCollection q=new QuestionCollection();
		Question g =new Question(BigInteger.valueOf(1001),null,"Select true statement about constructor",2,BigDecimal.valueOf(3.0),2,BigDecimal.valueOf(3.0));
		assertEquals(g.getQuestionId(), q.Show().get(1001).getQuestionId());
	}
	
	@Test
	
	void test2()
	{	boolean b=Validation.validatedata("1001","1001");
		assertTrue(b);
		
	}
	@Test
	void test3()
	{
		boolean b1=Validation.validatedata1("Kapil@118", "Kapil@118");
		assertTrue(b1);
	}
}
