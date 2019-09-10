package com.xmzpc.demo.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Desciption:
 *
 * @Author: XuMingZhi.
 * Creation time: 2019/9/10 10:02:00.
 * © Copyright 2013-2019, UCar.
 */
@Controller
@Slf4j
public class HelloController {

    @RequestMapping(value = "/test",method = RequestMethod.GET)
    @ResponseBody
    public String test(){
        return "Hello World!";
    }
}
