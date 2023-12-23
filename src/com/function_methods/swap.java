package com.function_methods;

public class swap {
    public static void main(String[] args) {
       int a = 10;
       int b = 23;
       // swap numbers code
  //      int temp = a;
    //    a = b;
      //  b = temp;
        swap(a, b);

        System.out.print(a + " " + b);
        String name = "Kunal Kushwaha";
        changeName(name);
        System.out.println(name);


    }
    static void changeName(String naam){    // scoping
        naam = "Megha Sarkar";
    }
    static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
        return;
    }
}
