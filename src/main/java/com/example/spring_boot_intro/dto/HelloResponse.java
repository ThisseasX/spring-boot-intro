package com.example.spring_boot_intro.dto;

import lombok.Data;

@Data
public class HelloResponse {
    private String helloMessage;
    private String worldMessage;
}
