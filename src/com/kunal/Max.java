package com.kunal;

public class Max {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 56, 45};
        //System.out.println(maxRange(arr, 1, 3));
        //System.out.println(max(arr));
        //System.out.println(min(arr));
    }
    // work on edge cases here,like array being null

    //imagine that arr is not empty
    static int max(int[] arr){
        int maxVal = arr[0];
  for (int i = 1; i < arr.length; i++){
    if (arr[i] > maxVal) {
        maxVal = arr[i];

   }

}
return maxVal;
    // find minimum value
/*static int min(int[] arr){
    int minVal = arr[0];
    for (int i = 1; i < arr.length; i++){
        if (arr[i] < minVal) {
            minVal = arr[i];

        }

    }
    return minVal;
}*/
    }
}
