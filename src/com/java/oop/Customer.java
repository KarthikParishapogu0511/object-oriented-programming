package com.java.oop;

public class Customer {

    public int id;
    public String name;
    public int age;
    public long mobileNumber;
    public String email;
    public String address;
    public boolean isAvailable;

    Customer(){
        System.out.println("Customer() Function is called.");
        id = 101;
        name = "Shiva";
        age = 28;
        mobileNumber = 8877665321L;
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

    void printCustomerDetails(){
        System.out.println("Customer Id : " + id);
        System.out.println("Customer Name : " + name);
        System.out.println("Customer Age : " + age);
        System.out.println("Customer mobileNumber : "+ mobileNumber);
        System.out.println("Customer email : " + email);
        System.out.println("Customer address : " + address);
        System.out.println("Customer isAvailable : " + isAvailable);
    }
    void updateCustomerAddress(String address){
        this.address =address;
    }

    void isCustomerActiveStatus(){
        System.out.println("Is Customer Active Status : " + isAvailable);
    }

    void deActivateCustomerAccount(){
        isAvailable  = false;
        System.out.println("deActivate Customer Account : " + isAvailable);

    }
    void validateCustomerMobileNumber(){
        //if(mobileNumber.hasNextLong()){


    }
}
