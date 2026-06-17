package com.java.oop.functional;



import com.java.oop.model.Customer;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class FunctionalInterfaces {
    public static void main(String[] args) {
        Predicate<String> lengthValidation = str -> str.length() <= 5 && str.length() <= 20;
        System.out.println(lengthValidation.test("Krish"));

        Customer customer = new Customer();
        customer.setId(1111);
        customer.setName("Karthik");
        customer.setEmail("kkaaerth123@gmail.com");
        customer.setPhoneNo("9123456789");
        customer.setAddress("Raj Bhavan");

        Consumer<Customer> printConsumer = customer1 -> {
            System.out.println("ID " + customer1.getId());
            System.out.println("Name " + customer1.getName());
            System.out.println("Email " + customer1.getEmail());
            System.out.println("Phone No " + customer1.getPhoneNo());
            System.out.println("Address " + customer1.getAddress());
        };
        printConsumer.accept(customer);

    }
}
