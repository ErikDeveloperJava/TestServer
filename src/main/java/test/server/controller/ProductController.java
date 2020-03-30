package test.server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import test.server.model.Product;
import test.server.repository.ProductRepository;

@Controller
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping
    public String main(Model model){
        model.addAttribute("productList",productRepository.findAll());
        return "product";
    }

    @PostMapping("/product")
    public String save(Product product){
        productRepository.save(product);
        return "redirect:/";
    }
}
