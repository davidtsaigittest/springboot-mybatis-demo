package com.example.springbootmybatisdemo;

import com.example.springbootmybatisdemo.enums.UserSexEnum;
import com.example.springbootmybatisdemo.mapper.UserMapper;
import com.example.springbootmybatisdemo.model.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringbootMybatisDemoApplicationTests {

    @Test
    void contextLoads() {
    }

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testInsert() throws Exception {
        userMapper.insert(new User("aa", "a123456", UserSexEnum.MAN));
        userMapper.insert(new User("bb", "b123456", UserSexEnum.WOMAN));
        userMapper.insert(new User("cc", "b123456", UserSexEnum.WOMAN));

        Assertions.assertEquals(3, userMapper.getAll().size());
    }

    @Test
    public void testQuery() throws Exception {
        List<User> users = userMapper.getAll();
        System.out.println(users.toString());
    }

    @Test
    public void testUpdate() throws Exception {
        User user = userMapper.getOne(3l);
        System.out.println(user.toString());
        user.setNickName("neo");
        userMapper.update(user);
        Assertions.assertTrue(("neo".equals(userMapper.getOne(3l).getNickName())));
    }


}
