package com.function_methods;

public class pattern_q17 {
    public static void main() {
        pattern17(5);
    }

    static void pattern17(int n) {
        for (int row = 1; row <= 2 * n; row++) {
            int c = row > n ? 2 * n - row : row;

            for (int space = 0; space < n - c; space++) {
                System.out.print(" ");
            }
            int noofspaces = n - c;


            for (int col = c; col >= 1; col--) {
                System.out.print(col);
            }
            for (int col = 2; col <= c; col++) {
                System.out.print(col);
                for (int s = 0; s < noofspaces; s++) {
                     System.out.print(col);
                     }
                    //for (int col = row; col <= 1; col++) {
                     //System.out.print(col);
                    }
                    for (int col = 2; col <= row; col++) {
                     System.out.print(col);
                }
                System.out.println();
            }
        }
    }
