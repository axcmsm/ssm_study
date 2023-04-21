package com.axcmsm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * ClassName: com.axcmsm.controller.AxcmsmController
 * 微信公众号：代码飞快
 * Description:
 *
 * @author 须贺
 * @version 2023/4/21
 */
@Controller
public class AxcmsmController {

    @GetMapping("/hello")
    @ResponseBody
    public String hello() {
        System.out.println("hello...");
        return "hello!";
    }
}
