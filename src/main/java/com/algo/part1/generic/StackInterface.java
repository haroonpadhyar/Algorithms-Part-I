package com.algo.part1.generic;

/**
 * Created by haroonpadhyar on 9/20/15.
 */
public interface StackInterface<T> {
  void push(T val);
  T pop();
  boolean isEmpty();
  int size();
  void print();
}
