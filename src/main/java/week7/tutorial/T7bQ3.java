package week7.tutorial;
import java.util.*;
public class T7bQ3 {
    public static void main(String[] args) {
        PriorityQueue<String> pQueue = new PriorityQueue<>();
        pQueue.offer("C++");
        pQueue.offer("Python");
        pQueue.offer("Java");
        pQueue.offer("Fortran");

        System.out.println("(a) peek() gives us: " + pQueue.peek());

        System.out.println("(B) The queue elements: ");
        Iterator<String> itr = pQueue.iterator();
        while (itr.hasNext())
            System.out.print(itr.next() + " ");

        System.out.println();
        pQueue.poll();
        System.out.println("(c) After poll(): ");
        Iterator<String> itr2 = pQueue.iterator();
        while (itr2.hasNext())
            System.out.print(itr2.next() + " ");
        System.out.println();
        pQueue.remove("Java");
        System.out.println("(D) After remove(): ");
        Iterator<String> itr3 = pQueue.iterator();
        while (itr3.hasNext())
            System.out.print(itr3.next() + " ");
        System.out.println();
        boolean b = pQueue.contains("Ruby");
        System.out.println("(e) Priority queue contains Ruby or not?: " + b);

        Object[] arr = pQueue.toArray();
        System.out.println("(f) Value in array: ");
        for(int i = 0; i < arr.length; i++)
            System.out.println("Value: " + arr[i].toString());

    }
}
