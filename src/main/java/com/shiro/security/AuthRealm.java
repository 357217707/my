package com.shiro.security;


import com.entity.User;
import com.service.UsersService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Author:chwenwei
 * @Description
 * @Date: Creeated in 13:43 2018/3/2
 */
public class AuthRealm extends AuthorizingRealm{
    @Autowired
    private UsersService userService;
    public static final String SESSION_USER_KEY = "user";

    /**
     * 授权查询回调函数, 进行鉴权但缓存中无用户的授权信息时调用,负责在应用程序中决定用户的访问控制的方法
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection arg0) {
        User user = (User) SecurityUtils.getSubject().getSession().getAttribute(AuthRealm.SESSION_USER_KEY);
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        //info.addRole(user.getRole().trim());
        return info;
    }

    /**
     * 认证回调函数，登录信息和用户验证信息验证
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(
            AuthenticationToken authcToken) throws AuthenticationException {
        // 1、把AuthenticationToken转换为UsernamePasswordToken
        UsernamePasswordToken usernamePasswordToken = (UsernamePasswordToken) authcToken;

        // 2、从UsernamePasswordToken中获取username
        String username = usernamePasswordToken.getUsername();

        // 3、调用数据库的方法，从数据库中查询username对应的用户记录
        User user = userService.getUserByUsername(username);
        if(user == null)
            return null; // 异常处理，找不到数据
        // 设置session
        Session session = SecurityUtils.getSubject().getSession();
        session.setAttribute(AuthRealm.SESSION_USER_KEY, user);
        //当前 Realm 的 name
        String realmName = this.getName();
        //登陆的主要信息: 可以是一个实体类的对象, 但该实体类的对象一定是根据 token 的 username 查询得到的.

        return new SimpleAuthenticationInfo(user, user.getPassword(), realmName);
    }



    //一定要写getset方法
    public UsersService getUserService() {
        return userService;
    }

    public void setUserService(UsersService userService) {
        this.userService = userService;
    }

}
