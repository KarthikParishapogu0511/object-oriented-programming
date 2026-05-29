package com.java.oop;

import java.util.List;

public class Product {


        // static is a class specific and also we have to specify the value and it's common to every instance
        final static String COMPANY_NAME = "Amazon";
        final static  String COMPANY_EMAIL = "support@gmail.com";
        final static  String COMPANY_PHONE_NO = "1234567890";

        //state
        //Product state -> id,maxRetailPrice,discountPercentage,rating,isStockAvailable
        //Always have to write  states first then any other
        //instance variable is nothing but object variable

        int id;
        String name;
        int maxRetailPrice;
        float discountPercentage;
        float rating;
        boolean isStockAvailable;

        //No-Argument Constructor
        Product(){
                System.out.println("Product() is called");
                id = 1;
                name = "Samsung Galaxy a90";
                maxRetailPrice = 120000;
                discountPercentage = 10.5F;
                rating = 4.5F;
                isStockAvailable = true;
        }
        /* Here below this Product has a parameter called id and all others are Local variables */

      /* Argument Constructor
      Product(int id ,String name,int maxRetailPrice,float discountPercentage,float rating,boolean isStockAvailable){
                this.id  = id;
                this.name = name;
                this.maxRetailPrice = maxRetailPrice;
                this.discountPercentage = discountPercentage;
                this.rating = rating;
                this.isStockAvailable = isStockAvailable;
                //  Instance variable is id ,here this refers to product reference variable
        }
        */

        // TO create an Argument constructor use keyboard shortcut ctrl + shift + insert in 0 also can be used for suggestions

        public Product(int id, String name, int maxRetailPrice, float discountPercentage, float rating, boolean isStockAvailable) {
                this.id = id;
                this.name = name;
                this.maxRetailPrice = maxRetailPrice;
                this.discountPercentage = discountPercentage;
                this.rating = rating;
                this.isStockAvailable = isStockAvailable;
        }
        //It's a method without any returnType (void) or output and also without any parameters or inputs
        void displayProductDetails(){
                System.out.println("id :" + id);
                System.out.println("name : " + name);
                System.out.println("mrp :"+ maxRetailPrice);
                System.out.println("Discount Percentage : " + discountPercentage);
                System.out.println("Rating : " + rating);
                System.out.println("Is Available : " + isStockAvailable);
        }

        // with arguments and without return type

        void displayProductDetailsByCompany(String companyName){
                System.out.println("Product by Company : " + companyName);
        }

        void displayProductsByManufacturingYear(int year){
                System.out.println("Products by manufactured year :" + year);
        }

        void displayProductsByCompanyNameAndManufacturingYear(String companyName,int year){
                System.out.println("Products by Company Name and Manufactured Year : " + companyName + " " + year);
        }

        //with return type and without arguments
        //total count of products

        //if you want to get any data always start with keyword get
        int getProductsCount(){
                return 10;
        }

        long getTotalProductsValue(){
                return 1222666663888844567L;
        }

        //highest rated Product
        Product getHighestRatedProduct(){
                return new Product();
        }

        //sort the products based on rating which should return a list of products
        List<Product> getSortProductsBasedOnRating(){
                return null;
        }

        //filter the Products based on min and max Price Range
        List<Product> filterProductsBasedOnPriceRange(int min,int max){
                return null;
        }

        static void  displayCompanyDetails(){
                System.out.println("Company Name : " + COMPANY_NAME);
                System.out.println("Company Email : " + COMPANY_EMAIL);
                System.out.println("Company Phone No : " + COMPANY_PHONE_NO);
        }


}
