package com.xmzpc.resource.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * Desciption:
 *
 * @Author: XMZPC.
 * Creation time: 2019/9/18 9:34:00.
 */
@Data
public class ResponseDTO implements Serializable{
    private String access_token;
    private String token_type;
    private String expires_in;
    private String scope;

}
