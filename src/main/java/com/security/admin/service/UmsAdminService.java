package com.security.admin.service;

import com.anjuxing.platform.common.crud.CrudService;
import com.security.admin.model.UmsAdmin;
import org.springframework.security.core.userdetails.UserDetails;

/**
 * 后台用户表
 */
public interface UmsAdminService extends CrudService<UmsAdmin> {

    /**
     * 获取用户信息
     */
    public UserDetails loadUserByUsername(String username);

    /**
     * 用户注册
     */
    public void register(UmsAdmin model) throws Exception;

    /**
     * 用户登录
     */
    public String login(UmsAdmin model);

}
