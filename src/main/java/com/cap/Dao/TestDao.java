package com.cap.Dao;

import java.math.BigInteger;

import com.cap.Util.TestCollection;
import com.cap.bean.Test;

public class TestDao implements Testinterface {
	TestCollection t=new TestCollection();

	@Override
	public Test getTest(BigInteger id) {
		// TODO Auto-generated method stub
		
		return  t.ShowTest(id);
	}


}


