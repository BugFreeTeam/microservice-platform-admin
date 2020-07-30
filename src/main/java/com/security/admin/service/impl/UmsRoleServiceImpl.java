package com.security.admin.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.anjuxing.platform.common.crud.CrudServiceImpl;
import com.anjuxing.platform.common.exception.ServiceException;
import com.security.admin.mapper.UmsRoleMapper;
import com.security.admin.model.UmsRole;
import com.security.admin.service.UmsRoleService;

/**
 * 后台用户角色表
 */
@Service("umsRoleService")
@Transactional(readOnly = true, rollbackFor = ServiceException.class)
public class UmsRoleServiceImpl extends CrudServiceImpl<UmsRoleMapper, UmsRole> implements UmsRoleService {

    @Autowired
    private UmsRoleMapper umsRoleMapper;


}