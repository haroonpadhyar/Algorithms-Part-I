package com.algo.part1.unionfind;

import java.util.Arrays;

/**
 * Created by hpadhyar on 9/13/2015.
 */
public class QuickUnionUF implements UF{
  int[] id = null;

  public QuickUnionUF(int N) {
    id = new int[N];
    for (int i = 0; i < id.length; i++) { // N Array access
      id[i] = i;
    }
    System.out.println(Arrays.toString(id));
  }

  private int root(int i){
    while(!(i == id[i]))
      i = id[i];
    return i;
  }

  @Override
  public void union(int p, int q) {
    int pRoot = root(p);
    int qRoot = root(q);
    id[pRoot] = qRoot;
  }

  @Override
  public boolean connected(int p, int q) {
    return root(p) == root(q);
  }

  @Override
  public int find(int p) {
    return 0;
  }

  @Override
  public int count() {
    return 0;
  }

  @Override
  public int[] getId() {
    return id;
  }
}
