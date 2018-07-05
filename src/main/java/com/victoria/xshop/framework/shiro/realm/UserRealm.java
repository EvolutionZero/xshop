package com.victoria.xshop.framework.shiro.realm;

import com.victoria.xshop.project.user.model.User;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

import java.util.HashSet;

/**
 * 自定义Realm 处理登录 权限
 * 
 * @author ruoyi
 */
@Slf4j
public class UserRealm extends AuthorizingRealm
{


    /**
     * 授权
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection arg0)
    {
        String username = (String)SecurityUtils.getSubject().getPrincipal();
        if("xero1993".equals(username)){
            SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
            // 角色加入AuthorizationInfo认证对象
            HashSet<String> roles = new HashSet<>();
            HashSet<String> permissions = new HashSet<>();
            roles.add("system");
            permissions.add("system:read");
            permissions.add("system:write");

            info.setRoles(roles);
            // 权限加入AuthorizationInfo认证对象
            info.setStringPermissions(permissions);
            return info;

        }
        return new SimpleAuthorizationInfo();
    }

    /**
     * 登录认证
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException
    {
        UsernamePasswordToken upToken = (UsernamePasswordToken) token;
        String username = upToken.getUsername();
        String password = "";

        if (upToken.getPassword() != null)
        {
            password = new String(upToken.getPassword());
        }

        if("xero1993".equals(username) && "123456".equals(password)){
            User user = new User();
            user.setUsername("xero1993");
            user.setPassword("123456");
            SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(user, password, getName());
            return info;
        } else {
            throw new AuthenticationException();
        }


    }

}
