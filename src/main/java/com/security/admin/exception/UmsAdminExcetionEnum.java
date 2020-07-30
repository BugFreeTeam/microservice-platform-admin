package com.security.admin.exception;

public enum UmsAdminExcetionEnum {
    USER_EXIST("402","用户已存在");

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
