package com.wang.mpdemo;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.wang.mpdemo.bean.User;
import com.wang.mpdemo.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;
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
        user.setAge(27);
        user.setEmail("ww@qq.com");
        user.setName("wang");
        userMapper.insert(user);
    }


    @Test
    public void update(){
        User user = userMapper.selectById(1354247159213625346L);
        user.setName("Jones");
        user.setEmail("hello@qq.com");
        user.setVersion(user.getVersion()-1);
        userMapper.updateById(user);
    }

    @Test
    public void testSelectByMap(){
        HashMap<String, Object> map = new HashMap<>();
        map.put("name","Jack");
        map.put("age","test2@baomidou.com");
        List<User> users = userMapper.selectByMap(map);
        users.forEach(System.out::println);

    }

    @Test
    public void testSelectPage() {
        Page<User> page = new Page<>(1,5);
        userMapper.selectPage(page, null);
        page.getRecords().forEach(System.out::println);
        System.out.println(page.getCurrent());
        System.out.println(page.getPages());
        System.out.println(page.getSize());
        System.out.println(page.getTotal());
        System.out.println(page.hasNext());
        System.out.println(page.hasPrevious());
    }

    @Test
    public void lj_delete(){
        userMapper.deleteById(1L);
    }

    @Test
    public void selectQuery(){
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        
    }
}
