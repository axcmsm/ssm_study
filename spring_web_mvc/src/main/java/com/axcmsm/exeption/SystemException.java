package com.axcmsm.exeption;

/**
 * ClassName: com.axcmsm.exeption.SystemException
 * 微信公众号：代码飞快
 * Description:
 *
 * @author 须贺
 * @version 2023/4/21
 */
public class SystemException extends RuntimeException{
    private Integer code;

    public Integer getCode() {
        return code;
    }

    public SystemException(Integer code) {
        this.code = code;
    }

    public SystemException(String message, Integer code) {
        super(message);
        this.code = code;
    }

    public SystemException(String message, Throwable cause, Integer code) {
        super(message, cause);
        this.code = code;
    }

    public SystemException(Throwable cause, Integer code) {
        super(cause);
        this.code = code;
    }

    public SystemException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, Integer code) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.code = code;
    }
}
