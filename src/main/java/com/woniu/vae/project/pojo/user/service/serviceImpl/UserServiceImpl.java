package com.woniu.vae.project.pojo.user.service.serviceImpl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.woniu.vae.project.pojo.user.entity.User;
import com.woniu.vae.project.pojo.user.mapper.UserMapper;
import com.woniu.vae.project.pojo.user.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @author XXX <XXX@163.com>
 * @version V1.0.0
 * @description
 * @date 2019/11/29 15:22
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
    @Override
    public User getMyUser(String name) {
        return null;
    }
}
