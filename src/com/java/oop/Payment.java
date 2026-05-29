package com.java.oop;

public class Payment {

    String senderName;
    float paymentAmount;
    String paymentDateTime ;
    String paymentType;
    boolean isTransactionSuccessful;
    long TransactionId;

    Payment(){
        senderName = "Skar";
        paymentAmount = 75.23F;
        paymentDateTime = "28/05/26 20:30:45";
        paymentType = "Debit Card";
        isTransactionSuccessful = true;
        TransactionId = 57532349549L;
    }

    public Payment(String senderName, float paymentAmount, String paymentDateTime, String paymentType, boolean isTransactionSuccessful, long transactionId) {
        this.senderName = senderName;
        this.paymentAmount = paymentAmount;
        this.paymentDateTime = paymentDateTime;
        this.paymentType = paymentType;
        this.isTransactionSuccessful = isTransactionSuccessful;
        TransactionId = transactionId;
    }
}
