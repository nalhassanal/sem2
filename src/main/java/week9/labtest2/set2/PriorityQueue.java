package week9.labtest2.set2;
import java.util.LinkedList;
public class PriorityQueue<E extends packet>{
    private LinkedList<E> ls;
    private int size;

    public PriorityQueue(E[] e){
        ls = new LinkedList<>();
        for (E element: e) {
            ls.add(element);
        }
        size = ls.size();
    }

    public PriorityQueue() {
        ls = new LinkedList<>();
        size = 0;
    }

    public void enqueue(E e){
        // if size is 0, add first
        if (size == 0){
            ls.add(e);
            size++;
        }
        else {
            // goes through the list
            for (int i = 0; i < size; i++) {
                // if the element of the list is
                // lesser priority add after the index
                if (ls.get(i).compareTo(e) < 0) {
                    ls.add(i, e);
                    size++;
                    return;
                }
            }
            // else just add last
            ls.add(e);
            size++;
        }
    }

    public E dequeue(){
        if (size == 0)
            return null;
        size--;
        // return the first element
        return ls.removeFirst();
    }

    public E getElement (int index){
        if (size == 0 || index<0 || index>= size)
            return null;
        return ls.get(index);
    }

    public E peek(){
        if (size == 0)
            return null;
        return ls.getFirst();
    }

    public int getSize(){
        return size;
    }

    public boolean contains(E e){
        if (size == 0)
            return false;
        return ls.contains(e);
    }

    public boolean isEmpty(){
        return size==0;
    }

    public String toString(){
        return "Queue: " + ls.toString();
    }

    public void displayQueue(){
        while (!isEmpty()){
            System.out.print(dequeue() + " --> ");
        }
        System.out.println();
    }
}
