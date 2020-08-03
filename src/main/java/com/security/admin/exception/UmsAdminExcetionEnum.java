package com.security.admin.exception;

public enum UmsAdminExcetionEnum {
    USER_EXIST("001","用户已存在"),
    USER_NAME_PASS_ERROR("002","用户名和密码错误");

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
