package org.example.controller;

import org.example.core.Result;
import org.example.pojo.Product;
import org.example.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Mrs Yang
 * @date 2021/3/31 21:46
 */
@RestController
@RequestMapping(value = "/product")
public class ProductController {

    @Autowired
    private ProductService productService;


    @RequestMapping(value = "/add")
    @ResponseBody
    public Result addProduct(Product product) {
        boolean result = productService.addProduct(product);
        if (!result) {
            return new Result().failure("添加失败");
        }
        return new Result().success();
    }


}
