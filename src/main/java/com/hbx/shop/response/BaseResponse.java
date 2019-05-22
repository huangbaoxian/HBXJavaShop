package com.hbx.shop.response;

import java.util.Map;

public class BaseResponse {

    public int code;
    public String message;
    public Map data;


    BaseResponse(int code, String message) {
        this.code = code;
        this.message = message;
    }


    BaseResponse(int code, String message, Map data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public static BaseResponse  successBaseResponse(){
        BaseResponse response = new BaseResponse(0, "成功");
        return response;
    }





    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Map getData() {
        return data;
    }

    public void setData(Map data) {
        this.data = data;
    }
}
