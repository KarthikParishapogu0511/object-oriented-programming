package com.java.oop.inheritance;

public class Main {
    public static void main(String[] args) {

        Product product = new Product();
        System.out.println("Product Id : " + product.id);
        product.displayDetails();

        Product product2 = new Product(2,"Product 2",87654,14.5F,4.6F,true);
        product2.displayDetails();

        Laptop laptop = new Laptop();
        System.out.println(laptop.hardDiskSize);
        System.out.println(laptop.operatingSystem);
        System.out.println(laptop.ram);


        Laptop laptop2 = new Laptop(2,"Laptop 2",98760,12.5F,4.5F,true,256,16,"Operating System 16");

        laptop2.displayDetails();

        Book book  = new Book(2,"Book 2",450,5.5F,4.5F,true,"Author 2",400,"Publisher 2");
        book.displayDetails();

        WindowsLaptop windowsLaptop = new WindowsLaptop();

        Service service = new Service();
        service.validate(product);
        service.validate(laptop);
        service.validate(windowsLaptop);
        service.validate(book);

        windowsLaptop.displayDetails();
        windowsLaptop.displayDetails("Microsoft",2000);
        windowsLaptop.displayDetails("Microsoft");
        windowsLaptop.displayDetails("Microsoft",2000,true);

        service.displayDetails(product2);
        service.displayDetails(laptop2);
        service.displayDetails(book);
    }
}
