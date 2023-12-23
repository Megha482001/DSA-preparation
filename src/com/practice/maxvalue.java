package com.practice;

public class maxvalue {
    public static void main(String[] args) {
        int[] arr={20,50,60,45,80};
        System.out.println(max(arr));
    }
    static int max(int[] arr){
        int minval=arr[0];
        for(int i=0;i>arr.length;i++) {
        if(arr[i]>minval){
            minval=arr[i];
        }
        }
        return minval;
    }
}
