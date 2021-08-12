package org.example.core;

/**
 * @author Mrs Yang
 * @date 2021/3/31 21:37
 */
public class Result<T> {

    private String msg;
    private Integer code;
    private T data;


    public Result(){}

    public Result<T> success(){
        return success("success",200);
    }

    public Result<T> success(T data){
        return success("success",200,data);
    }

    private Result<T> success(String msg,Integer code){
        this.code=code;
        this.msg=msg;
        return this;
    }

    private Result<T> success(String msg,Integer code,T data){
        this.code=code;
        this.msg=msg;
        this.data=data;
        return this;
    }

    public Result failure(String msg){
        this.msg=msg;
        this.code=400;
        return this;
    }


}
