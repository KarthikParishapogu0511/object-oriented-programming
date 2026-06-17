package com.java.oop.streams;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Streams {
    public static void main(String[] args) throws IOException {
        CsvReader csvReader = new CsvReader();
        List<Product> products = csvReader.getProductsFromCsvReader();

        //In Intermediate operations first method we have is
        // filter Method
        // list of products between price 10000 and 100000

        List<Product> filteredProducts = new ArrayList<>();
        for(Product product: products){
            if(product.getMaxRetailPrice() >= 10000 &&  product.getMaxRetailPrice() <= 100000){
                filteredProducts.add(product);
            }
        }
        System.out.println(filteredProducts);

        System.out.println("using Streams");
        List<Product> filteredProducts1 = products.stream().filter(product ->  product.getMaxRetailPrice() >= 10000 && product.getMaxRetailPrice() <= 100000)
                .toList();

        System.out.println(filteredProducts1);
    }
}
