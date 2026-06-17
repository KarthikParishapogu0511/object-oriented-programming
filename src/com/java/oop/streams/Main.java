package com.java.oop.streams;


import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        CsvReader csvReader = new CsvReader();
        List<Product> products = csvReader.getProductsFromCsvReader();
        for(Product product: products){
            System.out.println(product);
        }
    }
}
