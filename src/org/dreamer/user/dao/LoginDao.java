package org.dreamer.user.dao;

import java.util.List;
import org.dreamer.user.model.User;

public interface LoginDao {
	public List<User> userList();
	public User login(User user);
}
