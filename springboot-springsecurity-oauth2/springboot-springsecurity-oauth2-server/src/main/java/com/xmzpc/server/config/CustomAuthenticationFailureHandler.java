package com.xmzpc.server.config;

import com.xmzpc.common.result.Result;
import com.xmzpc.common.result.ResultCode;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
/**
 * Desciption:
 * 自定义登录失败
 * @Author: XMZPC.
 * Creation time: 2019/9/19 11:14:00.
 */
@Component
public class CustomAuthenticationFailureHandler implements AuthenticationFailureHandler {
    @Override
    public void onAuthenticationFailure(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, AuthenticationException e) throws IOException, ServletException {
        httpServletResponse.setHeader("Content-type", "text/html;charset=UTF-8");
        httpServletResponse.setCharacterEncoding("UTF-8");
        httpServletResponse.setStatus(401);
        httpServletResponse.getWriter().write(Result.failure(ResultCode.USER_LOGIN_ERROR).toString());
    }

}
