package com.target.Controller;

import com.target.Exception.ResourceNotFoundException;
import com.target.Model.Product;
import com.target.Service.PriceService;
import com.target.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequestMapping("/")
public class ProductController {
    private ProductService productService;
    private PriceService priceService;
    private Product product;

    @Autowired
    public ProductController(ProductService productService, PriceService priceService, Product product) {
        this.productService = productService;
        this.priceService = priceService;
        this.product = product;
    }

    @RequestMapping(value="product/{id}",method=RequestMethod.GET)
    public Product getProductById(@PathVariable int id) {
        Product productDetails = productService.findProductById(id, product);
        return productDetails;
    }

    @RequestMapping(value="product/{id}",method=RequestMethod.PUT)
    public Product updateProduct(@PathVariable Integer id, @RequestBody Product updatedProductPrice) throws IOException {
        priceService.updateProductById(id, updatedProductPrice);

        return productService.findProductById(id,updatedProductPrice);
    }
}
