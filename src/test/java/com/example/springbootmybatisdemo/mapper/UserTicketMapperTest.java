package com.example.springbootmybatisdemo.mapper;

import com.example.springbootmybatisdemo.model.UserTicket;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@SpringBootTest
public class UserTicketMapperTest {

    @Autowired
    private UserTicketMapper userTicketMapper;

    @Test
    public void testInsertList() {
        UserTicket user1 = UserTicket.builder().userId("A123456789").ticketNo(UUID.randomUUID().toString()).ticketType(1).status(0).createDate(new Date()).build();
        UserTicket user2 =UserTicket.builder().userId("B666688888").ticketNo(UUID.randomUUID().toString()).ticketType(1).status(0).createDate(new Date()).build();
        List<UserTicket> userTickets = Arrays.asList(user1, user2);
        int result = userTicketMapper.saveList(userTickets);
        Assertions.assertEquals(result, 2);
    }

}
