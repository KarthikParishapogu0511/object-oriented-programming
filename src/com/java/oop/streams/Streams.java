package com.java.oop.streams;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Streams {
    public static void main(String[] args) throws IOException {
        CsvReader csvReader = new CsvReader();
        List<Product> products = csvReader.getProductsFromCsvReader();
        System.out.println(products.size());

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

        System.out.println("-------------------------");
        System.out.println("using Streams Printing Names of Every Product");
        List<String> productNames ;
        productNames = products.stream().map(Product::getName).toList();
        //here :: is called method Reference it is equivalent to Product -> getNames() method
        System.out.println(productNames);

        System.out.println("using Streams List of Distinct Products");
        List<Product> nonDuplicateProducts = products.stream().distinct().toList();
        System.out.println(nonDuplicateProducts.size());

        //Sorted based on PRICE
        List<Product> sortedProductsBasedOnPrice;
        sortedProductsBasedOnPrice = products.stream().sorted((p1,p2) ->Double.compare(p1.getMaxRetailPrice(),  p2.getMaxRetailPrice())).toList();
        System.out.println(sortedProductsBasedOnPrice);

        // Sorted based on Name using sorted(Comparator)
        List<Product> sortedProductsBasedOnNames;
        sortedProductsBasedOnNames = products.stream().sorted((p1,p2) -> p1.getName().compareTo(p2.getName())).toList();
        System.out.println(sortedProductsBasedOnNames);

        // top5 highest Priced Products using limit() func
        List<Product> top5highestPricedProducts;
        top5highestPricedProducts = products.stream().sorted((p1,p2)-> Double.compare(p2.getMaxRetailPrice(),  p1.getMaxRetailPrice())).limit(5).toList();
        System.out.println(top5highestPricedProducts);

        //using forEach
        products.forEach(System.out::println);
        // It prints all the Product Data


        // Grouping of products base on companies
        Map<String,List<Product>> productsByCompany = products.stream().collect(Collectors.groupingBy(Product::getCompany));
        System.out.println("--------Products By Company----------");
        System.out.println(productsByCompany);

        Map<String,Long> productsCountByCategory;
        productsCountByCategory = products.stream().collect(Collectors.groupingBy(Product::getCategory,Collectors.counting()));
        System.out.println("----------Products Count By Category----------");
        System.out.println(productsCountByCategory);


//        Map<String,Long> productsCountByCompany;
         products.stream().collect(Collectors.groupingBy(Product::getCompany,Collectors.counting())).forEach((company,count)->{
             System.out.println(company + " : " + count);
         });

//        System.out.println("----------Products Count By Company----------");
//        System.out.println(productsCountByCompany);


        // total Company Inventory
        long  totalInventoryValue = products.stream().mapToLong(Product::getMaxRetailPrice).sum();
        System.out.println("Total Inventory Value : "  + totalInventoryValue);
        long totalInventoryValue1 = products.stream().collect(Collectors.summingLong(Product::getMaxRetailPrice));
        System.out.println("Total Inventory Value : "  + totalInventoryValue1);

        double avgPrice = products.stream().mapToDouble(Product::getMaxRetailPrice).average().orElse(0);
        System.out.println("Average Price : "  + avgPrice);
    }
}
