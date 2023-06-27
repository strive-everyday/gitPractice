package com.frankfurt.tryproject.domain;

import lombok.Data;

import java.math.BigInteger;

//管理员类

@Data
public class Employee {

    private BigInteger id;

    private String name;

    private String username;

    private String password;

    private String phone;

    private String sex;

    //身份证号
    private String idNumber;

    //状态
    private int status;

    private Long createTime;

    private Long updateTime;

    private BigInteger createUser;

    private BigInteger updateUser;


}
