package com.wang.mpdemo.bean;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.lang.reflect.Type;

@Data
public class User {
    private Long id;
    private String name;
    private Integer age;
    private String email;

    @Version
    @TableField(fill = FieldFill.INSERT)
    private Integer version;//版本号

    @TableLogic
    private Integer deleted;
}