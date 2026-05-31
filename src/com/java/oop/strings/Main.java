package com.java.oop.strings;

import com.java.oop.Customer;

public class Main {

//    static  String name; //instance variable (stores in  heap) it would be default initialized
    public static void main(String[] args) {
        String str1 = new String();
        System.out.println(str1); // output is empty character sequence
        String name = null;// local variable (stores in stack) so it won't be initialized
        System.out.println(name);

        char[] chars = {'a','b','c','d'};
        String str2 = new String(chars);
        System.out.println(str2);

        String str3 = new String("abcd");
        System.out.println(str2  == str3); // it compares only reference of objects but not object content or values

        String str4 = new String("abcd");
        System.out.println(str3 == str4);

        //  STRING Literals

        String str5 = "abcd";
        String str6 = "abcd";
        System.out.println(str5 == str6);

        //string manipulation

        System.out.println(str5.charAt(2));

        String username = "admin123";
        String password = "admin@123!";
        System.out.println(username.compareTo("admin123")); // It returns  the Unicode difference
        System.out.println(username.compareToIgnoreCase("ADmin123"));

        String greeting = "Hello ";
        greeting.concat(username);
        System.out.println(greeting);  // output is Hello but not hello admin123
        /*
        Because String Objects are Immutable
         */
        greeting = greeting.concat(username);
        System.out.println(greeting);
        if(username.equalsIgnoreCase("admin123") && password.equals("admin@123!")){
            System.out.println("Valid login");
        }else{
            System.out.println("Invalid login");
        }

        if(username.length() > 5 && username.length() < 10){
            System.out.println("Username length is Valid");
        }else {System.out.println("Username length  is Invalid");}


        //Regular Expression
        //username validation Alpha Numeric with _
        String regex = "^[a-zA-Z0-9_]+$";
        if(username.matches(regex)){
            System.out.println("Valid Username");
        }else{
            System.out.println("Invalid Username");
        }

        String customerData = "101,john,43,8776542454,john@gmail.com,swamiRoad,true";
        String[] split = customerData.split(",");

        Customer customer = new Customer(Integer.parseInt(split[0]),split[1],Integer.parseInt(split[2]),Long.parseLong(split[3]),split[4],split[5],Boolean.parseBoolean(split[6]));
        System.out.println("ID : " + customer.id);
        System.out.println("Name : " + customer.name);
        System.out.println("Age : " + customer.age);
        System.out.println("Phn No : " + customer.mobileNumber);
        System.out.println("Email : " + customer.email);
        System.out.println("Address : " + customer.email);
        System.out.println("Is Available : " + customer.isAvailable);


        String email = "       karthik123@gmail.com  ";
        if(email.trim().equals("karthik123@gmail.com")){
            System.out.println("Valid Email");

        }else{
            System.out.println("Invalid Email");
        }


    }
}
