package com.security.admin.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.anjuxing.platform.common.crud.CrudServiceImpl;
import com.anjuxing.platform.common.exception.ServiceException;
import com.security.admin.mapper.UmsResourceMapper;
import com.security.admin.model.UmsResource;
import com.security.admin.service.UmsResourceService;

/**
 * 后台资源表
 */
@Service("umsResourceService")
@Transactional(readOnly = true, rollbackFor = ServiceException.class)
public class UmsResourceServiceImpl extends CrudServiceImpl<UmsResourceMapper, UmsResource> implements UmsResourceService {

    @Autowired
    private UmsResourceMapper umsResourceMapper;


}