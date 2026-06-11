package com.java.oop.interfaces;

public interface Payment {
    /*
    While declaring methods no need of mentioning public abstract as java by default makes it public abstract
    even if you declare java hides it
     */

    int MAX_PAYMENT_AMOUNT = 10000;
    int MAX_TRANSACTIONS_ALLOWED = 3;

     boolean pay(double amount);
     boolean pay(int customerId,double amount);
     default void otpValidation(int otp){
         System.out.println("Otp Validation done : " + otp);
     }
     static  boolean validTransactions(int myTransactions,double paymentAmount){
         return (myTransactions <= MAX_TRANSACTIONS_ALLOWED) && (paymentAmount <= MAX_PAYMENT_AMOUNT);
     }
}
