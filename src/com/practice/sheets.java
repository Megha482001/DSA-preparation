package com.practice;

public class sheets {
    public static void main(String[] args){
        int[] a= {45,89,85};
        int n = a.length;
        int b= Math.floorDiv(n,2);
        int temp;
        for (int i = 0; i<b;i++){
            temp = a[i];
            a[i] = a[n-i-1];
            a[n-i-1] = temp;
        }
        for (int element:a) {
            System.out.println(element);
        }
    }
}
