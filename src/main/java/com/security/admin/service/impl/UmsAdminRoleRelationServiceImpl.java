package com.security.admin.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.anjuxing.platform.common.crud.CrudServiceImpl;
import com.anjuxing.platform.common.exception.ServiceException;
import com.security.admin.mapper.UmsAdminRoleRelationMapper;
import com.security.admin.model.UmsAdminRoleRelation;
import com.security.admin.service.UmsAdminRoleRelationService;

/**
 * 后台用户和角色关系表
 */
@Service("umsAdminRoleRelationService")
@Transactional(readOnly = true, rollbackFor = ServiceException.class)
public class UmsAdminRoleRelationServiceImpl extends CrudServiceImpl<UmsAdminRoleRelationMapper, UmsAdminRoleRelation> implements UmsAdminRoleRelationService {

    @Autowired
    private UmsAdminRoleRelationMapper umsAdminRoleRelationMapper;


}