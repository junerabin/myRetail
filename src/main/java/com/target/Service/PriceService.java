package com.target.Service;

import com.target.Dao.PriceDao;
import com.target.Model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PriceService {
    private PriceDao priceDao;

    @Autowired
    public PriceService(PriceDao priceDao) {
        this.priceDao = priceDao;
    }

    public void updateProductPrice(Product newProductPrice, int id) {
        Double newPrice = newProductPrice.getCurrent_price().getValue();
        priceDao.setPrice(id, newPrice);
    }
}
