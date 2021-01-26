package com.wang.mpdemo.bean;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.lang.reflect.Type;

@Data
public class User {
    private Long id;
    private String name;
    private Integer age;
    private String email;
}