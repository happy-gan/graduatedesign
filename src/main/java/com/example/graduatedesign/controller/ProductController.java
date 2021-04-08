package com.example.graduatedesign.controller;

import com.example.graduatedesign.entity.Product;
import com.example.graduatedesign.service.serviceimpl.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author gan
 * @Description:
 * @date 2021/4/2 21:07
 */
@RestController
@RequestMapping(value = "api/product")
public class ProductController {
    @Autowired
    private ProductServiceImpl productService;

    @RequestMapping(value = "getlist",method = RequestMethod.GET)
    public List<Product> getlist(@RequestParam int page){
        return productService.getPage(page);
    }

    @RequestMapping(value = "getlistbysalenum",method = RequestMethod.GET)
    public List<Product> getlistbysalenum(@RequestParam int page){
        return productService.getPageBySale(page);
    }
}
