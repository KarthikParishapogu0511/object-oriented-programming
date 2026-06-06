package com.java.oop.abstraction;

public abstract class Payment {

    String id;
    String customerName;
    String paymentDate;
    String mode;
    public Payment(String id, String customerName, String paymentDate , String mode) {
        this.id = id;
        this.customerName = customerName;
        this.paymentDate = paymentDate;
        this.mode = mode;
    }

    public void paymentDetails(){
        System.out.println("Payment Id : " + id);
        System.out.println("Customer Name : "+ customerName);
        System.out.println("Payment Date : " + paymentDate);
        System.out.println("Mode : " + mode);
    }

    public abstract boolean pay(double amount);
    /*
    Abstract is a method defined but not yet implemented
    Another Rule is that if a class has abstract method ,it should be declared as abstract class ;
    Abstract class cannot create an Object;
    Abstract class can have non-abstract methods that we call as Concrete Methods

    {
        System.out.println("Payment done using cash : " + amount);
        return true;
    }
     */
    public  void otpValidation(int otp) {
        System.out.println("OTP Validation done : " + otp);

    }
}
