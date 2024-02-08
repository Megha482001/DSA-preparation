package com.Recursion;

public class nto1 {
    public static void main(String[] args){
        funcboth(5);
    }
    static void func(int n){
        if (n==0){
            return;
        }
        System.out.println(n);
        func(n-1);
    }
    static void funcreverse(int n){
        if (n==0){
            return;
        }
        funcreverse(n-1);
        System.out.println(n);

    }
    static void funcboth(int n){
        if (n==0){
            return;
        }
        System.out.println(n);
        funcboth(n-1);
        System.out.println(n);

    }

}
