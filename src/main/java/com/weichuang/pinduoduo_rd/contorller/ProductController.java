package com.weichuang.pinduoduo_rd.contorller;

import com.alibaba.fastjson.JSON;
import com.weichuang.pinduoduo_rd.annotation.UserLoginToken;
import com.weichuang.pinduoduo_rd.entity.Product;
import com.weichuang.pinduoduo_rd.service.ProductService;

import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @RequestMapping("/list.do")
    @ResponseBody
    public String toProductList(HttpServletRequest rep , HttpServletResponse response){
        List<Product> productList = productService.getAllProductList();
        for (Product product : productList){
            System.out.println(product);
        }
        //rep.setAttribute("productList" , productList);
        return  JSON.toJSONString(productList);
    }
    @UserLoginToken
    @RequestMapping("/info.do")
    @ResponseBody
    public String getProductInfo(HttpSession session , int pid){
        System.out.println("pid = " + pid);
        Product product = productService.getProductByID(pid);
        session.setAttribute("product" , product);
        return "product_info";
    }

    @RequestMapping("/save.do")
    @ResponseBody
    public String saveProduct(HttpServletRequest rep) throws InvocationTargetException, IllegalAccessException {
        Product product = new Product();
        Map<String, String[]> parameterMap = rep.getParameterMap();
        BeanUtils.populate(product,parameterMap);
        productService.saveProduct(product);
        String s = "{\"message\":\"成功\" , \"code\":\"101\"}";
        return JSON.toJSONString(s);
    }

    @RequestMapping("/update.do")
    @ResponseBody
    public String updateProduct(HttpServletRequest rep ) throws InvocationTargetException, IllegalAccessException {
        Product product = new Product();
        Map<String, String[]> parameterMap = rep.getParameterMap();
        BeanUtils.populate(product,parameterMap);
        productService.updateProduct(product);
        String s = "{\"message\":\"成功\" , \"code\":\"101\"}";
        return JSON.toJSONString(s);
    }

    @RequestMapping("/delete.do")
    @ResponseBody
    public String deleteProduct(HttpServletRequest rep ){
        productService.deleteProductById(Integer.valueOf(rep.getParameter("prod_id")));
        String s = "{\"message\":\"成功\" , \"code\":\"101\"}";
        return JSON.toJSONString(s);
    }

}
