package com.wang.mpdemo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wang.mpdemo.bean.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper extends BaseMapper<User> {
}
