package com.example.graduatedesign.service.serviceimpl;

import com.example.graduatedesign.entity.Product;
import com.example.graduatedesign.mapper.ProductMapper;
import com.example.graduatedesign.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author gan
 * @Description: 商品服务
 * @date 2021/4/2 20:53
 */
@Service("ProductService")
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductMapper productMapper;


    @Override
    public List<Product> getPage(int page) {
        int start = (page-1)*20;
        int end = page*20;
        return productMapper.getPage(start,end);
    }

    @Override
    public List<Product> getPageBySale(int page) {
        int start = (page-1)*20;
        int end = page*20;
        return productMapper.getPageBySale(start,end);
    }

}
