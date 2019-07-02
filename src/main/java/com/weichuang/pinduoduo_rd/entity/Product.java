package com.weichuang.pinduoduo_rd.entity;

import java.io.Serializable;

public class Product implements Serializable{

    /**
     `prod_id` int(11) NOT NULL AUTO_INCREMENT,
     `name` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '商品名称',
     `price` decimal(15,2) DEFAULT NULL COMMENT '商品价格',
     `stock` int(11) DEFAULT NULL COMMENT '商品库存',
     `desc` text COLLATE utf8_bin COMMENT '商品详情',
     `category` int(11) DEFAULT NULL COMMENT '商品类别',
     `status` varchar(255) COLLATE utf8_bin DEFAULT '0' COMMENT '0: 正常状态\n1: 下架\n2: 删除',

     */
    private int prod_id;
    private String name;
    private String price;
    private int stock;
    private String desc;
    private int category;
    private String status;


    public int getProd_id() {
        return prod_id;
    }

    public void setProd_id(int prod_id) {
        this.prod_id = prod_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Product{" +
                "prod_id=" + prod_id +
                ", name='" + name + '\'' +
                ", price='" + price + '\'' +
                ", stock=" + stock +
                ", desc='" + desc + '\'' +
                ", category='" + category + '\'' +
                ", status=" + status +
                '}';
    }
}
