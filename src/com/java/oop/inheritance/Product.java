package com.java.oop.inheritance;

public class Product {

    int id;
    String name;
    int maxRetailPrice;
    float discountPercentage;
    float rating;
    boolean isAvailable;

    public Product() {
        System.out.println("Product Constructor Called");
    }

    public Product(int id, String name, int maxRetailPrice, float discountPercentage, float rating, boolean isAvailable) {
        this.id = id;
        this.name = name;
        this.maxRetailPrice = maxRetailPrice;
        this.discountPercentage = discountPercentage;
        this.rating = rating;
        this.isAvailable = isAvailable;
    }

    void displayProductDetails(){
        System.out.println("------- Product Details --------");
        System.out.println("Id : " + id);
        System.out.println("Name : " + name);
        System.out.println("Max Retail Price : " + maxRetailPrice);
        System.out.println("Discount Percentage : " + discountPercentage);
        System.out.println("Rating : " + rating);
        System.out.println("Is Available : " + isAvailable);
    }
}
