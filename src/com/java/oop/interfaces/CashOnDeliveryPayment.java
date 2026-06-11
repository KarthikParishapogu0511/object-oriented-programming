package com.java.oop.interfaces;

public class CashOnDeliveryPayment  implements Payment{
    @Override
    public boolean pay(double amount) {
        Payment.validTransactions(1,amount);
        System.out.println("Payment Done Successfully : " + amount);
        return true;
    }

    @Override
    public boolean pay(int customerId, double amount) {
        return false;
    }


}
