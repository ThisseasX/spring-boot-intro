package com.example.spring_boot_intro.services;

import com.example.spring_boot_intro.services.interfaces.HelloService;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class HelloServiceImpl implements HelloService {

    public List<String> getHellos() {
//        Old Way
//        List<String> list = new ArrayList<>();
//        list.add("1");
//        list.add("2");
//        list.add("3");

//        return list;

        return Arrays.asList("1", "2", "3");
    }
}
