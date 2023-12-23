package com.binarysearch;

public class Floor {
    public static void main(String[] args) {
        int[] arr = {2, 3, 9, 10, 11, 14, 20, 25, 30};
        int target = 15;
        int ans = floor(arr, target);
        System.out.println(ans);
    }
    // return the index
    //return -1 if it does not exist
    static int floor(int[] arr, int target) {


        int start = 0;
        int end = arr.length-1;

        while(start <= end) {
            //find the middle element
            //     int mid = (start + end) / 2; // might be possible that (start+end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;

            } else {
                // ans found
                return mid;
            }

        }
        return end;
    }
}
