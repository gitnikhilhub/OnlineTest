 package com.cap.Service;

import java.math.BigInteger;
import java.util.Map;

import com.cap.Dao.QDao;
import com.cap.bean.Question;

public class QSService implements QSinterface {
	QDao q1=new QDao();

	@Override
	public Map getQuestionMap(Integer id) {
		// TODO Auto-generated method stub
		
		//System.out.println(q1.getQuestionMap().get(id));
		return q1.getQuestionMap();
	}

}
