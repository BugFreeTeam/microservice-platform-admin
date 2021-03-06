package com.security.admin.common;

import cn.hutool.json.*;
import com.anjuxing.platform.common.base.JsonResult;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * 日志切面类
 */
@Aspect
@Component
public class LogAspect {

    private Logger log= LoggerFactory.getLogger(LogAspect.class);

    @Pointcut("execution(public * com.security.admin.controller..*.*(..))")
    public void controllerMethod() {
    }

    /**
     * 方法执行前
     *
     * @param joinPoint
     * @throws Exception
     */
    @Before("controllerMethod()")
    public void LogRequestInfo(JoinPoint joinPoint) throws Exception {

        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();

        StringBuilder requestLog = new StringBuilder();
        Signature signature = joinPoint.getSignature();
        requestLog.append("请求信息：").append("URL = {").append(request.getRequestURI()).append("},\t")
                .append("请求方式 : {").append(request.getMethod()).append("},\t")
                .append("请求IP :{").append(request.getRemoteAddr()).append("},\t")
                .append("类方法 :{").append(signature.getDeclaringTypeName()).append(".")
                .append(signature.getName()).append("},\t");

        // 处理请求参数
        String[] paramNames = ((MethodSignature) signature).getParameterNames();
        Object[] paramValues = joinPoint.getArgs();
        int paramLength = null == paramNames ? 0 : paramNames.length;
        if (paramLength == 0) {
            requestLog.append("请求参数 : {} ");
        } else {
            requestLog.append("请求参数 : [");
            for (int i = 0; i < paramLength - 1; i++) {
                requestLog.append(paramNames[i]).append(":").append(JSONUtil.toJsonStr(paramValues[i])).append(",");
            }
            requestLog.append(paramNames[paramLength - 1]).append(":").append(JSONUtil.toJsonStr(paramValues[paramLength - 1])).append("]");
        }

        log.info(requestLog.toString());
    }


    /**
     * 方法执行后
     *
     * @param resultVO
     * @throws Exception
     */
    @AfterReturning(returning = "resultVO", pointcut = "controllerMethod()")
    public void logResultVOInfo(JsonResult resultVO) throws Exception {
        log.info("请求结果：" + JSONUtil.toJsonStr(resultVO));
    }


}


