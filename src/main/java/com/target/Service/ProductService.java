package com.target.Service;

import com.target.Dao.ProductRepository;
import com.target.Exception.ResourceNotFoundException;
import com.target.Model.Product;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import java.net.URISyntaxException;

@Service
public class ProductService {

    private static final String retailURL = "https://redsky.target.com/v2/pdp/tcin/";
    private static final String endRetailURL = "?excludes=taxonomy,price,promotion,bulk_ship,rating_and_review_reviews,rating_and_review_statistics,question_answer_statistics";

    private RestTemplate restTemplate = new RestTemplate();
    private ProductRepository productRepository;

    @Autowired
    private void setProductRepository(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Product findProductById(int id, Product product) throws URISyntaxException {
        product.setId(id);
        product.setName(getProductName(getProductString(id)));
        product.setPrice(productRepository.getPrice(id));

        return product;
    }
    /*
    Alternative solution which pulls the URL parameters from a properties file
     */
//    public String getProductName(int id) throws URISyntaxException {
//        JSONObject jsonObject;
//        try {
//            String baseUrl=	env.getProperty("target.restUrl1")+id+env.getProperty("target.restUrl2");
//            URI uri = new URI(baseUrl);
//            String productName = restTemplate.getForObject(uri, String.class);
//            jsonObject = new JSONObject(productName);
//        } catch (RestClientException e) {
//            throw new ResourceNotFoundException("Product not found");
//        }
//        return jsonObject.getJSONObject("product").getJSONObject("item").getJSONObject("product_description").getString("title");
//    }

    public String getProductString(int id) {
        String productName;
        try {
            productName = restTemplate.getForObject(retailURL+id+endRetailURL, String.class);
        } catch (RestClientException e) {
            throw new ResourceNotFoundException("Product not found");
        }
        return productName;
    }

    public String getProductName(String productString) {
        JSONObject jsonObject = new JSONObject(productString);
        return jsonObject.getJSONObject("product").getJSONObject("item").getJSONObject("product_description").getString("title");
    }
}