package com.cap.Service;

import java.math.BigInteger;

import com.cap.Dao.TestDao;
import com.cap.bean.Test;
import com.cap.bean.User;

public class TestService implements TSinterface {
	TestDao t1=new TestDao();

	@Override
	public Test getTest(BigInteger id) {
		// TODO Auto-generated method stub
	return	t1.getTest(id);
	}
}




