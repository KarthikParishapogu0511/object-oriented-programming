package com.java.oop.abstraction;

public class CashOnDeliveryPayment extends Payment{

    @Override
    public boolean pay(double amount) {
        System.out.println("Payment done using cash on delivery : " + amount);
        return true;
    }
}
