package week7.spectrum;

import java.util.*;

public class PriorityQueueDemo {
  public static void main(String[] args) {
    System.out.println("------------------------------");
      // basically when use the empty constructor
      // the smallest value has the highest priority
    PriorityQueue<String> queue1 = new PriorityQueue<>();
    // input order not important bcs comparable will do the job
    queue1.offer("Oklahoma");
    queue1.offer("Indiana");
    queue1.offer("Georgia");
    queue1.offer("Texas");
//    System.out.println(queue1.comparator());
//    System.out.println(queue1.iterator());
    System.out.println("Priority queue using Comparable:");

    while (queue1.size() > 0) {
        // since georgia is smallest so smallest has the highest priority
      System.out.print(queue1.poll() + " "); // removes one with the highest priority
    }

System.out.println("\n====================================");
//      since here have parameters 4 and Collections.reverseOrder()
//      this queue will be the highest value is the highest priority
    PriorityQueue<String> queue2
      = new PriorityQueue<>(4, Collections.reverseOrder());
    queue2.offer("Oklahoma");
    queue2.offer("Indiana");
    queue2.offer("Indiana");
    queue2.offer("Georgia");
    queue2.offer("Texas");
//        System.out.println(queue2.comparator());
//        System.out.println(queue2.iterator());
    System.out.println("\nPriority queue using Comparator:");
    while (queue2.size() > 0) {
        System.out.print(queue2.poll() + " ");
    }
    System.out.println();
  }
}

