package com.algo.part1.generic;

import java.util.Iterator;
import java.util.Scanner;

import org.junit.Test;

/**
 * Created by haroonpadhyar on 9/20/15.
 */
public class StackOfGenericTest {

  @Test
  public void testIteratorArrayStack(){
    StackInterface<String> stackGeneric = null;
//    stackGeneric = new ArrayStackGeneric<String>(10);
    stackGeneric = new LinkedStackGeneric<String>();
    stackGeneric.push("A");
    stackGeneric.push("B");
    stackGeneric.push("C");
    stackGeneric.push("D");
    for (String s : stackGeneric) {
      System.out.println(s);
    }
  }

  public static void main(String[] args) {

    System.out.println("Enter total size.");
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    StackInterface<String> stack = null;
//    stack = new LinkedStackGeneric<String>();
    stack = new ArrayStackGeneric<String>(N);
    System.out.println("Empty: "+stack.isEmpty());
    System.out.println("Size: "+stack.size());

    boolean _do = true;
    do
    {
      System.out.println("Enter value operation-val a-> add, d->delete i.e. 'a-val' -1 to exit");
      String conn = scanner.next();
      try {
        if("-1".equals(conn)){
          _do = false;
        }else {
          String[] values = conn.split("-");
          String o = values[0];

          if ("a".equals(o))
          {
            String v = values[1];
            stack.push(v);
          }else if ("d".equals(o)){
            System.out.println(stack.pop());
          }
          stack.print();
        }
      }catch (Exception e){
        e.printStackTrace();
        System.out.println("Wrong input'"+conn+"'. going to be crashed");
        _do = false;
      }

    }while(_do);

  }
}
