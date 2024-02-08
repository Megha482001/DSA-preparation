package com.Recursion;
import java.util.ArrayList;
public class permutations {
    public static void main(String[] args) {
  //  permuation("","abcd");
      ArrayList<String> ans = permutationlist("","abcd");
     System.out.println(ans);
   System.out.println(permuationCount("","abcd"));
    }
    static void permuation(String p, String up){
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
           String f = p.substring(0,i);
           String s = p.substring(i,p.length());
           permuation(f+ch+s, up.substring(1));
        }
    }
    static ArrayList<String> permutationlist(String p, String up){
        if (up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> ans = new ArrayList<>();
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            ans.addAll(permutationlist(f + ch + s, up.substring(1)));
        }
        return ans;
    }
    static int permuationCount(String p, String up){
        if (up.isEmpty()) {
            return 1;
        }
        int count = 0;
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());
            count = count + permuationCount(f+ch+s, up.substring(1));
        }
        return count;
    }

}

