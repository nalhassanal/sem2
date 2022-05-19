package week9;

import java.util.Collections;
import java.util.PriorityQueue;

public class testStackQueue {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("jj");
        stack.push("tt");
        stack.push("ff");
        stack.push("hh");
        System.out.println(stack.peek());

        Queue<String> q = new Queue<>();
        q.enqueue("jj");
        q.enqueue("ii");
        q.enqueue("rr");
        q.enqueue("gg");
        System.out.println(q.peek());

        PriorityQueue<pQueueEX> pq = new PriorityQueue<>(Collections.reverseOrder());
        pq.add(new pQueueEX("bb", 1));
        pq.add(new pQueueEX("aa", 3));
        pq.add(new pQueueEX("cc", 2));

        while(!pq.isEmpty()){
            System.out.println(pq.poll());
        }
    }
}
