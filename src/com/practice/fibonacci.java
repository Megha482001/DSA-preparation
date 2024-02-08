package com.practice;

public class fibonacci {
    public static void main(String[] args)
    {
     System.out.println(fibon(4));
    }
    static int fibon(int n){
        if (n<2) {
            return n;
        }
        return fibon(n-1)+fibon(n-2);
    }
}
