package com.security.admin.controller;

import com.anjuxing.platform.common.base.JsonResult;
import com.anjuxing.platform.common.exception.ControllerException;
import com.anjuxing.platform.common.exception.ServiceException;
import com.anjuxing.platform.common.util.JsonResultUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.anjuxing.platform.common.crud.CrudController;
import com.security.admin.model.UmsAdmin;
import com.security.admin.service.UmsAdminService;

/**
 * 后台用户表
 */
@RestController
@RequestMapping(value = "/admin")
public class UmsAdminController extends CrudController<UmsAdminService, UmsAdmin> {

    private Logger log = LoggerFactory.getLogger(UmsAdminController.class);

    @Autowired
    private UmsAdminService umsAdminService;

    @PostMapping("/register")
    public JsonResult register(@RequestBody UmsAdmin model) throws ControllerException {
        umsAdminService.register(model);
        return JsonResultUtils.success();
    }

    @PostMapping("/login")
    public JsonResult login(@RequestBody UmsAdmin model){
        String token=umsAdminService.login(model);
        return JsonResultUtils.success(token);
    }

    @PostMapping("selectById")
    public JsonResult test(@RequestBody UmsAdmin model) throws ControllerException {
        UmsAdmin umsAdmin=umsAdminService.queryById(model.getId());
        return JsonResultUtils.success(umsAdmin);
    }

}

