package com.leetcodeproblems;

import java.util.ArrayList;

class Solution {
    public static int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];

        for (int i = 0; i<= nums.length-1; i++){
            for (int j = i + 1; j<= nums.length - 1; j++){
                if (nums[i] + nums[j] == target ){
                ans[0] = i;
                ans[1] = j;

                    return ans;
                }

            }
        }


        return ans;
    }
    public static void main (String[] args){
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] arr = twoSum(nums, target);
        System.out.println(arr[0] + arr[1]);
    }

}