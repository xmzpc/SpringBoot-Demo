package com.xmzpc.server.config;

import com.xmzpc.common.result.Result;
import com.xmzpc.common.result.ResultCode;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.access.AccessDeniedHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
/**
 * Desciption:
 * 没有权限
 * @Author: XMZPC.
 * Creation time: 2019/9/19 12:57:00.
 */
@Component
public class CustomAccessDeniedHandler implements AccessDeniedHandler {
    @Override
    public void handle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, AccessDeniedException e) throws IOException, ServletException {

        httpServletResponse.setHeader("Content-type", "text/html;charset=UTF-8");
        httpServletResponse.setCharacterEncoding("UTF-8");
        httpServletResponse.setStatus(403);
        httpServletResponse.getWriter().write(Result.failure(ResultCode.PERMISSION_NO_ACCESS).toString());
    }
}
