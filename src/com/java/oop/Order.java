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

    void calculateTotalAmount(){
        float stateTax = 0.05F;
        float centralTax = 0.05F;

        float  stateTaxAmount = amount * stateTax;
        float centralTaxAmount = amount * centralTax;
        float totalAmount = amount + stateTaxAmount + centralTaxAmount;
        System.out.println("Total Amount : " + totalAmount);
    }
    boolean updateOrderStatus(){
        return isOrderPlaced;
    }

    boolean isOrderPaid(){
        return isPaymentClosed;
    }

    void OrderCancelled(){
        isOrderPlaced = false;
        System.out.println("Order cancelled ");
    }

    void displayOrderSummary(){
        System.out.println("Order Id : " + id);
        System.out.println("Customer Id : " + customerId);
        System.out.println("Order Amount : " + amount);
        System.out.println("Order Date : " + date);
        System.out.println("Is Order placed ? : " + isOrderPlaced);
        System.out.println("Payment Type : " + paymentType);
        System.out.println("Is payment Closed ? : " + isPaymentClosed);
        System.out.println("-------------------------");
    }

}
