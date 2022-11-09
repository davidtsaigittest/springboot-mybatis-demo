package com.example.springbootmybatisdemo.model;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Builder
public class UserTicket {

    private Integer id;

    private String userId;

    private String ticketNo;

    private Integer ticketType;

    private Integer status;

    private Date createDate;

}
