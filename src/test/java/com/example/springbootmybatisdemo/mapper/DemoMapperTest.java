package com.example.springbootmybatisdemo.mapper;

import com.example.springbootmybatisdemo.model.Demo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@SpringBootTest
public class DemoMapperTest {
    @Resource
    private DemoMapper demoMapper;

    @Test
    public void testInsert() {
        Demo demo = new Demo();
        demo.setDemoName("roach name");
        demo.setDemoValue("roach value");
        demo.setId(1);
        int flag = demoMapper.insert(demo);
        Assertions.assertEquals(flag, 1);
    }

    @Test
    public void testSelectList() {
        List<Demo> demoList = demoMapper.selectList();
        Assertions.assertEquals(1, demoList.size());
    }

    @Test
    public void testSelectOne() {
        Demo demo = demoMapper.selectOne(1);
        Assertions.assertEquals("roach name", demo.getDemoName());
        Assertions.assertEquals("roach value", demo.getDemoValue());
    }

    @Test
    public void testUpdate() {
        Demo demo = new Demo();
        demo.setDemoName("crow name");
        demo.setDemoValue("crow value ");
        demo.setId(1);
        demo.setUpdateTime(new Date());
        int flag = demoMapper.update(demo);
        Assertions.assertEquals(1, flag);
    }

    @Test
    public void testDelete() {
        int flag = demoMapper.delete(1);
        Assertions.assertEquals(flag, 1);
        Demo demo = demoMapper.selectOne(1);
        Assertions.assertNull(demo);
    }
}
