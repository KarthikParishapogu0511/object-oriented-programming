package com.java.oop.arrays;

public class Customer {
    int id;
    String name;
    int age;
    char gender;
    long mobileNumber;
    String email;
    String address;
    boolean isAvailable;

    public Customer(int id, String name, int age,char gender, long mobileNumber, String email, String address, boolean isAvailable) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.mobileNumber = mobileNumber;
        this.email = email;
        this.address = address;
        this.isAvailable = isAvailable;
    }

    void printCustomerDetails(){
        System.out.println("------- Customer Details ----------");
        System.out.println("Customer Id : " + id);
        System.out.println("Customer Name : " + name);
        System.out.println("Customer Age : " + age);
        System.out.println("Customer Gender : " + gender);
        System.out.println("Customer mobileNumber : "+ mobileNumber);
        System.out.println("Customer email : " + email);
        System.out.println("Customer address : " + address);
        System.out.println("Customer isAvailable : " + isAvailable);
    }
}
