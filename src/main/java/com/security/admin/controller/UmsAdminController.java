package com.security.admin.controller;

import com.anjuxing.platform.common.base.JsonResult;
import com.anjuxing.platform.common.exception.ControllerException;
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
        JsonResult jsonResult=new JsonResult();
        umsAdminService.register(model);
        jsonResult.setMessage("注册成功");
        jsonResult.setResult(SUCCESS);
        jsonResult.setCode(JsonResult.SUCCESS_CODE);
        return jsonResult;
    }

    @PostMapping("/login")
    public JsonResult login(@RequestBody UmsAdmin model){
        JsonResult jsonResult=new JsonResult();
        String token=umsAdminService.login(model);
        jsonResult.setMessage("登录成功");
        jsonResult.setResult(SUCCESS);
        jsonResult.setCode(JsonResult.SUCCESS_CODE);
        jsonResult.setData(token);
        return jsonResult;
    }

}

