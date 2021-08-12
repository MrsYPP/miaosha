package org.example.core;

/**
 * @author Mrs Yang
 * @date 2021/7/20 21:40
 */
public enum  ErrorEnum {
    NO_PERMISSION(503,"你没得权限"),
    NO_AUTH(501,"未登录"),
    NOT_FOUND(504, "未找到该资源!"),
    INTERNAL_SERVER_ERROR(500, "服务器异常请联系管理员"),
    PARAMETER_ERROR(406, "参数异常"),
    ;

    /** 错误码 */
    private Integer errorCode;

    /** 错误信息 */
    private String errorMsg;

    ErrorEnum(Integer errorCode, String errorMsg) {
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }

    public Integer getErrorCode() {
        return errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }
}
