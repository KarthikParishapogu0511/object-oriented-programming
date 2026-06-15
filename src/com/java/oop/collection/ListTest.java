package com.java.oop.collection;

import com.java.oop.model.Customer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        List<Customer> customers = new LinkedList<>();

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

        Customer customer5 = new Customer();
        customer5.setId(1111)
                .setName("Jack")
                .setEmail("jack12@gmail.com")
                .setPhoneNo("9123456789")
                .setAddress("Noida");

        customers.add(customer1);
        customers.add(customer2);
        customers.add(customer3);
        customers.add(customer4);
        customers.add(customer5);
        System.out.println(customers);
        System.out.println(customers.size());
        // to get the first element
        System.out.println(customers.get(0));

        // we can also use for-each here
        for(Customer customer : customers){
            System.out.println(customer);
        }

        // we can also use for-each here
        for(Customer customer : customers){
            System.out.println(customer.getEmail());
        }

        // even if I change the arrayList to linked list the output won't be changed


        // return customer emails list

        List<String> emails = new ArrayList<>();
        for(Customer customer : customers){
            emails.add(customer.getEmail());
        }
        System.out.println(emails);
    }
}
