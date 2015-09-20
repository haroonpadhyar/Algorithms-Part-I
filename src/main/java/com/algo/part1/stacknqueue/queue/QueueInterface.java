package com.algo.part1.stacknqueue.queue;

/**
 * Created by haroonpadhyar on 9/20/15.
 */
public interface QueueInterface {
  void enqueue(String str);
  String dequeue();
  boolean isEmpty();
  int size();
  void print();
}
