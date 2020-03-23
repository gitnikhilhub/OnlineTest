package com.cap.Service;

import java.math.BigInteger;

import com.cap.bean.Test;
import com.cap.bean.User;

public interface TSinterface {
	Test getTest(BigInteger id);
	User getUser(long id);
	
}	



