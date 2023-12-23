package com.binarysearch;

public class orderagnosticsBS {
    public static void main(String[] args) {
        int[] arr = {2, 3, 9, 10, 11, 15, 20, 25, 30};
        int target = 15;
        int ans = orderagonsticBS(arr, target);
        System.out.println(ans);
    }

    static int orderagonsticBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        //find whether the array is sorted in ascending or descending order
        boolean isAsc;
        if (arr[start] < arr[end]) {
            isAsc = true;

        } else {
            isAsc = false;
        }

        while (start <= end) {
            //find the middle element
            //     int mid = (start + end) / 2; // might be possible that (start+end) exceeds the range of int in java
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else if (target > arr[mid]) {
                    start = mid + 1;

                }

            }else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else if (target < arr[mid]) {
                    start = mid + 1;

                }
            }

        }
        return -1;
    }
}