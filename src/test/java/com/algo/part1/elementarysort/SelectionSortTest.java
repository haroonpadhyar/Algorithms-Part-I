package com.algo.part1.elementarysort;

import java.util.Arrays;

import org.junit.Test;

/**
 * Created by haroonpadhyar on 9/22/15.
 */
public class SelectionSortTest {

  @Test
  public void test(){
    int[] arr = {1,3,4,2,41,1,13,3};
    System.out.println(Arrays.toString(SelectionSort.sort(arr)));
  }
}
