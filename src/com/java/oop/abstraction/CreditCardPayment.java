package com.java.oop.abstraction;

public class CreditCardPayment extends Payment{

    @Override
    public boolean pay(double amount){
        System.out.println("Payment done using Credit Card : " + amount);
        return true;
    }

}
