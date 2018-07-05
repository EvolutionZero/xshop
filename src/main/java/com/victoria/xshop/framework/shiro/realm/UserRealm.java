package com.victoria.xshop.framework.shiro.realm;

import com.victoria.xshop.project.user.bean.po.User;
import com.victoria.xshop.project.user.dao.AuthDao;
import com.victoria.xshop.project.user.dao.RoleDao;
import com.victoria.xshop.project.user.dao.UserDao;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;


/**
 * 自定义Realm 处理登录 权限
 * 
 * @author ruoyi
 */
@Slf4j
public class UserRealm extends AuthorizingRealm
{

    @Autowired
    private UserDao userDao;

    @Autowired
    private RoleDao roleDao;

    @Autowired
    private AuthDao authDao;
    /**
     * 授权
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection arg0)
    {
        User user = (User)SecurityUtils.getSubject().getPrincipal();
        if(user != null && user.getId() != null){
            SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
            // 角色加入AuthorizationInfo认证对象

            info.setRoles(roleDao.findRoleByUserId(user.getId()));
            // 权限加入AuthorizationInfo认证对象
            info.setStringPermissions(authDao.findAuthByUserId(user.getId()));
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

        User user = userDao.login(username, password);
        if(user != null && user.getId() != null){
            SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(user, user.getPassword(), getName());
            return info;
        } else {
            throw new AuthenticationException();
        }

    }

}
