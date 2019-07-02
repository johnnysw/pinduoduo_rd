package com.weichuang.pinduoduo.service;

import com.weichuang.pinduoduo.entity.Product;
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
