package org.dreamer.user.dao.impl;

import java.util.List;

import org.dreamer.user.dao.LoginDao;
import org.dreamer.user.model.User;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class LoginDaoImpl extends HibernateDaoSupport implements LoginDao {

	@SuppressWarnings("unchecked")
	public List<User> userList() {
		return (List<User>) getHibernateTemplate().find("from User");
	}

	public User login(User user) {
		// TODO Auto-generated method stub
		return (User) getHibernateTemplate().find("from User u where u.name=? ",user.getName()).get(0);
	}

}
