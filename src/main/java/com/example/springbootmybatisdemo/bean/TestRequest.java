package com.example.springbootmybatisdemo.bean;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.time.LocalDate;

@Data
public class TestRequest {

    @JsonFormat(pattern = "yyyyMMdd")
        @JsonProperty("DATE_OF_QUERY")
    public LocalDate dateOfQuery;

}
