package com.target.Service;

import com.target.Dao.ProductRepository;
import com.target.Model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PriceService {
    private ProductRepository productRepository;

    @Autowired
    public PriceService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public void updateProductById(int id,Product updatedProductPrice) {
        Double newPrice = updatedProductPrice.getPrice().getValue();
        productRepository.setPrice(id, newPrice);
    }
}
