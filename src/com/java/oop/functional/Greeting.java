package com.java.oop.functional;

@FunctionalInterface
public interface Greeting {
    void greet(String name,String msg);
    // we can write as many default methods as we can

//    default void someMethod() {
//        System.out.println("Some default method");
//    }


}
