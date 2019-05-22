package com.hbx.shop.controller;

import com.hbx.shop.response.BaseResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;


@Controller
public class BaseController {

    @Value("${test.str}")
    String testStr;


    @ResponseBody
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public BaseResponse start(){
        BaseResponse response = BaseResponse.successBaseResponse();
        Map<String, Object> map = new HashMap<>();
        map.put("content", testStr);
        response.setData(map);
        return response;
    }

}
