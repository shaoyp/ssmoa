package org.dreamer.user.action;

import java.util.ArrayList;
import java.util.List;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
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
		//user = loginService.login(user);
		String error = null;  
        String username = user.getName();  
        String password = user.getPass();  
        Subject subject = SecurityUtils.getSubject();  
        Session session = subject.getSession();
        session.setAttribute("username", username);
        UsernamePasswordToken token = new UsernamePasswordToken(username, password);  
        try {  
        	token.setRememberMe(true);
            subject.login(token);  
        } catch (UnknownAccountException e) {  
            error = "用户名/密码错误";  
        } catch (IncorrectCredentialsException e) {  
            error = "用户名/密码错误";  
        } catch (AuthenticationException e) {  
            //其他错误，比如锁定，如果想单独处理请单独catch处理  
            error = "其他错误：" + e.getMessage();  
        }  
        if(error != null) {//出错了，返回登录页面  
            return "input";  
        } else {//登录成功  
            return "login";
        }  

	}
	public String show() {
		System.out.println("-----show action--");
		Subject subject = SecurityUtils.getSubject(); 
		Session session = subject.getSession();
		String name = (String) session.getAttribute("username");
		System.out.println(name);
		System.out.println(subject.isAuthenticated());
		System.out.println(subject.hasRole("role1"));
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
