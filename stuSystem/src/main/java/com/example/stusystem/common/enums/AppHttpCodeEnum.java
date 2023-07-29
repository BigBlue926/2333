package com.example.stusystem.common.enums;


public enum AppHttpCodeEnum {
    SUCCESS(200,"操作成功"),
    ERROR(0,"操作失败");



    int code;
    String msg;

    AppHttpCodeEnum(int code, String message) {
        this.msg = message;
        this.code = code;
    }
    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
