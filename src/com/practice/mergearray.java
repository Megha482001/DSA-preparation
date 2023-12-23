package com.practice;

import java.util.Arrays;

public class mergearray {
    public static void main(String[] args) {
        int[] arr = {12, 45, 89, 78};
        int[] arr1 = {10, 10, 50, 40};
        int a1 = arr.length;
        int b1 = arr1.length;
        int c1 = a1 + b1;
        int[] c = new int[c1];
       System.arraycopy(arr, 0, c, 0, a1);
          System.arraycopy(arr1, 0, c, a1, b1);
        System.out.println(Arrays.toString(c));
    }
}
