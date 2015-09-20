package com.algo.part1.stacknqueue.queue;

import java.util.NoSuchElementException;

/**
 * Created by haroonpadhyar on 9/20/15.
 */
public class LinkedQueueOfString implements QueueInterface{

  private Node first, last;
  private int N;
  private class Node{
    String val;
    Node next;
  }

  @Override
  public void enqueue(String str) {
    Node node = new Node();
    node.val = str;
    if(isEmpty())
      first = last = node;
    else {
      last.next = node;
      last = node;
    }
    N++;
  }

  @Override
  public String dequeue() {
    if(null == first)
      throw new NoSuchElementException();
    String val = first.val;
    first = first.next;
    if (isEmpty())
      last = null;
    N--;
    return val;
  }

  @Override
  public boolean isEmpty() {
    return null == first;
  }

  @Override
  public int size() {
    return N;
  }

  @Override
  public void print(){

  }
}
