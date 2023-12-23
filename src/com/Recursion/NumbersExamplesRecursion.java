package com.Recursion;

public class NumbersExamplesRecursion {
    public static void main(String[] args) {
        print(1);

    }

    static void print(int n) {
        // base condition
        if (n == 5) {
            System.out.println(n);
            return;

        }


        System.out.println(n);

        //recursive call
        //if you are calling a function again and again , you can treat it as a separate call in the stack
        // tail recursion
        print(n + 1); // this is last function call
    }

}



