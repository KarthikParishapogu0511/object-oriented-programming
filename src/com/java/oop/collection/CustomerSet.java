package com.java.oop.collection;

import com.java.oop.comparator.CustomerIdAscComparator;
import com.java.oop.comparator.CustomerIdDescComparator;
import com.java.oop.model.Customer;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class CustomerSet {
    public static void main(String[] args) {
        // LinkedHashSet preserves Insertion order
        Set<Customer> customers =  new TreeSet<>(new CustomerIdDescComparator());

        Customer customer1 = new Customer();
        customer1.setId(1111)
                .setName("Jack")
                .setEmail("jack12@gmail.com")
                .setPhoneNo("9123456789")
                .setAddress("Noida");
        Customer customer2 = new Customer();
        customer2.setId(4444)
                .setName("John")
                .setEmail("john23@gmail.com")
                .setPhoneNo("9123456744")
                .setAddress("Mizoram");
        Customer customer3 = new Customer();
        customer3.setId(3333)
                .setName("Jane")
                .setEmail("jane34@gmail.com")
                .setPhoneNo("9128856744")
                .setAddress("Jaipur");
        Customer customer4 = new Customer();
        customer4.setId(2222)
                .setName("Jason")
                .setEmail("jason23@gmail.com")
                .setPhoneNo("9123456744")
                .setAddress("Bhuvaneshwar");

        customers.add(customer1);
        customers.add(customer2);
        customers.add(customer3);
        customers.add(customer4);
        System.out.println(customers);
        System.out.println("Size : " + customers.size());
    }
}
