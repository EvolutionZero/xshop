package com.victoria.xshop.common.utils.security;

import com.victoria.xshop.project.user.bean.po.User;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;

/**
 * shiro 工具类
 *
 * @author ruoyi
 */
public class ShiroUtils
{

    public static Subject getSubjct()
    {
        return SecurityUtils.getSubject();
    }

    public static void logout()
    {
        getSubjct().logout();
    }

    public static User getUser()
    {
        return (User) getSubjct().getPrincipal();
    }

    public static Long getUserId()
    {
        return getUser().getId().longValue();
    }

    public static String getLoginName()
    {
        return getUser().getUsername();
    }

    public static String getIp()
    {
        return getSubjct().getSession().getHost();
    }

    public static String getSessionId()
    {
        return String.valueOf(getSubjct().getSession().getId());
    }
}
