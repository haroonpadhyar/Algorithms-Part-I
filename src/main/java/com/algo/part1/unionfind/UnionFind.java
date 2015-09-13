package com.algo.part1.unionfind;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * Created by haroonpadhyar on 9/6/15.
 */
public class UnionFind {

  int[] id = null;
  public UnionFind(int N){
    id = new int[N];
    for (int i = 0; i < id.length; i++) {
      id[i] = i;
    }
    System.out.println(Arrays.toString(id));
  }

  public void union(int p, int q){
    id[q] = id[p];
  }

  public boolean connected(int p, int q){
    return  id[q] == id[p];
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

  public static void main(String[] args)
  {
    System.out.println("Enter total size.");
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    UnionFind uf = new UnionFind(N);
    boolean _do = true;
    do
    {
      System.out.println("Enter connection i.e. 'p,q' -1 to exit");
      String conn = scanner.next();
      try {
        if("-1".equals(conn)){
          _do = false;
        }else {
          String[] values = conn.split(",");
          int p = Integer.parseInt(values[0]);
          int q = Integer.parseInt(values[1]);

          if (!uf.connected(p, q))
          {
            uf.union(p, q);
            System.out.println(p + " connect " + q);
          }else {
            System.out.println(p + " already connect " + q);
          }
          System.out.println(Arrays.toString(uf.getId()));
        }
      }catch (Exception e){
        System.out.println("Wrong input'"+conn+"'. going to be crashed");
        _do = false;
      }

    }while(_do);
  }

}
