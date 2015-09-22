package com.algo.part1.elementarysort;

/**
 * Created by haroonpadhyar on 9/22/15.
 */
public class InsertSort {

  public static int[] sort(int[] arr){
    for (int i = 0; i < arr.length; i++) {
      for (int j = i; j > 0; j--) {
        if (less(arr[j], arr[j-1]))
          exch(arr, j, j-1);
        else
          break;
      }
    }
    return arr;
  }

  private static boolean less(int i, int j){
    return i < j;
  }

  private static void exch(int[] arr, int i, int j){
    int swap = arr[i];
    arr[i] = arr[j];
    arr[j] = swap;
  }
}
