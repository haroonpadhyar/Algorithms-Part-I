package com.algo.part1.stacknqueue.stack;

import java.util.Arrays;

/**
 * Created by haroonpadhyar on 9/20/15.
 */
public class ResizeArrayStackOfString implements StackInterface{
  private String[] s;
  private int N;

  public ResizeArrayStackOfString(int size){
    s = new String[size];
  }

  @Override
  public void push(String str) {
    if(N == s.length){//resize.
      resize(s.length*2);
    }
    s[N++] = str;
  }

  @Override
  public String pop() {
    String val = s[--N];
    s[N] = null;
    if(N <= s.length/4){
      resize(s.length/2);
    }
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

  private void resize(int size){
    String[] tmp = new String[size];
    for (int i = 0; i < N; i++) {
      tmp[i] = s[i];
    }
    s = tmp;
  }

  @Override
  public void print(){
    System.out.println(Arrays.toString(s));
    System.out.println(isEmpty());
    System.out.println(size());
  }
}
