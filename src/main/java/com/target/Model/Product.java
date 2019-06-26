package com.target.Model;

import org.springframework.stereotype.Service;

@Service
public class Product {

    private int id;
    private String name;
    private Price price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Price getPrice() {
        return price;
    }

    public void setPrice(Price price) {
        this.price = price;
    }


    @Override
    public String toString() {
        return "ProductDetails {"
                + "id=" + id + ","
                + "name=" + name +","
                + price +
                "}";
    }
}
