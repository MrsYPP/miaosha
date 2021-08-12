package org.example.service.impl;

import org.example.pojo.Product;
import org.example.service.ProductService;
import org.springframework.stereotype.Service;

/**
 * @author Mrs Yang
 * @date 2021/3/31 21:48
 */
@Service
public class ProductServiceImpl implements ProductService {
    @Override
    public boolean addProduct(Product product) {
        return false;
    }
}
