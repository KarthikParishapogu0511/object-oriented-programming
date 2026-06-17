package com.java.oop.functional;

public class Main {
    public static void main(String[] args) {
//        Greeting greeting = new Greeting() {
//            @Override
//            public void greet() {
//                System.out.println("Hello, How are you?");
//            }
//        };
//        greeting.greet();

        /*
        Java says that for a single abstract method kosaaam Anonymous Class raasey badhuluuu , I will tell you a
        logic is that

        LAMBDA EXPRESSION
         */

        //If it's a single Parameter no need of Parenthesis

        Greeting greeting =  (name,msg) -> System.out.println("Hello " +name + msg);

        greeting.greet("Karthik"," How are you?");
    }
}
