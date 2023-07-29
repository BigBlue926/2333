package com.example.stusystem.common;

import com.example.stusystem.common.enums.AppHttpCodeEnum;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)//值为null的不返回
//Serializable对象能够序列化

@Data
public class Result<T> implements Serializable {
    private Integer code;
    private String msg;
    private T data;

    public Result(Integer code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public Result() {
        this.code = AppHttpCodeEnum.SUCCESS.getCode();
        this.msg = AppHttpCodeEnum.SUCCESS.getMsg();
    }

    public Result(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Result(Integer code, T data) {
        this.code = code;
        this.data = data;
    }
    public Result(T data) {
        this.data = data;
    }
    public static Result success(){
        return new Result(200,"成功",null);
    }
    public static Result error(){
        return new Result(500,"失败",null);
    }
    public static Result success(AppHttpCodeEnum enums){
        return new Result(enums.getCode(),enums.getMsg());
    }
    public static Result error(AppHttpCodeEnum enums){
        return new Result(enums.getCode(),enums.getMsg());
    }
}
