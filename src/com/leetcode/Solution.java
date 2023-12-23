package com.leetcode;

class Solution {
    public static int removeElement(int[] nums, int val) {
        int k = 0;
        for (int i = 0; i<= nums.length-1; i++){
        if (nums[i] != val){
            k++;
        }

        }
        return k;
    }

    public static void main(String[] args) {
        int [] nums = {7,8,9,10,2,2};
        int val = 2;
        int num = removeElement(nums, val);
        System.out.println(num);


    }
}