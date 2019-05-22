package com.hbx.shop.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class BaseController {

    /*
    * *@Value("${weixin.pay.notifyUrl}")
    String weixinNotifyUrl;
    * */

    @Value("${test.str}")
    String testStr;


    @ResponseBody
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String start(){
        System.out.print("start");
        System.out.print(testStr);
        String str = "new start" + testStr;
        return str;

    }

}
