package com.security.admin.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.anjuxing.platform.common.crud.CrudController;
import com.security.admin.model.UmsResourceCategory;
import com.security.admin.service.UmsResourceCategoryService;

/**
 * 资源分类表
 */
@RestController
@RequestMapping(value = "/resource/category")
public class UmsResourceCategoryController extends CrudController<UmsResourceCategoryService, UmsResourceCategory> {

    private Logger log = LoggerFactory.getLogger(UmsResourceCategoryController.class);

    @Autowired
    private UmsResourceCategoryService umsResourceCategoryService;


}

