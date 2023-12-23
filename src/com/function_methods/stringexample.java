package com.function_methods;

import java.util.Scanner;

public class stringexample {
    public static void main(String[] args) {
 //       String message = greet();
   //     System.out.print(message);
        Scanner in = new Scanner(System.in);
        System.out.print("enter your name");
        String name = in.next();
        String personalised = myGreet(name);
        System.out.print(personalised);
    }
    static String myGreet(String name){
        String message = "hello " + name;
        return message;
    }
    static String greet() {
        String greeting = "Megha Sarkar";
         return greeting;
    }
}
