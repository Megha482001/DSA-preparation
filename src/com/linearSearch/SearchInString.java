package com.linearSearch;

import java.util.Arrays;

//import java.util.Scanner;
public class SearchInString {
    public static void main(String[] args) {
        String name = "Megha";
        char target = 'a';
    //    System.out.println(search(name, target));
            System.out.println(Arrays.toString(name.toCharArray()));
    }
    static boolean search(String str, char target) {
            if (str.length() == 0) {
                return false;
            }
           // for (int i = 0; i < str.length(); i++) {
             //   if (target == str.charAt(i)) {
               //     return true;
                //}
            //}
        for (char ch : str.toCharArray()){
            if (ch == target) {
                return true;
            }
        }
            return false;
    }
}
