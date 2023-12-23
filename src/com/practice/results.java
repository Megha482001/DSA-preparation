package com.practice;

import java.util.Scanner;

public class results {
    public static void main(String[] args) {

        System.out.println("Enter your marks of 5 subjects");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter subject one marks");
        float a = sc.nextFloat();

        System.out.println("Enter subject two marks");
        float b = sc.nextFloat();

        System.out.println("Enter subject third marks");
        float c = sc.nextFloat();

        System.out.println("Enter subject fourth marks");
        float d = sc.nextFloat();

        System.out.println("Enter fifth subject marks");
        float e = sc.nextFloat();

        System.out.println("Your percentage is ");
        float ttl = (a+b+c+d+e);
        float per = (ttl/500)*100;

        System.out.println(per);
    }
}
