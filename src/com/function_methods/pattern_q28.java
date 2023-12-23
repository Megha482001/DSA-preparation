package com.function_methods;

public class pattern_q28 {
    public static void main(String[] args) {
        pattern28(5);
    }
    static void pattern28(int n){
        for (int row = 0; row < 2 * n; row++) {
            int totalColsInRow = row > n ? 2 * n - row: row;

            int noofspaces = n - totalColsInRow;
            for (int s = 0; s < noofspaces; s++) {
                System.out.print(" ");
            }
            for (int col = 0; col <= totalColsInRow; col++){
                System.out.print("* ");
            }
            System.out.println();

        }
    }
}

