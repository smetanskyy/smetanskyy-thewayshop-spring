package org.example.controller;

import org.example.dao.ProductDao;
import org.example.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.xml.ws.RequestWrapper;
import java.util.List;

@Controller
public class ProductController {
    @Autowired
    private ProductDao productDao;

    @RequestMapping("/productList")
    public String ProductList(Model model){
        model.addAttribute("preTitle", "Products");
        model.addAttribute("title", "Product");
        List<Product> products = productDao.getAllProducts();
        model.addAttribute("products", products);
        return "productList";
    }

    @RequestMapping("/productList/viewProduct")
    public String ViewProduct(Model model){
        model.addAttribute("preTitle", "Products");
        model.addAttribute("title", "Product");
        Product product = productDao.getProductById("1");
        model.addAttribute("product", product);
        return "viewProduct";
    }
}
