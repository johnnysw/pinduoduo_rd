package com.weichuang.pinduoduo_rd.service;

import com.weichuang.pinduoduo_rd.entity.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductService {

    List<Product> getAllProductList();

    Product getProductByID(int pid);

    void saveProduct(Product product);

    void updateProduct(Product product);

    void deleteProductById(int id);
}
