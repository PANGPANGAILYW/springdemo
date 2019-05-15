package com.example.demo.controller;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;



@RestController
//RestController表示该接口全部返回一个json格式
public class helloworld {
    @RequestMapping("/index")
    public String index(){
        return "success";
    }

    @RequestMapping("/getmap")
    public Map<String,Object>  getmap(){
        Map<String,Object> map=new HashMap<>();
        map.put("errorcode","200");
        map.put("errmsd","400");
        return map;
    }

    @RequestMapping("/error1")

    public String  error1(){
       int i=1/0;

        return "map";
    }

}
