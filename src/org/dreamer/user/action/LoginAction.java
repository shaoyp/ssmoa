package org.dreamer.user.action;

import java.util.ArrayList;
import java.util.List;

import org.dreamer.user.model.User;
import org.dreamer.user.service.LoginService;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6265208834495324984L;
	private List<User> users = new ArrayList<User>();
	private User user ;
	private LoginService loginService;

	public String login() {
		System.out.println("-----login action--:"+user.getName()+" "+user.getPass());
		user = loginService.login(user);

		return "login";

	}
	public String show() {
		System.out.println("-----show action--");
		users = loginService.userList();
		System.out.println("-----show action--:"+users.size());
		return "show";

	}

	public List<User> getUsers() {
		return users;
	}
	public void setUsers(List<User> users) {
		this.users = users;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public LoginService getLoginService() {
		return loginService;
	}

	public void setLoginService(LoginService loginService) {
		this.loginService = loginService;
	}

}
