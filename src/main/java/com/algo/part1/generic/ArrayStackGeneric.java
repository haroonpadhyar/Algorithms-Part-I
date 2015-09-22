package com.algo.part1.generic;

import java.util.Arrays;
import java.util.NoSuchElementException;

/**
 * Created by haroonpadhyar on 9/21/15.
 */
public class ArrayStackGeneric<T> implements StackInterface<T>{

  private T[] s;
  private int N;

  public ArrayStackGeneric(int size){
    s = (T[])new Object[size];
  }

  @Override
  public void push(T val) {
    s[N++] = val;
  }

  @Override
  public T pop() {
    T val = s[--N];
    s[N] = null;
    return val;
  }

  @Override
  public boolean isEmpty() {
    return N == 0;
  }

  @Override
  public int size() {
    return N;
  }

  @Override
  public void print(){
    System.out.println(Arrays.toString(s));
    System.out.println(isEmpty());
    System.out.println(size());
  }

}
