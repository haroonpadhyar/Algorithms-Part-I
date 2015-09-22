package com.algo.part1.generic;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Created by haroonpadhyar on 9/21/15.
 */
public class LinkedStackGeneric<T> implements StackInterface<T>{

  private Node first;
  private int N;
  private class Node{
    T val;
    Node next;
  }

  @Override
  public void push(T val) {
    Node node = new Node();
    node.val = val;
    node.next = first;
    first = node;
    N++;
  }

  @Override
  public T pop() {
    if(null == first)
      throw new NoSuchElementException();
    Node old = first;
    first = old.next;
    N--;
    return old.val;
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
  public void print() {

  }

  @Override
  public Iterator<T> iterator() {
    return new StackIterator();
  }

  private class StackIterator implements Iterator<T>{
    private Node f = first;
    @Override
    public boolean hasNext() {
      return f != null;
    }

    @Override
    public T next() {
      T val = f.val;
      f = f.next;
      return val;
    }

    @Override
    public void remove() {
      throw new UnsupportedOperationException();
    }
  }
}
