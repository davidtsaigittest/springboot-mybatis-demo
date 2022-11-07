package com.example.springbootmybatisdemo.bean;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;

import java.time.LocalDate;

@Builder
public class TestResponse {

    @JsonFormat(pattern = "yyyy/MM/dd")
    @JsonProperty("DATE_OF_RESPONSE")
    public LocalDate dateOfResponse;
}
