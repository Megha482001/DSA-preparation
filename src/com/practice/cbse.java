package com.practice;

import java.util.Scanner;

public class cbse {
    public static void main(String[] args){
        System.out.println("Results");
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the number of Mathematics");
        float a = sc.nextFloat();

        System.out.println("enter the number of bengali");
        float b = sc.nextFloat();

        System.out.println("enter the number of english");
        float c = sc.nextFloat();

        System.out.println("enter total");
        float total =  a + b+ c;
        float percentage = (total/300)*100;
        System.out.println(percentage);


    }



}
