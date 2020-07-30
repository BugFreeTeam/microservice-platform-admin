package com.security.admin.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.anjuxing.platform.common.crud.CrudServiceImpl;
import com.anjuxing.platform.common.exception.ServiceException;
import com.security.admin.mapper.UmsResourceCategoryMapper;
import com.security.admin.model.UmsResourceCategory;
import com.security.admin.service.UmsResourceCategoryService;

/**
 * 资源分类表
 */
@Service("umsResourceCategoryService")
@Transactional(readOnly = true, rollbackFor = ServiceException.class)
public class UmsResourceCategoryServiceImpl extends CrudServiceImpl<UmsResourceCategoryMapper, UmsResourceCategory> implements UmsResourceCategoryService {

    @Autowired
    private UmsResourceCategoryMapper umsResourceCategoryMapper;


}