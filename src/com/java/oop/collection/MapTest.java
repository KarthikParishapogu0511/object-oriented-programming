package com.java.oop.collection;

import com.java.oop.model.Customer;

import java.util.*;

public class MapTest {
    public static void main(String[] args) {
        Map<Integer, Customer> customersMap = new TreeMap<>();

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
                .setName("Jacob")
                .setEmail("jacob12@gmail.com")
                .setPhoneNo("9183456789")
                .setAddress("Noida");

        customersMap.put(customer1.getId(), customer1);
        customersMap.put(customer2.getId(), customer2);
        customersMap.put(customer3.getId(), customer3);
        customersMap.put(customer4.getId(), customer4);
        customersMap.put(customer5.getId(), customer5);
        System.out.println(customersMap);

        System.out.println(customersMap.get(customer1.getId()));

        // here we gave duplicate entries for customer5 with id of customer1 here customer1 details got replaced by customer5 details

        System.out.println("----------Customer Map Elements-----");
        for(Integer id : customersMap.keySet()) {
            System.out.println(customersMap.get(id));
        }
        System.out.println("----------------");

        Set<Map.Entry<Integer,Customer>> entries =  customersMap.entrySet();
        Iterator<Map.Entry<Integer,Customer>> iterator = entries.iterator();
        while(iterator.hasNext()) {
            Map.Entry<Integer,Customer> entry = iterator.next();
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }


    }
}
