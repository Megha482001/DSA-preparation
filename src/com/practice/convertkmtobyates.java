package com.practice;

import java.util.Scanner;

public class convertkmtobyates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float kilometer = sc.nextFloat();
        System.out.println(kilometer);
        double miles = (kilometer/1.609344);
        System.out.println(miles);
    }
}
