package com.woniu.vae.project.pojo.user.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.woniu.vae.project.pojo.user.entity.User;

/**
 * @author XXX <XXX@163.com>
 * @version V1.0.0
 * @description
 * @date 2019/11/29 15:20
 */
public interface UserService extends IService<User> {

    User getMyUser(String name);

}
