package com.target.Controller;

import com.target.Exception.ResourceNotFoundException;
import com.target.Model.Price;
import com.target.Model.Product;
import com.target.Service.PriceService;
import com.target.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.net.URISyntaxException;

@RestController
@RequestMapping("/")
public class ProductController {
    private ProductService productService;
    private PriceService priceService;
    private Product product;

    @Autowired
    private void setProductService(ProductService productService) {
        this.productService = productService;
    }

    @Autowired
    private void setPriceService(PriceService priceService) {
        this.priceService = priceService;
    }

    @Autowired
    private void setProduct(Product product) {
        this.product = product;
    }

    @RequestMapping(value="product/{id}",method=RequestMethod.GET)
    public Product getProductById(@PathVariable int id) throws URISyntaxException {
        Product productDetails = productService.findProductById(id, product);
        return productDetails;
    }

    @RequestMapping(value="product/{id}",method=RequestMethod.PUT)
    public Product updateProduct(@PathVariable Integer id, @RequestBody Product updatedProductPrice) throws URISyntaxException {
        priceService.updateProductById(id, updatedProductPrice);

        return productService.findProductById(id,updatedProductPrice);
    }
}
