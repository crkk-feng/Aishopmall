package com.xunqi.gulimall.thirdparty.controller;

import com.xunqi.common.utils.R;
import com.xunqi.gulimall.thirdparty.component.SmsComponent;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @Description:
 * @Created: with IntelliJ IDEA.
 * @author: Crkkk
 * @createTime: 2022-06-27 10:04
 **/

@Controller
@RequestMapping(value = "/sms")
public class SmsSendController {

    @Resource
    private SmsComponent smsComponent;

    /**
     * 提供给别的服务进行调用
     * @param phone
     * @param code
     * @return
     */
    @ResponseBody
    @GetMapping(value = "/sendCode")
    public R sendCode(@RequestParam("phone") String phone, @RequestParam("code") String code) {

        //发送验证码
//        smsComponent.sendCode(phone,code);
        System.out.println(phone+code);
        return R.ok();
    }

}
