package com.cap.Service;

import java.math.BigInteger;

import com.cap.Dao.TDao;
import com.cap.bean.Test;
import com.cap.bean.User;

public class TSService implements TSinterface {
	TDao t1=new TDao();

	@Override
	public Test getTest(BigInteger id) {
		// TODO Auto-generated method stub
	return	t1.getTest(id);
	}
}




