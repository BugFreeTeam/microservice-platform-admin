package com.security.admin.exception;

public class SysException extends RuntimeException {
    private String code;
    private String message;

    public SysException(SystemExceptionEnum sysException) {
        super();
        this.code=sysException.getCode();
        this.message=sysException.getMessage();
    }

    public SysException(String code,String message){
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
