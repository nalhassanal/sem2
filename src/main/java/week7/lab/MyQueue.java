package week7.lab;
import java.util.LinkedList;
public class MyQueue <E>{
    private LinkedList<E> list = new LinkedList<>();

    public MyQueue(){}

    public MyQueue(E[] e){
        for (E element: e)
            list.add(element);
    }

    public void enqueue(E e){
        list.addLast(e);
    }

    public E dequeue(){
        return list.removeFirst();
    }

    public E getElement(int i){
        return list.get(i);
    }

    public E peek(){
        return list.get(0);
    }

    public int getSize(){
        return list.size();
    }

    public boolean contains(E e){
        return list.contains(e);
    }

    public boolean isEmpty(){
        return list.isEmpty();
    }

    public String toString(){
        return "Queue " + list.toString();
    }
}
