package com.algo.part1.stacknqueue.queue;

import java.util.Arrays;
import java.util.NoSuchElementException;

/**
 * Created by haroonpadhyar on 9/20/15.
 */
public class ArrayQueueOfString  implements QueueInterface{
  String[] s;
  int f,l,N;

  public ArrayQueueOfString(int size){
    s = new String[size];
  }

  @Override
  public void enqueue(String str) {
    if(N == s.length)
      throw new OutOfMemoryError();
    s[f++%s.length] = str;
    N++;
  }

  @Override
  public String dequeue() {
    if(isEmpty())
      throw new NoSuchElementException();

    String val = s[l%s.length];
    s[l++%s.length] = null;
    N--;
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

  @Override
  public void print(){
    System.out.println(Arrays.toString(s));
    System.out.println(isEmpty());
    System.out.println(size());
    System.out.println(f+" : "+l);
  }
}
