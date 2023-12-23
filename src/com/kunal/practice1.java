package com.kunal;

import java.util.Arrays;

public class practice1 {
    public static void main(String[] args) {
        int[] arr = {12, 10, 11, 45, 50};
        swap(arr, 1, 4);
        System.out.println(Arrays.toString(arr));
    }
    private static void swap(int[] arr, int index1, int index2) {
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }

}
