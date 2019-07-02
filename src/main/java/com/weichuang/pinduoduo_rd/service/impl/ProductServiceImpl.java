package com.weichuang.pinduoduo.service.impl;

import com.weichuang.pinduoduo.dao.ProductMapper;
import com.weichuang.pinduoduo.entity.Product;
import com.weichuang.pinduoduo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    private ProductMapper productMapper;

    @Override
    public List<Product> getAllProductList() {
        return productMapper.getAllProductList();
    }

    @Override
    public Product getProductByID(int pid) {
        return productMapper.getProductByID(pid);
    }

    @Override
    public void saveProduct(Product product) {
        productMapper.saveProduct(product);
    }

    @Override
    public void updateProduct(Product product) {
        productMapper.updateProduct(product);
    }

    @Override
    public void deleteProductById(int id) {
        productMapper.deleteProductById(id);
    }


}
