package com.example.demo2;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/")
public class DataTest {

    @Resource
    JdbcTemplate jdbcTemplate;

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }


    @RequestMapping("/addUser")
    public List<Map<String,Object>> addUser(){
     List<Map<String,Object>> mapList= jdbcTemplate.queryForList("SELECT * FROM USER");
     return  mapList;
    }


}
