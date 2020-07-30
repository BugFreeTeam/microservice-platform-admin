package com.security.admin.exception;

public enum SystemExceptionEnum {
    SYS_ERROR("001","服务器异常！");

    private String code;
    private String message;

    private SystemExceptionEnum(String code, String message) {
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
