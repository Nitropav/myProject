package com.example.myproject.service;

import org.springframework.stereotype.Service;

@Service
public class StringReverseServiceImpl implements StringReverseService{

    @Override
    public String reverseString(String param) {
        return new StringBuilder(param).reverse().toString();
    }
}
