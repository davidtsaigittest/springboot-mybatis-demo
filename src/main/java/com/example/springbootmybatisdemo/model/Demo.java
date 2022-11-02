package com.example.springbootmybatisdemo.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;
@Data
public class Demo implements Serializable {
    private Integer id;

    private String demoName;

    private String demoValue;

    private Integer demoStatus;

    private Date createTime;

    private Date updateTime;

}
