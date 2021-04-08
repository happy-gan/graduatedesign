package com.example.graduatedesign.mapper;

import com.example.graduatedesign.entity.Admin;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author gan
 * @Description: 管理员
 * @date 2021/4/2 13:08
 */
@Mapper
public interface AdminMapper {
    //测试
    List<Admin> getAll();

}
