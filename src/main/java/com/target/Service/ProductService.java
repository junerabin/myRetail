package com.target.Service;

import com.target.Dao.ProductRepository;
import com.target.Exception.ResourceNotFoundException;
import com.target.Model.Product;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private Environment env;

    public Product findProductById(int id, Product product) {
        product.setId(id);
        product.setName(getProductName(id));
        product.setPrice(productRepository.getPrice(id));

        return product;
    }

    private String getProductName(int id) {
        JSONObject jsonObject;
        try {
            String url=	env.getProperty("target.restUrl1")+id+env.getProperty("target.restUrl2");
            String productName = restTemplate.getForObject(url, String.class);
            jsonObject = new JSONObject(productName);
        } catch (RestClientException e) {
            throw new ResourceNotFoundException("Product not found");
        }
        return jsonObject.getJSONObject("product").getJSONObject("item").getJSONObject("product_description").getString("title");
    }
}