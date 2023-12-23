package com.kunal;

public class calculatethearrayof5floats {
    public static void main(String[] args) {
        float[] number={4.2f,2.5f,9.6f,4.3f,8.2f};
        float sum=0;
        for (float element:number) {
            sum = sum + element;

        }
        System.out.println("enter the sum of floating point num"+sum);
    }
}
