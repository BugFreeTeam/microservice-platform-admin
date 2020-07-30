package com.security.admin.exception;

public class UmsAdminException extends RuntimeException {
    private String code;
    private String message;

    public UmsAdminException(UmsAdminExcetionEnum umsAdminExcetionCode) {
        super();
        this.code=umsAdminExcetionCode.getCode();
        this.message=umsAdminExcetionCode.getMessage();
    }

    public UmsAdminException(String code,String message){
        this.message=message;
        this.code=code;
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
