package com.java.oop.abstraction;

public class DebitCardPayment extends Payment{
    @Override
    public boolean pay(double amount){
        System.out.println("Payment done using Debit Card : " + amount);
        return true;
    }
}
