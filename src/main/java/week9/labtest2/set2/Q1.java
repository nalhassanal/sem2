package week9.labtest2.set2;

public class Q1 {
    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue();
        System.out.println("10 packets arrived");
        pq.enqueue(new packet("Video", 1));
        pq.enqueue(new packet("Voice", 2));
        pq.enqueue(new packet("Data", 3));
        pq.enqueue(new packet("Data", 4));
        pq.enqueue(new packet("Voice", 5));
        pq.enqueue(new packet("Video", 6));
        pq.enqueue(new packet("Voice", 7));
        pq.enqueue(new packet("Voice", 8));
        pq.enqueue(new packet("Data", 9));
        pq.enqueue(new packet("Video", 10));
        System.out.println("Processing 10 network packets");
        while (!pq.isEmpty()){
            System.out.println(pq.dequeue());
        }
    }
}
