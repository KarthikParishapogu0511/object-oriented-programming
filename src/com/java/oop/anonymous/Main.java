package com.java.oop.anonymous;

public class Main {
    public static void main(String[] args) {
//        GreetingImpl greeting = new GreetingImpl();
//        greeting.greet();
//        greeting.greet("Hii");

        // This below we call as Anonymous Inner class id doesn't have any name to call

        Greeting greeting = new Greeting() {
            @Override
            public void greet() {
                System.out.println("Hello, How are you?");
            }

            @Override
            public void greet(String msg) {
                System.out.println("Hello " + msg + "!");
            }
        };
        //As we already created a Object we can directly call
        greeting.greet();
        greeting.greet("How are you Karthik?");
    }
}
