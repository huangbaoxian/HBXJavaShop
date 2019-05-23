package com.hbx.shop.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ProContrller {


    @Autowired
    private Environment environment;

    @RequestMapping("/index")
    @ResponseBody
    public String getVariable() {
        String index = environment.getProperty("test.str");

        String realPath = System.getProperty("user.dir");
        System.out.print(realPath);;

        return index;
    }


}
