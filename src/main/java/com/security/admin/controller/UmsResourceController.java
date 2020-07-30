package com.security.admin.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.anjuxing.platform.common.crud.CrudController;
import com.security.admin.model.UmsResource;
import com.security.admin.service.UmsResourceService;

/**
 * 后台资源表
 */
@RestController
@RequestMapping(value = "/resource")
public class UmsResourceController extends CrudController<UmsResourceService, UmsResource> {

    private Logger log = LoggerFactory.getLogger(UmsResourceController.class);

    @Autowired
    private UmsResourceService umsResourceService;


}

