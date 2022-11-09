package com.example.springbootmybatisdemo.mapper;

import com.example.springbootmybatisdemo.model.UserTicket;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserTicketMapper {

    int saveList(List<UserTicket> userTickets);

}
