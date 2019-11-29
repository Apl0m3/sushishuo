package com.woniu.vae.project.controller.login;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.woniu.vae.common.utils.result.R;
import com.woniu.vae.project.pojo.user.entity.User;
import com.woniu.vae.project.pojo.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author XXX <XXX@163.com>
 * @version V1.0.0
 * @description 登录
 * @date 2019/11/22 11:20
 */
@RestController
@RequestMapping("api")
public class LoginController {
    @Autowired
    UserService userService;

    @RequestMapping("/login")
    public R login(@RequestBody User user) {
        // 对 html 标签进行转义，防止 XSS 攻击
        String username = user.getName();
        String email = user.getEmail();
        QueryWrapper<User> userQueryWrapper = new QueryWrapper<>();
        userQueryWrapper.eq("email",email);
        User myUser = userService.getMyUser(username);
        User one = userService.getOne(userQueryWrapper);
        if(one != null){
            if (username == one.getName()){
                return  R.ok().put("user",one);
            }else {
                return R.error("输入有误!");
            }
        }else{
            return R.error("输入有误!");
        }
    }

}
