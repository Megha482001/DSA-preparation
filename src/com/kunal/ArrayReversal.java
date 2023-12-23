package com.kunal;

public class ArrayReversal {
    public static void main(String[] args) {

        //array length
        int[] arr = {1, 2, 3, 4, 5, 6};
        System.out.println(arr.length);

        // display of an array
        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);


        //reverse of an array
        for (int i = arr.length-1; i>=0; i--){
            System.out.println(arr[i]);
        }
    }
}
