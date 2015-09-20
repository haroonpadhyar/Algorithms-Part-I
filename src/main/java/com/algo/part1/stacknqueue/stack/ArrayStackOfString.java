package com.algo.part1.stacknqueue.stack;

import java.util.Arrays;

/**
 * Created by haroonpadhyar on 9/20/15.
 */
public class ArrayStackOfString implements StackInterface{
  private String[] s;
  private int N;

  public ArrayStackOfString(int size){
    s = new String[size];
  }

  @Override
  public void push(String str) {
    s[N++] = str;
  }

  @Override
  public String pop() {
    String val = s[--N];
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
