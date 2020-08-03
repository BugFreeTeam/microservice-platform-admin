package com.security.admin.exception;

public enum UmsAdminExcetionEnum {
    USER_NOT_LOGIN("001","用户未登录"),
    USER_EXIST("002","用户已存在"),
    USER_NAME_PASS_ERROR("003","用户名和密码错误"),
    USER_NOT_AUTH("004","该用户无此权限，请联系管理员");

    private String code;
    private String message;

    private UmsAdminExcetionEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
