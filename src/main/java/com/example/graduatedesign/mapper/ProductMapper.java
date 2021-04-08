package com.example.graduatedesign.mapper;

import com.example.graduatedesign.entity.Product;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author gan
 * @Description: 商品
 * @date 2021/4/2 20:51
 */
@Mapper
public interface ProductMapper {

    List<Product> getPage(int start,int end);

    //获得销量排行榜
    List<Product> getPageBySale(int start,int end);

}
