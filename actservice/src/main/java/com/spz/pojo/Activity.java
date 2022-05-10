package com.spz.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("activity")
public class Activity {
    private String name;
    private String info;
    private String place;
}
