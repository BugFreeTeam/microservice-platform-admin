package com.security.admin.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.anjuxing.platform.common.crud.CrudServiceImpl;
import com.anjuxing.platform.common.exception.ServiceException;
import com.security.admin.mapper.UmsRoleMenuRelationMapper;
import com.security.admin.model.UmsRoleMenuRelation;
import com.security.admin.service.UmsRoleMenuRelationService;

/**
 * 后台角色菜单关系表
 */
@Service("umsRoleMenuRelationService")
@Transactional(readOnly = true, rollbackFor = ServiceException.class)
public class UmsRoleMenuRelationServiceImpl extends CrudServiceImpl<UmsRoleMenuRelationMapper, UmsRoleMenuRelation> implements UmsRoleMenuRelationService {

    @Autowired
    private UmsRoleMenuRelationMapper umsRoleMenuRelationMapper;


}