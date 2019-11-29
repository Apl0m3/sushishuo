package com.woniu.vae.project.pojo.user.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.woniu.vae.project.pojo.user.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 *  
 * @author XXX <XXX@163.com>
 * @date 2019/11/29 15:26
 * @param 
 * @return 
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
    User getMyUser(@Param("name")String name);
}
