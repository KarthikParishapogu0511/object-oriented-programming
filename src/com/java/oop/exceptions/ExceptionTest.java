package com.java.oop.exceptions;

import java.util.Scanner;

public class ExceptionTest {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter number: ");
            int num1 = sc.nextInt();
            System.out.println("Enter number: ");
            int num2 = sc.nextInt();
            int result = num1 / num2;
            System.out.println(result);
            String name = getName();
            System.out.println("Hello " + name.toUpperCase() + "!");
        } /*catch (ArithmeticException e) {
//            System.out.println("Error :" + e.getMessage());
            System.out.println("Number2 cannot be zero");
            input();
        }
        catch (NullPointerException e) {
            System.out.println("Name cannot be null");
            input();
        }*/
        catch (Exception e) {
            System.out.println("Internal Error found");
            System.out.println(e.getMessage());
            input();
        }
    }

    private static void input() {
        System.out.println("Input Continues");
    }

    public static String getName() {
        String name = null;
        //code
        return name;
    }
}
