package com.java.oop.abstraction;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*

        OrderService orderService = new OrderService();
        if(orderService.processOrder(1000)){
            System.out.println("Order Processed Successfully using cash");
        }
        if(orderService.processOrderCreditCard(123450)){
            System.out.println("Order Processed Successfully using credit card");
        }

         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose your option : ");

        System.out.println("1. Cash On Delivery");
        System.out.println("2. Credit Card");
        System.out.println("3. Debit Card");
        System.out.println("4. UPI");
        int choice = scanner.nextInt();
        OrderService orderService;
        Payment payment;
        double amount;
        int otp;
        switch (choice){
            case 1:
//                System.out.println("Processing order using cash");
                //Payment payment = new Payment();
                payment = new CashOnDeliveryPayment("1","madhu","09-09-26","cash on delivery");
                orderService = new OrderService(payment);
                System.out.println("Enter Amount : ");
                amount = scanner.nextDouble();
                System.out.println("Enter OTP :");
                otp = scanner.nextInt();
                payment.otpValidation(otp);
                if(orderService.processOrder(amount))
                    System.out.println("Order Processed Completely using cash");
                break;
            case 2:
                //System.out.println("Processing order using Credit Card");
                payment = new CreditCardPayment("2","madhu","19-09-26","credit card");
                orderService = new OrderService(payment);
                System.out.println("Enter Amount : ");
                amount = scanner.nextDouble();
                System.out.println("Enter OTP :");
                otp = scanner.nextInt();
                payment.otpValidation(otp);
                if(orderService.processOrder(amount))
                    System.out.println("Order Processed Completely using Credit Card");
                break;
            case 3:
                payment = new DebitCardPayment("3","madhu","29-09-26","Debit Card");
                orderService = new OrderService(payment);
                System.out.println("Enter Amount : ");
                 amount = scanner.nextDouble();
                System.out.println("Enter OTP :");
                otp = scanner.nextInt();
                payment.otpValidation(otp);
                if(orderService.processOrder(amount))
                    System.out.println("Order Processed Completely using Debit Card");
                break;
            case 4:
                payment = new UpiPayment("4","madhu","09-10-26","UPI delivery");
                orderService = new OrderService(payment);
                System.out.println("Enter Amount : ");
                amount = scanner.nextDouble();
                System.out.println("Enter OTP :");
                otp = scanner.nextInt();
                payment.otpValidation(otp);
                if(orderService.processOrder(amount))
                    System.out.println("Order Processed Completely using UPI");
                break;
            default:
                System.out.println("Invalid Option");
        }
    }
}
