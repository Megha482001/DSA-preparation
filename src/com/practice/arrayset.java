package com.practice;
import javax.swing.plaf.synth.SynthLookAndFeel;
import java.util.Scanner;
public class arrayset {
    public static void main(String[] args) {
  int[] arr= {10,20,30,40};
  boolean isarray = true;
  for (int i = 0; i<arr.length-1;i++){
      if (arr[i] > arr[i+1]){
          isarray = false;
          break;
      }

      }
        if (isarray) {
            System.out.println("sorted");
        }
      else {
          System.out.println("not sorted");
      }
  }

        }








