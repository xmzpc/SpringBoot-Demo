package com.xmzpc.demo.web;

import com.xmzpc.demo.common.result.Result;
import com.xmzpc.demo.convert.UserConvert;
import com.xmzpc.demo.dto.UserDTO;
import com.xmzpc.demo.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

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

    @Autowired
    private UserService userService;


    @RequestMapping(value = "/test",method = RequestMethod.GET)
    @ResponseBody
    public Result test(){
        List<UserDTO> userDtos = userService.selectAll();
        return Result.success(UserConvert.USER.convertList(userDtos));
    }
}
