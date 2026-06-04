package com.java.oop.abstraction;

public abstract class Payment {

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
    public abstract void otpValidation(int otp);
    /*{
    }
     */

}
