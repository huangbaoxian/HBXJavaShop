package com.hbx.shop.controller;


import cn.teaey.apns4j.Apns4j;
import cn.teaey.apns4j.network.ApnsChannel;
import cn.teaey.apns4j.network.ApnsChannelFactory;
import cn.teaey.apns4j.network.async.ApnsFuture;
import cn.teaey.apns4j.network.async.ApnsService;
import cn.teaey.apns4j.protocol.ApnsPayload;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller
public class PushController {




    @RequestMapping("/push")
    @ResponseBody
    public String startPush(){


        try {
            String realPath = System.getProperty("user.dir") + "/tool/develop.p12";

            ApnsChannelFactory apnsChannelFactory = Apns4j.newChannelFactoryBuilder().keyStoreMeta(realPath).keyStorePwd("123456").build();
            ApnsChannel apnsChannel = apnsChannelFactory.newChannel();
            ApnsPayload apnsPayload = Apns4j.newPayload()
                    .alertTitle("xian")
                    .alertBody("Pushed by apns4j")
                    .sound("default");


            String deviceToken = "3bb8681ecc533aefc6494ea69442df8f6303fc873f7a478b04e4740ba3c49d14";

            ApnsService service = new ApnsService(10, apnsChannelFactory, 3);


            ApnsFuture  future = service.send(deviceToken, apnsPayload);
            if (future == null) {
                System.out.print("apnsFuture is null");
            }else  {
            }
            apnsChannel.close();

        }catch (Exception e) {
            System.out.print(e.getStackTrace());
        }



        return "";
    }


}
