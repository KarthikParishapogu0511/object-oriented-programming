package com.java.oop;

public class Payment {

    String senderName;
    float paymentAmount;
    String paymentTimeStamp ;
    String paymentMethod;
    boolean isTransactionSuccessful;
    long TransactionId;

    Payment(){
        senderName = "Skar";
        paymentAmount = 75.23F;
        paymentTimeStamp = "28/05/26 20:30:45";
        paymentMethod = "Debit Card";
        isTransactionSuccessful = true;
        TransactionId = 57532349549L;
    }

    public Payment(String senderName, float paymentAmount, String paymentTimeStamp, String paymentMethod, boolean isTransactionSuccessful, long TransactionId) {
        this.senderName = senderName;
        this.paymentAmount = paymentAmount;
        this.paymentTimeStamp = paymentTimeStamp;
        this.paymentMethod = paymentMethod;
        this.isTransactionSuccessful = isTransactionSuccessful;
        this.TransactionId = TransactionId;
    }

    void printPaymentDetails(){
        System.out.println("Sender : " + senderName);
        System.out.println("Payment Amount : " + paymentAmount);
        System.out.println("Payment TimeStamp : " + paymentTimeStamp);
        System.out.println("Payment Method : " + paymentMethod);
        System.out.println("Transaction Successful : " + isTransactionSuccessful);
        System.out.println("Transaction Id : " + TransactionId);
    }
}
