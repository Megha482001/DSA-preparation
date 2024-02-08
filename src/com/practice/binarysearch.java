package com.practice;

public class binarysearch {
    public static void main(String[] args){
        int[] arr = {4,5,6,7,8,9,10};
        int target = 10;
        System.out.println(binarysearch(arr,target,0,arr.length-1));
    }
    static int binarysearch(int[] arr,int target,int s,int e){
        if (s>e){
            return -1;
        }
        int mid =  s + (e - s)/2;
        if (arr[mid] == target){
            return mid;
        }
        if (target<arr[mid]){
            return binarysearch(arr, target,s,mid-1);
        }

        return binarysearch(arr,target,mid+1,e);
    }

}
