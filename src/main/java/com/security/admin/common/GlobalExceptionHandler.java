package com.security.admin.common;

import com.anjuxing.platform.common.base.JsonResult;
import com.anjuxing.platform.common.util.JsonResultUtils;
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
        return JsonResultUtils.error(UmsAdminExcetionEnum.USER_NAME_PASS_ERROR.getCode(),UmsAdminExcetionEnum.USER_NAME_PASS_ERROR.getMessage());
    }


    @ExceptionHandler(value = UmsAdminException.class)
    @ResponseBody
    public JsonResult UmsAdminHandler(UmsAdminException e){
        return JsonResultUtils.error(e.getCode(),e.getMessage());
    }

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public JsonResult defaultErrorHandler(Exception e) throws Exception {
        log.error("系统错误，原因为："+e);
        return JsonResultUtils.error("未知异常，请联系系统管理员！");
    }

}
