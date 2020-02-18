package com.cap.Dao;
import java.math.BigInteger;
import java.util.Map;

import com.cap.Util.QuestionCollection;
import com.cap.bean.*;

public class QDao implements Qinterface {
	QuestionCollection q=new QuestionCollection();

	@Override
	public Map getQuestionMap() {
		// TODO Auto-generated method stub
		//System.out.println(q.Show().get(id));
		
		return q.Show();
	}



}
