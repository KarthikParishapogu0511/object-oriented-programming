package com.java.oop.strings;

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

        System.out.println(username.length());


    }
}
