package com.algo.part1.unionfind;

import java.util.Arrays;

/**
 * Created by hpadhyar on 9/13/2015.
 */
public class QuickFindUF implements UF{
  int[] id = null;
  public QuickFindUF(int N){
    id = new int[N];
    for (int i = 0; i < id.length; i++) { // N Array access
      id[i] = i;
    }
    System.out.println(Arrays.toString(id));
  }

  public void union(int p, int q){
    int pid = id[p];
    int qid = id[q];
    for (int i = 0; i < id.length; i++) // change all entries with id[p] to id[q] (at most 2N + 2 array accesses
      if (id[i] == pid) id[i] = qid;
  }

  public boolean connected(int p, int q){
    return  id[q] == id[p]; // 2 array access.
  }

  public int find(int p){
    return 1;
  }
  public int count(){
    return 1;
  }

  public int[] getId(){
    return id;
  }
}
