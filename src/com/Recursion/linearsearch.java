package com.Recursion;

import java.util.ArrayList;

public class linearsearch {
    public static void main(String[] args) {
        int[] arr = {12, 45, 56, 85, 52,40};
      //  System.out.println(searching(arr, 45, 0));
       // System.out.println(searchingindex(arr, 45, 0));
        //System.out.println(searchingindexlast(arr, 45, arr.length - 1));
      //  searchingallindex(arr,85,0);
        //System.out.println(list);
     //   ArrayList<Integer> list = new ArrayList<>();
       // ArrayList<Integer> ans = findingallindex(arr,56,0,list);
     //   System.out.println(ans);
       // System.out.println(list);
        System.out.println(findingallindex2(arr,52,0));
    }
    static boolean searching(int[] arr, int target, int index) {
        if (index == arr.length) {
            return false;
        }
        return arr[index] == target || searching(arr, target, index + 1);
    }
    static int searchingindex(int[] arr, int target, int index) {
        if (index == arr.length) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        } else {
            return searchingindex(arr, target, index + 1);
        }
    }
    static int searchingindexlast(int[] arr, int target, int index) {
        if (index == arr.length) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        } else {
            return searchingindexlast(arr, target, index - 1);
        }
    }
    static ArrayList<Integer> list = new ArrayList<>();
    static void searchingallindex(int[] arr, int target, int index) {
        if (index == arr.length) {
            return;
        }
        if (arr[index] == target) {
            list.add(index);
        }
            searchingallindex(arr, target, index + 1);
        }
    static ArrayList<Integer> findingallindex(int[] arr, int target, int index,ArrayList<Integer> list) {
        if (index == arr.length) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        return findingallindex(arr, target, index + 1,list);

    }
    static ArrayList<Integer> findingallindex2(int[] arr, int target, int index) {
        ArrayList<Integer> list = new ArrayList<>();
        if (index == arr.length) {
            return list;
        }
        // this will contain answer for that function call only
        if (arr[index] == target) {
            list.add(index);
        }
        ArrayList<Integer> ansfrombelowcalls = findingallindex2(arr, target, index + 1);
        list.addAll(ansfrombelowcalls);
        return list;
    }
}

