package com.example.demo.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
//全局捕获异常
@ControllerAdvice
public class Error {
    @ExceptionHandler(value=RuntimeException.class)
    @ResponseBody
    public Map<String,Object>  fun(){
        Map<String,Object>  res=new HashMap<>();
        res.put("出错啦","500");
        return res;

    }



}
