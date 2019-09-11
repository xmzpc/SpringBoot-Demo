package com.xmzpc.demo.convert;

import com.xmzpc.demo.dto.UserDTO;
import com.xmzpc.demo.vo.UserVO;
import org.mapstruct.Mapper;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * Desciption:
 *
 * @Author: XMZPC.
 * Creation time: 2019/9/10 14:35:00.
 */

@Mapper
public interface UserConvert {

    User USER = Mappers.getMapper(User.class);
    @Mapper
    interface User {
        /**
         * 功能描述: <br>
         * 〈DTO和Vo转换〉
         * @Param: [template]
         * @Return: com.xmzpc.demo.vo.UserVo
         * @Author: XuMingZhi
         * @Date: 2019/9/10 14:52
         */
        @Mappings({})
        UserVO convert(UserDTO template);

        /**
         * 功能描述: <br>
         * 〈集合转换〉
         * @Param: [template]
         * @Return: java.util.List<com.xmzpc.demo.vo.UserVo>
         * @Author: XuMingZhi
         * @Date: 2019/9/10 14:52
         */
        @Mappings({})
        List<UserVO> convertList(List<UserDTO> template);

    }
}
