package com.woniu.vae.project.pojo.user.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author XXX <XXX@163.com>
 * @version V1.0.0
 * @description 实体
 * @date 2019/11/22 11:12
 */
@Data
@TableName("user")
public class User {
    @TableId
    private Long id;
    private String name;
    private Integer age;
    private String email;
}


