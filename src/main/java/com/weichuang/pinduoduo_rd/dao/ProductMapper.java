package com.weichuang.pinduoduo.dao;

import com.weichuang.pinduoduo.entity.Product;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ProductMapper {

    List<Product> getAllProductList();

    Product getProductByID(int pid);

    void saveProduct(Product product);

    void updateProduct(Product product);

    void deleteProductById(int id);
}
