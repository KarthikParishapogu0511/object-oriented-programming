package com.java.oop;

public class Order {

    int id;
    int customerId;
    float amount;
    String date;
    boolean isOrderPlaced;
    String paymentType;
    boolean isPaymentClosed;
    Order(){
        System.out.println("Order Function() Called.");
        id = 1001;
        customerId = 101;
        amount = 6875.92F;
        date = "23/05/2026";
        isOrderPlaced = true;
        paymentType = "online payment";
        isPaymentClosed = true;
    }

    public Order(int id, int customerId, float amount, String date, boolean isOrderPlaced, String paymentType, boolean isPaymentClosed) {
        this.id = id;
        this.customerId = customerId;
        this.amount = amount;
        this.date = date;
        this.isOrderPlaced = isOrderPlaced;
        this.paymentType = paymentType;
        this.isPaymentClosed = isPaymentClosed;
    }
}
