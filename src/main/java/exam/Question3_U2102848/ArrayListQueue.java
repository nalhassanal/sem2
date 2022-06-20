package exam.Question3;

import java.util.ArrayList;

public class ArrayListQueue <E>{
    private int size = 10;
    private int front = 0;
    private int end = 0;
    private ArrayList<E> list = new ArrayList<>(size);

    public boolean enqueue (E o){
        boolean success = false;
        if (end < size){
            success = list.add(o);
            end = end + 1;
        }
        return success;
    }

    public E dequeue(){
        E toReturn =  list.get(front);
        front++;
        return toReturn;
    }

    public String queueToString(){
        String toReturn = "";
        for (int i = front; i < list.size(); i++){
            toReturn += list.get(i) + " ";
        }

        return toReturn;
    }

    public String allToString(){
        return "All : " + list.toString();
    }

    public static void main(String[] args) {
        ArrayListQueue<String> test = new ArrayListQueue<>();
        test.enqueue("Maya");
        test.enqueue("Edgar");
        test.enqueue("Felix");
        test.enqueue("Marzia");
        test.enqueue("Maya");
        test.enqueue("Edgar");
        test.enqueue("Felix");
        test.enqueue("Marzia");
        test.enqueue("Maya");
        test.enqueue("Edgar");
        test.enqueue("Felix");
        test.enqueue("Marzia");
        System.out.println(test.end);

        System.out.println(test.queueToString());

        test.dequeue();

        System.out.println(test.queueToString());
    }
}
