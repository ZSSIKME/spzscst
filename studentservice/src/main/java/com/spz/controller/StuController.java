package com.spz.controller;

import com.spz.mappers.StuMapper;
import com.spz.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StuController {
    @Autowired
    StuMapper stuMapper;
    @GetMapping("/getall")
    public List<Student> gatall(){
        return stuMapper.selectList(null);
    }
}
