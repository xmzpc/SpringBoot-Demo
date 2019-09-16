package com.xmzpc.demo.service.impl;

import com.google.common.collect.Lists;
import com.xmzpc.demo.dto.PermissionDTO;
import com.xmzpc.demo.dto.UserDTO;
import com.xmzpc.demo.service.PermissionService;
import com.xmzpc.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Desciption:
 *
 * @Author: XMZPC.
 * Creation time: 2019/9/16 14:20:00.
 */
@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserService userService;

    @Autowired
    private PermissionService permissionService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserDTO userDTO = userService.getByUsername(username);
        List<GrantedAuthority> grantedAuthorities = Lists.newArrayList();
        if (userDTO != null) {
            // 获取用户授权
            List<PermissionDTO> permissionDTOS = permissionService.selectByUserId(userDTO.getId());

            // 声明用户授权
            permissionDTOS.forEach(permissionDTO -> {
                if (permissionDTO != null && permissionDTO.getEnname() != null) {
                    GrantedAuthority grantedAuthority = new SimpleGrantedAuthority(permissionDTO.getEnname());
                    grantedAuthorities.add(grantedAuthority);
                }
            });
        }
        return new User(userDTO.getUsername(), userDTO.getPassword(), grantedAuthorities);
    }

}
