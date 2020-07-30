package com.security.admin.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.anjuxing.platform.common.crud.CrudController;
import com.security.admin.model.UmsRoleResourceRelation;
import com.security.admin.service.UmsRoleResourceRelationService;

/**
 * 后台角色资源关系表
 */
@RestController
@RequestMapping(value = "/role/resource/relation")
public class UmsRoleResourceRelationController extends CrudController<UmsRoleResourceRelationService, UmsRoleResourceRelation> {

    private Logger log = LoggerFactory.getLogger(UmsRoleResourceRelationController.class);

    @Autowired
    private UmsRoleResourceRelationService umsRoleResourceRelationService;


}

