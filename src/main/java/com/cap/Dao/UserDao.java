package com.cap.Dao;

import com.cap.Util.UserCollection;
import com.cap.bean.User;

public class UserDao implements Userinterface {
	UserCollection u=new UserCollection();

	@Override
	public User getUser(long id) {
		// TODO Auto-generated method stub
		return u.showuser(id);
	}

}


