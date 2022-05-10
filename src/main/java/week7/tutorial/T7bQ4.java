package week7.tutorial;
import java.util.*;
public class T7bQ4 {
    public static void main(String[] args) {
        PriorityQueueComparator pqc = new PriorityQueueComparator();
        PriorityQueue<String> pq = new PriorityQueue<>(5, pqc);
        pq.add("Jason");
        pq.add("Ali");
        pq.add("Muhammad");
        for(String s : pq){
            System.out.println(s);
        }
    }
}
class PriorityQueueComparator implements Comparator<String>{
    public int compare(String s1, String s2){
        if (s1.length() < s2.length()){
            return -1;
        }
        else if (s1.length() > s2.length()){
            return 1;
        }
        return 0;
    }
}