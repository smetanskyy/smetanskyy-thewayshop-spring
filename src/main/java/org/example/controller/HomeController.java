package org.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping({"/", "/home"})
    public String Home(){
        return "home";
    }

    @RequestMapping("/about")
    public String About(Model model){
        model.addAttribute("preTitle", "Home");
        model.addAttribute("title", "About Us");
        return "about";
    }

    @RequestMapping("/service")
    public String Service(Model model){
        model.addAttribute("preTitle", "Home");
        model.addAttribute("title", "Services");
        return "service";
    }

    @RequestMapping("/contact")
    public String Contact(Model model){
        model.addAttribute("preTitle", "Home");
        model.addAttribute("title", "Contact Us");
        return "contact";
    }

    @RequestMapping("/shop/cart")
    public String Cart(Model model){
        model.addAttribute("preTitle", "Shop");
        model.addAttribute("title", "Cart");
        return "cart";
    }

    @RequestMapping("/shop/checkout")
    public String Checkout(Model model){
        model.addAttribute("preTitle", "Shop");
        model.addAttribute("title", "Checkout");
        return "checkout";
    }

    @RequestMapping("/shop/my-account")
    public String MyAccount(Model model){
        model.addAttribute("preTitle", "Shop");
        model.addAttribute("title", "My Account");
        return "my-account";
    }

//    @RequestMapping("/shop/wishlist")
//    public String Wishlist(Model model){
//        model.addAttribute("preTitle", "Shop");
//        model.addAttribute("title", "Wishlist");
//        return "wishlist";
//    }

    @RequestMapping("/shop/shop-detail")
    public String ShopDetail(Model model){
        model.addAttribute("preTitle", "Shop");
        model.addAttribute("title", "Shop Detail");
        return "shop-detail";
    }

    @RequestMapping("/product/shop")
    public String Shop(Model model){
        model.addAttribute("preTitle", "Product");
        model.addAttribute("title", "Shop");
        return "shop";
    }
}
