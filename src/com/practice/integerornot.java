package com.practice;

import java.util.Scanner;

public class integerornot {
    public static void main(String[] args) {
        System.out.println("taking an output from the user");
        Scanner sc = new Scanner(System.in);
        boolean b1 = sc.hasNextInt();
        System.out.println(b1);
    }
}
