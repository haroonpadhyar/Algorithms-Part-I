package com.algo.part1;

import com.algo.part1.unionfind.WeightedQuickUnionPathCompressionUF;
import com.algo.part1.unionfind.WeightedQuickUnionUF;
import com.algo.part1.unionfind.UF;

import java.util.Scanner;

/**
 * Created by haroonpadhyar on 9/6/15.
 */
public class UnionFind {

  public static void main(String[] args)
  {
    System.out.println("Enter total size.");
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    UF uf = null;
//    uf = new QuickFindUF(N);
//    uf = new QuickUnionUF(N);
//    uf = new WeightedQuickUnionUF(N);
    uf = new WeightedQuickUnionPathCompressionUF(N);
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
          uf.print();
        }
      }catch (Exception e){
        System.out.println("Wrong input'"+conn+"'. going to be crashed");
        _do = false;
      }

    }while(_do);
  }

}
