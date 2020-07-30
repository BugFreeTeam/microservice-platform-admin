package com.security.admin.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.anjuxing.platform.common.crud.CrudController;
import com.security.admin.model.UmsAdminRoleRelation;
import com.security.admin.service.UmsAdminRoleRelationService;

/**
 * 后台用户和角色关系表
 */
@RestController
@RequestMapping(value = "/admin/role/relation")
public class UmsAdminRoleRelationController extends CrudController<UmsAdminRoleRelationService, UmsAdminRoleRelation> {

    private Logger log = LoggerFactory.getLogger(UmsAdminRoleRelationController.class);

    @Autowired
    private UmsAdminRoleRelationService umsAdminRoleRelationService;


}

