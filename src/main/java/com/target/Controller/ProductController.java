package com.target.Controller;

import com.target.Model.Product;
import com.target.Service.PriceService;
import com.target.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


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

    // GET
    @RequestMapping(method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE}, value="/product/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable("id") int id) {
        productService.getProduct(product, id);

        return new ResponseEntity<>(product, HttpStatus.OK);
    }

    // PUT
    @PutMapping
    @RequestMapping(method = RequestMethod.PUT, produces = {MediaType.APPLICATION_JSON_VALUE}, value="/product/{id}")
    ResponseEntity<Product> updateProductById(@PathVariable int id, @RequestBody Product newProductPrice) {
        priceService.updateProductPrice(newProductPrice, id);
        productService.getProduct(product, id);

        return new ResponseEntity<>(product, HttpStatus.OK);
    }

}
