package week7.tutorial;

import java.util.*;
import week7.spectrum.GenericQueue;
public class T7Q3 {
    
    public static void main(String[] args) {
//        Queue<Integer> q2 = new Queue<Integer>();
        GenericQueue<Integer> q = new GenericQueue<>();
        Scanner keyIn = new Scanner(System.in);
        for (int i = 1; i <= 5; i++){
            if (keyIn.nextBoolean())
                System.out.print(i + " ");
            else
                q.enqueue(i);
        }
        while (!q.isEmpty()){
            System.out.print(q.dequeue() + " ");
        }
        System.out.println();
    }
}
