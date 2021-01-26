package com.wang.mpdemo;

import com.wang.mpdemo.bean.User;
import com.wang.mpdemo.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MpdemoApplicationTests {

    @Autowired
    private UserMapper userMapper;
    @Test
    public void finAll() {
        List<User> users = userMapper.selectList(null);
        System.out.println(users);
    }

    @Test
    public void add(){
        User user = new User();
        user.setAge(11);
        user.setEmail("333");
        user.setName("wang");
        userMapper.insert(user);
    }

}
