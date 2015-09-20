package com.algo.part1.stacknqueue.stack;

import java.util.NoSuchElementException;

/**
 * Created by haroonpadhyar on 9/20/15.
 */
public class LinkedStackOfString implements StackInterface{

  private StackNode first;
  private int N;
  private class StackNode{
    String value;
    StackNode next;
  }

  @Override
  public void push(String str) {
    StackNode node = new StackNode();
    node.value = str;
    node.next = first;
    first = node;
    N++;
  }

  @Override
  public String pop() {
    if(null == first)
      throw new NoSuchElementException();
    StackNode old = first;
    first = old.next;
    N--;
    return old.value;
  }

  @Override
  public boolean isEmpty() {
    return first == null;
  }

  @Override
  public int size() {
    return N;
  }

  @Override
  public void print(){

  }
}
