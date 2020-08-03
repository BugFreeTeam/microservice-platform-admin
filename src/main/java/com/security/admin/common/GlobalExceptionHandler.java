package com.security.admin.common;

import com.anjuxing.platform.common.base.JsonResult;
import com.security.admin.exception.UmsAdminException;
import com.security.admin.exception.UmsAdminExcetionEnum;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 全局异常处理类
 */
@ControllerAdvice
public class GlobalExceptionHandler {
    private Logger log= LoggerFactory.getLogger(GlobalExceptionHandler.class);

    @ExceptionHandler(value = UsernameNotFoundException.class)
    @ResponseBody
    public JsonResult usernameNotFoundHandler(UsernameNotFoundException e) throws Exception {
        JsonResult jsonResult = new JsonResult();
        jsonResult.setResult(JsonResult.FAILURE);
        jsonResult.setCode(UmsAdminExcetionEnum.USER_NAME_PASS_ERROR.getCode());
        jsonResult.setMessage(UmsAdminExcetionEnum.USER_NAME_PASS_ERROR.getMessage());
        return jsonResult;
    }


    @ExceptionHandler(value = UmsAdminException.class)
    @ResponseBody
    public JsonResult UmsAdminHandler(UmsAdminException e){
        JsonResult jsonResult = new JsonResult();
        jsonResult.setResult(JsonResult.FAILURE);
        jsonResult.setCode(e.getCode());
        jsonResult.setMessage(e.getMessage());
        return jsonResult;
    }

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public JsonResult defaultErrorHandler(Exception e) throws Exception {
        JsonResult jsonResult = new JsonResult();
        jsonResult.setResult(JsonResult.FAILURE);
        jsonResult.setCode(JsonResult.FAILURE_CODE);
        jsonResult.setMessage("未知异常，请联系系统管理员！");
        log.error("系统错误，原因为："+e);
        return jsonResult;
    }

}
