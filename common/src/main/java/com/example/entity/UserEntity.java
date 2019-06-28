package com.example.entity;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Mr.LB
 * @description: TODO
 * @date 2019/6/28 11:05
 */
@Getter
@Setter
public class UserEntity implements Serializable {

    private Integer userId;

    private String userName;

    private String nickname;

    private Integer age;

    private Integer sex;

    private Date createTime;
}
