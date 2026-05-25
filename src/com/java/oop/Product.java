package com.java.oop;

public class Product {


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

      /* Product(int id ,String name,int maxRetailPrice,float discountPercentage,float rating,boolean isStockAvailable){
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
}
