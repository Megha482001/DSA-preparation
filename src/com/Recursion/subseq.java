package com.Recursion;

import java.util.ArrayList;

public class subseq {
    public static void main(String[] args) {
       // subsequence("", "abd");
      System.out.println(subsequenceAsciireturn("","abd"));
        //subsequenceAscii("","abd");
    }
    static void subsequence(String p, String up){
      if (up.isEmpty()){
          System.out.println(p);
          return;
      }
      char ch = up.charAt(0);
      subsequence(p + ch, up.substring(1));//add it
        subsequence(p, up.substring(1));
    }
    static ArrayList<String> subsequencereturn(String p, String up){
        if (up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = subsequencereturn(p + ch, up.substring(1));//add it
        ArrayList<String> right = subsequencereturn(p, up.substring(1));
        left.addAll(right);
        return left;
    }
    static void subsequenceAscii(String p, String up){
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subsequenceAscii(p + ch, up.substring(1));//add it
        subsequenceAscii(p, up.substring(1));
        subsequenceAscii(p + (ch + 0), up.substring(1));
    }
    static ArrayList<String> subsequenceAsciireturn(String p, String up){
        if (up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = subsequenceAsciireturn(p + ch, up.substring(1));//add it
        ArrayList<String> right = subsequenceAsciireturn(p, up.substring(1));
        ArrayList<String> middle = subsequenceAsciireturn(p + (ch + 0), up.substring(1));
        left.addAll(right);
        left.addAll(middle);
        return left;
    }

}
