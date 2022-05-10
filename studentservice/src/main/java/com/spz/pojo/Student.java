package com.spz.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@TableName("student")
@Data
public class Student {
    private  String name;
    private String num;
    private String classroom;
}
