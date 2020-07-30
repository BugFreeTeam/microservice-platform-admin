package com.security.admin.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.anjuxing.platform.common.crud.CrudServiceImpl;
import com.anjuxing.platform.common.exception.ServiceException;
import com.security.admin.mapper.UmsRoleResourceRelationMapper;
import com.security.admin.model.UmsRoleResourceRelation;
import com.security.admin.service.UmsRoleResourceRelationService;

/**
 * 后台角色资源关系表
 */
@Service("umsRoleResourceRelationService")
@Transactional(readOnly = true, rollbackFor = ServiceException.class)
public class UmsRoleResourceRelationServiceImpl extends CrudServiceImpl<UmsRoleResourceRelationMapper, UmsRoleResourceRelation> implements UmsRoleResourceRelationService {

    @Autowired
    private UmsRoleResourceRelationMapper umsRoleResourceRelationMapper;


}