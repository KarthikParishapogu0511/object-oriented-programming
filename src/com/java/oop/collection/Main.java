package com.java.oop.collection;

import com.java.oop.model.Customer;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setId(101)
                .setName("Ram")
                .setEmail("ram127@gmail.com")
                .setPhoneNo("9876543210")
                .setAddress("Ramu Nagar");
        /*
        Above 5 lines of code is written by Builder Design Pattern ,
         here while we're writing setters
        we don't return void but the Same object in that way it will keep going till last and we dont
         have to refer everytime , It becomes more readable and we can write in single line of code
        */
        System.out.println("ID : " +customer.getId());
        System.out.println("Name :" + customer.getName());
        System.out.println("Email : " + customer.getEmail());
        System.out.println("Phone Number : " + customer.getPhoneNo());
        System.out.println("Address : " + customer.getAddress());

        System.out.println(customer);
        // it returns class Type @ hashCode
        // if u want to print customer details using sout(customer) we have to override toString method


    }
}
