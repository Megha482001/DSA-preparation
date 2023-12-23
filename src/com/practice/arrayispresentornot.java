package com.practice;
import java.util.Scanner;
public class arrayispresentornot {
    public static void main(String[] args) {
        int[] arr={12,45,90,50,60};
        Scanner sc=new Scanner(System.in);
        int number = sc.nextInt();
        boolean isArray=false;
        for (int element:arr) {
            if(number==element){
                isArray=true;
                break;
            }
        }
        if (isArray){
            System.out.println("array is present");
        }
        else {
            System.out.println("Array is not present");
        }

    }
}
