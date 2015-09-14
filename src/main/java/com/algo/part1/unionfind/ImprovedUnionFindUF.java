package com.algo.part1.unionfind;

import java.util.Arrays;

/**
 * Created by hpadhyar on 9/14/2015.
 */
public class ImprovedUnionFindUF  implements UF{

  int[] id;
  int[] sz;
  public ImprovedUnionFindUF(int N){
    id = new int[N];
    sz = new int[N];
    for (int i = 0; i < id.length; i++) { // N Array access
      id[i] = i;
    }
    for (int i = 0; i < sz.length; i++) { // N Array access
      sz[i] = 1;
    }
    System.out.println(Arrays.toString(id));
    System.out.println(Arrays.toString(sz));
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
    int szP = sz[pRoot];
    int szQ = sz[qRoot];
    if(szP < szQ){
      id[pRoot] = qRoot;
      sz[qRoot] = szP + szQ;
    }else {
      id[qRoot] = pRoot;
      sz[pRoot] = szP + szQ;
    }
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
  public void print() {
    System.out.println(Arrays.toString(id));
    System.out.println(Arrays.toString(sz));
  }
}
