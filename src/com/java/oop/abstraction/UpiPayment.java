package com.java.oop.abstraction;

public class UpiPayment extends Payment{

    @Override
    public boolean pay(double amount) {
        System.out.println("Payment done using Upi : " + amount);
        return true;
    }
}
