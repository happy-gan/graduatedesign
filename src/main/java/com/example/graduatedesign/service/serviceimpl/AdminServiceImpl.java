package com.example.graduatedesign.service.serviceimpl;

import com.example.graduatedesign.entity.Admin;
import com.example.graduatedesign.mapper.AdminMapper;
import com.example.graduatedesign.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author gan
 * @Description: 管理员服务
 * @date 2021/4/2 13:12
 */
@Service("AdminService")
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminMapper adminMapper;

    @Override
    public List<Admin> getAll() {
        return adminMapper.getAll();
    }
}
