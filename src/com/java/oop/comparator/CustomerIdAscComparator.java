package com.java.oop.comparator;

import com.java.oop.model.Customer;

import java.util.Comparator;

public class CustomerIdAscComparator implements Comparator<Customer> {
    @Override
    public int compare(Customer c1, Customer c2) {
        return c1.getId()-c2.getId();
    }
    // InComparable using compareTo we can only compare using 1 property at a time
    // but as we compare using different properties to compare at a time we use comparator
    // To use Comparator we implement Interface Comparator and override methods

}
