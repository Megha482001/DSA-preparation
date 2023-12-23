package com.function_methods;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        //take input of 2 numbers and print the sum

        System.out.println("taking input from the user");
        Scanner in = new Scanner(System.in);
        System.out.println("enter number 1");
        int num1 = in.nextInt();
        System.out.println("enter number 2");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        System.out.println("the sum of these numbers is: ");
        System.out.println(sum);


    }
}
