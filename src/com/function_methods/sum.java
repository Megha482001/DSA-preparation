package com.function_methods;

import java.util.Scanner;

public class sum {
    public static void main(String[] args){
     //  int ans = sum2();// calling the functions
       // System.out.println(ans);
        int ans = sum3(20, 30);
        System.out.print(ans);
    }
    // pass the value of numbers when you are calling the method in main()
    static  int sum3(int a, int b) {
        int sum = a + b ;
        return sum;
    }
    // return the value
    static int sum2() {
        Scanner in = new Scanner(System.in);
        System.out.println("enter number 1");
        int num1 = in.nextInt();
        System.out.println("enter number 2");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        return sum;
    }
    static void sum() {
        Scanner in = new Scanner(System.in);
        System.out.println("enter number 1");
        int num1 = in.nextInt();
        System.out.println("enter number 2");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        System.out.println("the sum of these numbers is: ");
        System.out.println(sum);



        /*
            access modifier (we'll look in oop) return_type name ()
             //body
            return statement;

         */


    }
}


