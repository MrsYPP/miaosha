package org.example.core;

/**
 * @author Mrs Yang
 * @date 2021/7/20 21:34
 */
public class BizException extends RuntimeException {


    private Integer errCode;
    private String msg;

    public BizException(Integer errCode,String msg){
        this.errCode=errCode;
        this.msg=msg;
    }

    public BizException(){}


    public Integer getErrCode() {
        return errCode;
    }

    public void setErrCode(Integer errCode) {
        this.errCode = errCode;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
