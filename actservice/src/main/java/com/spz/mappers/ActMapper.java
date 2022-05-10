package com.spz.mappers;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.spz.pojo.Activity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface ActMapper extends BaseMapper<Activity> {
}
