package com.example.springbootmybatisdemo.mapper;

import com.example.springbootmybatisdemo.model.UserTicket;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserTicketMapper {

    int saveList(List<UserTicket> userTickets);

    @Select({"<script>",
            "SELECT * ",
            "FROM user_ticket",
            "WHERE userId IN",
            "<foreach item='item' index='index' collection='userIds' open='(' separator=',' close=')'>",
            "#{item}",
            "</foreach>",
            "</script>"})
    List<UserTicket> selectByUserIds(List<String> userIds);

}
