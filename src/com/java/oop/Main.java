package com.java.oop;

import java.util.List;

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

        // method calling
        product.displayProductDetails();
        System.out.println("-----------------------");

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

        product2.displayProductDetails();
        product2.displayProductDetailsByCompany("Nvidia");
        product2.displayProductsByManufacturingYear(1996);
        product2.displayProductsByCompanyNameAndManufacturingYear("Nvidia",1996);
        int productCount = product2.getProductsCount();
        System.out.println("Product Count : " + productCount);
        long totalProductValue = product2.getTotalProductsValue();
        System.out.println("Total Product Value : " + totalProductValue);
        List<Product> productList = product2.filterProductsBasedOnPriceRange(10000,120000);
        //System.out.println(productList);
        System.out.println("Company Name : " + Product.COMPANY_NAME);
        System.out.println("Company Email : " + Product.COMPANY_EMAIL);
        /*
        System.out.println("Company Name via Instance : " + product2.companyName);
        product2.companyName = "Samsung";
        System.out.println("Company Name via Instance : " + product2.companyName);
        System.out.println("Company Name : " + Product.companyName);
        */
        Product.displayCompanyDetails();

        System.out.println("--------------------------");

        Product product3 ;
        product3 = new Product();

        System.out.println("id :" +product3.id);
        System.out.println("name : " + product3.name);
        System.out.println("mrp :"+ product3.maxRetailPrice);
        System.out.println("Discount Percentage : " + product3.discountPercentage);
        System.out.println("Rating : " + product3.rating);
        System.out.println("Is Available : " + product3.isStockAvailable);
        System.out.println("--------------------------");

        Product product4 ;
        product4 = new Product(6574,"Lenovo 54G Lite",26754,11.5F,4.3F,true);

        System.out.println("id :" +product4.id);
        System.out.println("name : " + product4.name);
        System.out.println("mrp :"+ product4.maxRetailPrice);
        System.out.println("Discount Percentage : " + product4.discountPercentage);
        System.out.println("Rating : " + product4.rating);
        System.out.println("Is Available : " + product4.isStockAvailable);
        System.out.println("--------------------------");

        Product product5 ;
        product5 = new Product();

        System.out.println("id :" +product5.id);
        System.out.println("name : " + product5.name);
        System.out.println("mrp :"+ product5.maxRetailPrice);
        System.out.println("Discount Percentage : " + product5.discountPercentage);
        System.out.println("Rating : " + product5.rating);
        System.out.println("Is Available : " + product5.isStockAvailable);
        System.out.println("--------------------------");

        Customer customer1 = new Customer();

        System.out.println("Customer id : " + customer1.id);
        System.out.println("Customer name : " + customer1.name);
        System.out.println("Customer Age : " + customer1.age);
        System.out.println("Customer mobileNumber : " + customer1.mobileNumber);
        System.out.println("Customer Email : " + customer1.email);
        System.out.println("Customer Address : " + customer1.address);
        System.out.println("Customer isAvailable : " + customer1.isAvailable);
        System.out.println("------------------------------");

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

        customer2.printCustomerDetails();
        System.out.println("-----------------");
        customer2.updateCustomerAddress("Indhra Nagar");
        customer2.printCustomerDetails();
        customer2.isCustomerActiveStatus();
        customer2.deActivateCustomerAccount();

        Customer customer3;
        customer3 = new Customer(103,"Rahul",32,876667443,"rahul234@gmail.com","Nehru Road",false);

        System.out.println("Customer Id : " + customer3.id);
        System.out.println("Customer Name : " + customer3.name);
        System.out.println("Customer Age : " + customer3.age);
        System.out.println("Customer mobileNumber : "+ customer3.mobileNumber);
        System.out.println("Customer email : " + customer3.email);
        System.out.println("Customer address : " + customer3.address);
        System.out.println("Customer isAvailable : " + customer3.isAvailable);
        System.out.println("------------------------------");

        Customer customer4;
        customer4 = new Customer(104,"Raju",42,7068926443L,"raju98@gmail.com","Raji Street",false);

        System.out.println("Customer Id : " + customer4.id);
        System.out.println("Customer Name : " + customer4.name);
        System.out.println("Customer Age : " + customer4.age);
        System.out.println("Customer mobileNumber : "+ customer4.mobileNumber);
        System.out.println("Customer email : " + customer4.email);
        System.out.println("Customer address : " + customer4.address);
        System.out.println("Customer isAvailable : " + customer4.isAvailable);
        System.out.println("------------------------------");

        Customer customer5;
        customer5 = new Customer(105,"Jai",27,8798174430L,"jai240@gmail.com","Modi Road",true);

        System.out.println("Customer Id : " + customer5.id);
        System.out.println("Customer Name : " + customer5.name);
        System.out.println("Customer Age : " + customer5.age);
        System.out.println("Customer mobileNumber : "+ customer5.mobileNumber);
        System.out.println("Customer email : " + customer5.email);
        System.out.println("Customer address : " + customer5.address);
        System.out.println("Customer isAvailable : " + customer5.isAvailable);
        System.out.println("------------------------------");

        // no-args Constructor
        Order order1 = new Order();
        System.out.println("Order Id : " + order1.id);
        System.out.println("Customer Id : " + order1.customerId);
        System.out.println("Order Amount : " + order1.amount);
        System.out.println("Order Date : " + order1.date);
        System.out.println("Is Order placed ? : " + order1.isOrderPlaced);
        System.out.println("Payment Type : " + order1.paymentType);
        System.out.println("Is payment Closed ? : " + order1.isPaymentClosed);
        System.out.println("-------------------------");

        // args -Constructor
        Order order2 = new Order(1002,102,5489.62F,"25/05/2026",true,"Debit Card",true);
        System.out.println("Order Id : " + order2.id);
        System.out.println("Customer Id : " + order2.customerId);
        System.out.println("Order Amount : " + order2.amount);
        System.out.println("Order Date : " + order2.date);
        System.out.println("Is Order placed ? : " + order2.isOrderPlaced);
        System.out.println("Payment Type : " + order2.paymentType);
        System.out.println("Is payment Closed ? : " + order2.isPaymentClosed);
        System.out.println("-------------------------");

        Order order3 = new Order(1003,103,7625.38F,"26/05/2026",true,"Debit Card",true);
        System.out.println("Order Id : " + order3.id);
        System.out.println("Customer Id : " + order3.customerId);
        System.out.println("Order Amount : " + order3.amount);
        System.out.println("Order Date : " + order3.date);
        System.out.println("Is Order placed ? : " + order3.isOrderPlaced);
        System.out.println("Payment Type : " + order3.paymentType);
        System.out.println("Is payment Closed ? : " + order3.isPaymentClosed);
        System.out.println("-------------------------");


        Order order4 = new Order(1004,104,32489.62F,"24/05/2026",true,"Online Payment",true);
        System.out.println("Order Id : " + order4.id);
        System.out.println("Customer Id : " + order4.customerId);
        System.out.println("Order Amount : " + order4.amount);
        System.out.println("Order Date : " + order4.date);
        System.out.println("Is Order placed ? : " + order4.isOrderPlaced);
        System.out.println("Payment Type : " + order4.paymentType);
        System.out.println("Is payment Closed ? : " + order4.isPaymentClosed);
        System.out.println("-------------------------");

        Order order5 = new Order(1005,105,54795.38F,"28/05/2026",true,"Cash",true);
        System.out.println("Order Id : " + order5.id);
        System.out.println("Customer Id : " + order5.customerId);
        System.out.println("Order Amount : " + order5.amount);
        System.out.println("Order Date : " + order5.date);
        System.out.println("Is Order placed ? : " + order5.isOrderPlaced);
        System.out.println("Payment Type : " + order5.paymentType);
        System.out.println("Is payment Closed ? : " + order5.isPaymentClosed);
        System.out.println("-------------------------");

    }
}