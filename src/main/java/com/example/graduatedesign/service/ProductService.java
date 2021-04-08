package com.example.graduatedesign.service;

import com.example.graduatedesign.entity.Product;

import java.util.List;

/**
 * @author gan
 * @Description: 商品服务
 * @date 2021/4/2 20:52
 */
public interface ProductService {
    List<Product> getPage(int page);
    //获得销量排行榜
    List<Product> getPageBySale(int page);
}
