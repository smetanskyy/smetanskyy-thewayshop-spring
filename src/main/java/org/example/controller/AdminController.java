package org.example.controller;

import org.example.dao.ProductDao;
import org.example.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class AdminController {
    @Autowired
    protected ProductDao productDao;


    @RequestMapping("/admin")
    public String adminPage(Model model){
        model.addAttribute("preTitle", "Admin");
        model.addAttribute("title", "Admin");
        return "admin";
    }

    @RequestMapping("/admin/productInventory")
    public  String productInventory(Model model){
        model.addAttribute("preTitle", "Admin");
        model.addAttribute("title", "Admin");
        List<Product> products = productDao.getAllProducts();
        model.addAttribute("products",products);
        return "productInventory";
    }

    @RequestMapping("/admin/productInventory/delete/{productId}")
    public  String RemoveProduct(@PathVariable String productId, Model model){
        model.addAttribute("preTitle", "Admin");
        model.addAttribute("title", "Admin");
        productDao.delProduct(productId);
        List<Product> products = productDao.getAllProducts();
        model.addAttribute("products",products);
        return "redirect:/admin/productInventory";
    }
}
