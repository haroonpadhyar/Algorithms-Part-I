package com.algo.part1.elementarysort;

/**
 * Created by haroonpadhyar on 9/22/15.
 */
public class SelectionSort {

  public static int[] sort(int[] arr){
    for (int i = 0; i < arr.length; i++) {

      int min = i;
      for (int j = i+1; j < arr.length; j++) {
        if (less(arr[j], arr[min]))
          min = j;
      }
      exch(arr, i, min);
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
