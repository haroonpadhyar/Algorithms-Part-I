package com.algo.part1.stacknqueue.queue;

import java.util.Arrays;

/**
 * Created by haroonpadhyar on 9/20/15.
 */
public class ResizeArrayQueueOfString implements QueueInterface{
  String[] s;
  int f,l,N;

  public ResizeArrayQueueOfString(int size){
    s = new String[size];
  }

  @Override
  public void enqueue(String str) {
    if(N == s.length)
      resize(s.length * 2);
    s[f++%s.length] = str;
    N++;
  }

  @Override
  public String dequeue() {
    String val = s[l%s.length];
    s[l++%s.length] = null;
    N--;
    if(N <= s.length/4)
      resize(s.length/2);
    return val;
  }

  @Override
  public boolean isEmpty() {
    return f == l;
  }

  @Override
  public int size() {
    return N;
  }

  private void resize(int size){
    String[] tmp = new String[size];
    int i = l;
    for (int j = 0; j < N; j++)
      tmp[j] = s[i++%s.length];
    s = tmp;
    f = N;
    l = 0;
  }


  @Override
  public void print(){
    System.out.println(Arrays.toString(s));
    System.out.println(isEmpty());
    System.out.println(size());
    System.out.println(f+" : "+l);
  }
}
