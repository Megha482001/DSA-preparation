package com.function_methods;

public class shadowing {
    static int x = 90; // this will shadowed at line 8
    public static void main(String[] args) {
        System.out.println(x);
        int x = 40; // the class variable at line are shadowed by this
        System.out.println(x); // 40
        fun();
    }
    static void fun(){
        System.out.println(x);
    }
}
