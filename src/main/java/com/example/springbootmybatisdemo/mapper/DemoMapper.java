package com.example.springbootmybatisdemo.mapper;

import com.example.springbootmybatisdemo.model.Demo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface DemoMapper {
    /**
     * 獲取demo的所有列表
     * @return 所有列表數據
     */
    List<Demo> selectList();

    /**
     * 根據id查詢一條紀錄
     * @param id 主鍵id
     * @return 一條紀錄
     */
    Demo selectOne(@Param("id") Integer id);

    /**
     *  插入一條新數據
     * @param demo 數據
     * @return 0|1
     */
    int insert(Demo demo);

    /**
     * 更新一條數據
     * @param demo 更新數據
     * @return 0|1
     */
    int update(Demo demo);

    /**
     * 根據id删除一條紀錄
     * @param id 主鍵id
     * @return 0|1
     */
    int delete(@Param("id") Integer id);
}
