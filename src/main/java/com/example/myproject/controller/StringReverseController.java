package com.example.myproject.controller;

import com.example.myproject.service.StringReverseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.*;

@RestController
public class StringReverseController {

    @Autowired
    private StringReverseServiceImpl stringReverseService;

    @GetMapping(value = "/rev")
    public @ResponseBody String reverse(@RequestParam("param") String param, @RequestHeader HttpHeaders httpHeaders) {
        System.out.println(httpHeaders.toString());
        return stringReverseService.reverseString(param);
    }
}
