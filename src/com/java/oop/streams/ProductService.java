package com.java.oop.streams;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ProductService {

    List<Product> products;

    public ProductService() throws IOException {
        this.products = new CsvReader().getProductsFromCsvReader();
    }

    List<Product> getProductsByAvailability(boolean isAvailable) {
        //
        return null;
    }

    Optional<Product> getProductById(int id) {
        Optional<Product> product = Optional.empty();
        for (Product p : products) {
            if (p.getId() == id) {
                product = Optional.of(p);
                break;
            }
        }
        return product;
    }
}
