package org.dreamer.realm;

import java.util.HashSet;
import java.util.Set;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.dreamer.user.model.User;

public class UserRealm extends AuthorizingRealm {

	@SuppressWarnings("unchecked")
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
//		String username = (String)principals.getPrimaryPrincipal();  
        SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo(); 
        //TODO �����ݿ���
        Set set = new HashSet();
        set.add("role1");
        set.add("role2");
        authorizationInfo.setRoles(set); 
        set = new HashSet();
        set.add("user:create");
        set.add("user:update");
        authorizationInfo.setStringPermissions(set);  
        return authorizationInfo;  
	}

	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(
			AuthenticationToken token) throws AuthenticationException {
//		String username = (String)token.getPrincipal();  
        User user = new User(); 
        user.setName("admin");
        user.setPass("123");
        if(user == null) {  
            throw new UnknownAccountException();//û�ҵ��ʺ�  
        }  
        //����AuthenticatingRealmʹ��CredentialsMatcher��������ƥ�䣬��������˼ҵĲ��ÿ����ڴ��жϻ��Զ���ʵ��  
        SimpleAuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(  
                user.getName(), //�û���  
                user.getPass(), //����  
//                ByteSource.Util.bytes(user.getCredentialsSalt()),//salt=username+salt  
                getName()  //realm name  
        );  
        return authenticationInfo; 
	}

}
