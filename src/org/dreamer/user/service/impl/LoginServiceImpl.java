package org.dreamer.user.service.impl;

import java.util.List;

import org.dreamer.user.dao.LoginDao;
import org.dreamer.user.model.User;
import org.dreamer.user.service.LoginService;

public class LoginServiceImpl implements LoginService {
	private LoginDao loginDao;

	public List<User> userList() {
		List<User> users = loginDao.userList();

		return users;
	}

	public User login(User user) {
		
		return loginDao.login(user);
	}
	public LoginDao getLoginDao() {
		return loginDao;
	}

	public void setLoginDao(LoginDao loginDao) {
		this.loginDao = loginDao;
	}


}
