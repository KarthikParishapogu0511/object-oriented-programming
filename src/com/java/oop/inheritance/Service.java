package com.java.oop.inheritance;

public class Service {

    void validate(Product product){
        System.out.println("Validating Product ");
    }

//    void validate(Laptop laptop){
//        System.out.println("Validating laptop");
//    }
//    void validate(WindowsLaptop windowsLaptop){
//        System.out.println("Validating Windows Laptop");
//    }
//
//    void validate(Book book){
//        System.out.println("Validating Book");
//    }

//    void displayProductDetails(Product product){
//        product.displayProductDetails();
//    }
//
//    void displayLaptopDetails(Laptop laptop){
//        laptop.displayLaptopDetails();
//    }
//
//    void displayBookDetails(Book book){
//        book.displayBookDetails();
//    }
//
//    void displayWindowLaptopDetails(WindowsLaptop windowsLaptop){
//          windowsLaptop.displayWindowsLaptopDetails();
//    }

    void displayDetails(Product product){
        product.displayDetails();
    }


}
