package com.xmzpc.demo.web;

import com.xmzpc.demo.common.result.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Desciption:
 *
 * @Author: XMZPC.
 * Creation time: 2019/9/10 10:02:00.
 *
 */
@Controller
@Slf4j
public class HelloController {




    @RequestMapping(value = "/test",method = RequestMethod.GET)
    @ResponseBody
    public Result test(){
        return Result.success();
    }
}
