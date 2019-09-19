package com.xmzpc.server.web;

import com.xmzpc.common.result.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import springfox.documentation.annotations.ApiIgnore;

/**
 * Desciption:
 *
 * @Author: XMZPC.
 * Creation time: 2019/9/10 10:02:00.
 *
 */

@Api(value = "用户Controller")
@Controller
@Slf4j
public class HelloController {

    @Autowired
    private RedisTemplate redisTemplate;

    @ApiIgnore
    @RequestMapping(value = "/test",method = RequestMethod.GET)
    @ResponseBody
    public Result test(){
        redisTemplate.opsForValue().set("test","111");
        log.info("redisTemplate Set");
        return Result.success();
    }

    @ApiOperation(value = "用户登录", notes = "重定向至Spring Secrity 内置登录页面")
    @GetMapping("/user/login")
    public String login(){

        return "redirect:http://localhost:8080/oauth/authorize?client_id=client&response_type=code";
    }
}
