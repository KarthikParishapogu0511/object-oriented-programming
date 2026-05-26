package com.java.oop;

public class Customer {

    int id;
    String name;
    int age;
    long mobileNumber;
    String email;
    String address;
    boolean isAvailable;

    Customer(){
        System.out.println("Customer() Function is called.");
        id = 101;
        name = "Shiva";
        age = 28;
        mobileNumber = 387765321;
        email = "shiva2804@gmail.com";
        address = "Vijayanagar Colony";
        isAvailable = true;
    }

    public Customer(int id, String name, int age, long mobileNumber, String email, String address, boolean isAvailable) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.mobileNumber = mobileNumber;
        this.email = email;
        this.address = address;
        this.isAvailable = isAvailable;
    }
}
