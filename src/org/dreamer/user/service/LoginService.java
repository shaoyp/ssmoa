package org.dreamer.user.service;

import java.util.List;
import org.dreamer.user.model.User;

public interface LoginService {
	public List<User> userList();
	public User login(User user);
}
