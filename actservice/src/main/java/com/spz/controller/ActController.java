package com.spz.controller;

import com.spz.mappers.ActMapper;
import com.spz.pojo.Activity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Map;

@RestController
public class ActController {
    @Autowired
    ActMapper actMapper;
    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/getall")
    public List<Activity> getall(){
        return actMapper.selectList(null);
    }
    @GetMapping("/getrest")
    public List<Map<String,Object>> getrest(){
        return restTemplate.getForObject("http://studentservice/getall",List.class);
    }
    @GetMapping("/wocao")
    public String dd(){
        return "ssssfff";
    }
}
