package com.security.admin.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.anjuxing.platform.common.crud.CrudServiceImpl;
import com.anjuxing.platform.common.exception.ServiceException;
import com.security.admin.mapper.UmsMenuMapper;
import com.security.admin.model.UmsMenu;
import com.security.admin.service.UmsMenuService;

/**
 * 后台菜单表
 */
@Service("umsMenuService")
@Transactional(readOnly = true, rollbackFor = ServiceException.class)
public class UmsMenuServiceImpl extends CrudServiceImpl<UmsMenuMapper, UmsMenu> implements UmsMenuService {

    @Autowired
    private UmsMenuMapper umsMenuMapper;


}