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

    @RequestMapping("/productList/viewProduct/{productId}")
    public String ViewProduct(@PathVariable String productId, Model model){
        model.addAttribute("preTitle", "Products");
        model.addAttribute("title", "Product");
        Product product = productDao.getProductById(productId);
        model.addAttribute("product", product);
        return "viewProduct";
    }

    @RequestMapping("/productList/addToWishList/{productId}")
    public String AddToWishList(@PathVariable String productId, Model model){
        model.addAttribute("preTitle", "Products");
        model.addAttribute("title", "Product");
        productDao.setWishProduct(productId);
        List<Product> products = productDao.getAllProducts();
        model.addAttribute("products", products);
        return "productList";
    }

    @RequestMapping("/shop/wishlist")
    public String Wishlist(Model model){
        model.addAttribute("preTitle", "Shop");
        model.addAttribute("title", "Wishlist");
        List<Product> products = productDao.getWishProducts();
        model.addAttribute("products", products);
        return "wishlist";
    }

}
