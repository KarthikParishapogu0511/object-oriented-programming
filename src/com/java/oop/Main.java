package com.java.oop;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Product Object
        Product product; // no object exists product is just a reference variable
        product = new Product();// here it is default Constructor is called Earlier at first ,
        /*
         as you declared a no-arg constructor
         Initialize
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


        Customer customer1 = new Customer();

        System.out.println("Customer id : " + customer1.id);
        System.out.println("Customer name : " + customer1.name);
        System.out.println("Customer Age : " + customer1.age);
        System.out.println("Customer mobileNumber : " + customer1.mobileNumber);
        System.out.println("Customer Email : " + customer1.email);
        System.out.println("Customer Address : " + customer1.address);
        System.out.println("Customer isAvailable : " + customer1.isAvailable);
        System.out.println("------------------------------");

        Order order1 = new Order();
        System.out.println("Order Id : " + order1.id);
        System.out.println("Customer Id : " + order1.customerId);
        System.out.println("Order Amount : " + order1.amount);
        System.out.println("Order Date : " + order1.date);
        System.out.println("Is Order placed ? : " + order1.isOrderPlaced);
        System.out.println("Payment Type : " + order1.paymentType);
        System.out.println("Is payment Closed ? : " + order1.isPaymentClosed);
        System.out.println("-------------------------");


        Product product2;
        product2 = new Product(2,"OnePlus Nord 5G lite",134567,12.5F,4.5F,false);
        /*
        Here what I used is an Argument Constructor
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
        System.out.println("--------------------------");

        Customer customer2;
        customer2 = new Customer(102,"Farooq",44,876895443,"farooq234@gmail.com","Gandhi Road",false);

        System.out.println("Customer Id : " + customer2.id);
        System.out.println("Customer Name : " + customer2.name);
        System.out.println("Customer Age : " + customer2.age);
        System.out.println("Customer mobileNumber : "+ customer2.mobileNumber);
        System.out.println("Customer email : " + customer2.email);
        System.out.println("Customer address : " + customer2.address);
        System.out.println("Customer isAvailable : " + customer2.isAvailable);
        System.out.println("------------------------------");

        Order order2 = new Order(1002,102,5489.62F,"25/05/2026",true,"Debit Card",true);

        System.out.println("Order Id : " + order2.id);
        System.out.println("Customer Id : " + order2.customerId);
        System.out.println("Order Amount : " + order2.amount);
        System.out.println("Order Date : " + order2.date);
        System.out.println("Is Order placed ? : " + order2.isOrderPlaced);
        System.out.println("Payment Type : " + order2.paymentType);
        System.out.println("Is payment Closed ? : " + order2.isPaymentClosed);
        System.out.println("-------------------------");


    }
}