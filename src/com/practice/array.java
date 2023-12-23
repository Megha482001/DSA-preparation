package com.practice;
import java.util.Arrays;
import java.util.Scanner;
public class array {
    public static void main(String[] args) {
        int[] arr ={98, 80, 99, 100, 45};
        //int[] marks;
        //int[] arr ={40,80,10};
        //arr = new String[3];
        //  arr[0] = "Megha";
        //  arr[1] = "neha";
        //  arr[2] = "baba";
        // Scanner sc = new Scanner(System.in);
        // Question no.2
        //  int num = sc.nextInt();
        //  boolean isArray = false;
        //  for (int element:arr) {
        //      if (num == element) {
        //          isArray = true;
        //      }
        //  }
        //  if(isArray){
        //      System.out.println("the value is present");
        //  }
        //  else {
        //      System.out.println("the value is not present");
        //  }
        //Question no. 3
        // float sum = 0;
        // for (int element:arr) {
        //    sum = sum + element;

        // }
        // System.out.println("the value of average marks:" + sum/ arr.length);
        // Question no: 4
        //   int [][] mat1 = {{1, 2, 3},
        //                    {4, 5, 6}};
        //   int [][] mat2 = {{2, 6, 13},
        //                    {3, 7, 1}};
        //   int [][] result = {{0, 0, 0},
        //                     {0, 0, 0}};
        //   for (int i=0;i<mat1.length;i++){ // row number of times
        //       for (int j=0;j<mat1[i].length;j++) { // column number of time
        //          //System.out.format(" Setting value for i=%d and j=%d\n", i, j);
        //           System.out.print(result[i][j]+" ");
        //           result[i][j] = mat1[i][j] + mat2[i][j];
        //       }
        //       System.out.println(" ");
        //   }
        // for (int i=0;i>marks.length;i--){

        // }
        // System.out.println("Array in reverse order");
      //  swap(arr, 1, 3);

            System.out.print(max(arr));
    }
   // static void swap(int arr[], int index1, int index2){
   //     int temp = arr[index1];
   //     arr[index1] = arr[index2];
   //     arr[index2] = temp;
    static int max(int[] arr) {
        int maxVal = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];

            }
        }
        return maxVal;
    }

    }



