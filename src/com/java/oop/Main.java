package com.java.oop;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Product Object
        Product product; // no object exists product is just a reference variable
        product = new Product();// here it is default Constructor is called Earlier at first ,
        // as you declared a no-arg constructor

        // Initialize
        /*
        product.id = 1;
        product.name = "Samsung Galaxy a90";
        product.maxRetailPrice = 120000;
        product.discountPercentage = 10.5F;
        product.rating = 4.5F;
        product.isStockAvailable = true;

         */

        System.out.println("id :" +product.id);
        System.out.println("name : " + product.name);
        System.out.println("mrp :"+ product.maxRetailPrice);
        System.out.println("Discount Percentage : " + product.discountPercentage);
        System.out.println("Rating : " + product.rating);
        System.out.println("Is Available : " + product.isStockAvailable);
        System.out.println("-----------------------");


        Product product2;
        product2 = new Product(2,"OnePlus Nord 5G lite",134567,12.5F,4.5F,false);
        //Here what I used is an Argument Constructor

        /*
        product2.id = 2;
        product2.name = "OnePlus Nord 5G lite";
        product2.maxRetailPrice = 140000;
        product2.discountPercentage = 11.5F;
        product2.rating = 4.75F;
        product2.isStockAvailable = false;

         */

        System.out.println("id :" +product2.id);
        System.out.println("name : " + product2.name);
        System.out.println("mrp :"+ product2.maxRetailPrice);
        System.out.println("Discount Percentage : " + product2.discountPercentage);
        System.out.println("Rating : " + product2.rating);
        System.out.println("Is Available : " + product2.isStockAvailable);

    }
}