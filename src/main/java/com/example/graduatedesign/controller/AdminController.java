package com.example.graduatedesign.controller;

import com.example.graduatedesign.entity.Admin;
import com.example.graduatedesign.service.serviceimpl.AdminServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author gan
 * @Description:
 */
@RestController
@RequestMapping(value = "api/admin")
public class AdminController {
    @Autowired
    private AdminServiceImpl adminService;

    @RequestMapping(value = "getAll",method = RequestMethod.GET)
    public List<Admin> getAll(){
        return adminService.getAll();
    }
}
