package com.leetcode;

import java.util.*;
public class Problem_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        int arr[] = new int[size];
        int i;

        System.out.println("Enter the elements of the array : ");
        for (i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("The elements of the array are : ");
        for (i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        // Removing duplicate elements from the array
        Set<Integer> set = new HashSet<Integer>();
        for (i = 0; i < size; i++) {
            set.add(arr[i]);
        }

        System.out.println("Printing the array after removing duplicates : ");
        for (int element : set) {
            System.out.print(element + " ");
        }
    }
}