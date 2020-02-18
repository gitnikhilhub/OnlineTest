package com.cap.Service;

import java.math.BigDecimal;
import java.util.Scanner;
import java.util.Set;

import com.cap.Dao.UDao;
import com.cap.bean.Question;
import com.cap.bean.Test;
import com.cap.bean.User;

public class USService implements USinterface {
	UDao u1=new UDao();

	@Override
	public User getUser(long id) {
		// TODO Auto-generated method stub
		
		return u1.getUser(id);
		
	}
	
}


