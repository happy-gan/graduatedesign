package com.example.graduatedesign.entity;

/**
 * @author gan
 * @Description: 商品
 * @date 2021/4/2 18:12
 */
public class Product {
    private String id;
    private String title;
    private String picUrl;
    private String detail;
    private String price;
    private Integer salenum;

    public Product() {
    }

    public Product(String id, String title, String picUrl, String detail, String price, Integer salenum) {
        this.id = id;
        this.title = title;
        this.picUrl = picUrl;
        this.detail = detail;
        this.price = price;
        this.salenum = salenum;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Integer getSalenum() {
        return salenum;
    }

    public void setSalenum(Integer salenum) {
        this.salenum = salenum;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", picUrl='" + picUrl + '\'' +
                ", detail='" + detail + '\'' +
                ", price='" + price + '\'' +
                ", salenum=" + salenum +
                '}';
    }
}
