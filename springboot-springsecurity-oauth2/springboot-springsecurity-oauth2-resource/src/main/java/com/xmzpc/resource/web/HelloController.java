package com.xmzpc.resource.web;

import com.xmzpc.common.result.Result;
import com.alibaba.fastjson.JSON;
import com.google.common.base.Strings;
import com.xmzpc.common.result.ResultCode;
import com.xmzpc.resource.dto.ResponseDTO;
import com.xmzpc.resource.service.ContentService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
/**
 * Desciption:
 *
 * @Author: XMZPC.
 * Creation time: 2019/9/17 13:38:00.
 */
@Api(value = "资源服务器Controller")
@Slf4j
@Controller
public class HelloController {


    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private ContentService contentService;

    /**
     * 获取全部资源
     *
     * @return
     */
    @ApiOperation(value = "查询所有content",notes = "查询所有content")
    @GetMapping("/")
    @ResponseBody
    public Result  selectAll() {
      return Result.success(contentService.selectAll());

    }

    @ApiOperation(value = "登录成功查询所有content",notes = "根据授权码获取令牌")
    @ApiImplicitParam(name = "code", value = "授权码", required = true)
    @GetMapping("/redirect")
    public String getToken(@RequestParam String code){
        log.info("receive code {}",code);
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
        MultiValueMap<String, String> params= new LinkedMultiValueMap<>();
        params.add("grant_type","authorization_code");
        params.add("code",code);
        params.add("client_id","client");
        params.add("client_secret","secret");
        params.add("redirect_uri","http://localhost:8081/contents/redirect");
        HttpEntity<MultiValueMap<String, String>> requestEntity = new HttpEntity<>(params, headers);
        ResponseEntity<String> response = restTemplate.postForEntity("http://client:secret@localhost:8080/oauth/token", requestEntity, String.class);
        String token = response.getBody();
        ResponseDTO responseDTO= JSON.parseObject(token,ResponseDTO.class);
        if(Strings.isNullOrEmpty(responseDTO.getAccess_token())) {
            return Result.failure(ResultCode.FAILURE).toString();
        }
        return "redirect:http://localhost:8081/contents?access_token="+responseDTO.getAccess_token();
    }


}
