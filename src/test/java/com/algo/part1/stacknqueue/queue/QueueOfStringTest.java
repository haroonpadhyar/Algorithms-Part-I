package com.algo.part1.stacknqueue.queue;

import java.util.Scanner;

/**
 * Created by haroonpadhyar on 9/20/15.
 */
public class QueueOfStringTest {
  public static void main(String[] args) {


    System.out.println("Enter total size.");
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    QueueInterface queue = null;
//    queue = new LinkedQueueOfString();
//    queue = new ArrayQueueOfString(N);
    queue = new ResizeArrayQueueOfString(N);

    System.out.println("Empty: "+queue.isEmpty());
    System.out.println("Size: "+queue.size());

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
            queue.enqueue(v);
          }else if ("d".equals(o)){
            queue.dequeue();
          }
          queue.print();
        }
      }catch (Exception e){
        e.printStackTrace();
        System.out.println("Wrong input'"+conn+"'. going to be crashed");
        _do = false;
      }

    }while(_do);
  }
}
