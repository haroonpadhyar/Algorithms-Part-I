package com.algo.part1.unionfind;

/**
 * Created by hpadhyar on 9/13/2015.
 */
public interface UF {

 void union(int p, int q);
 boolean connected(int p, int q);
 int find(int p);
 int count();
 void print();
}
