package week9.labtest;

import java.util.LinkedList;

public class Queue<E>{
    private LinkedList<E> list = new LinkedList<>();

    public Queue(){}

    public Queue(E[] e){
        for (E element: e)
            list.add(element);
    }

    public void enqueue(E e){
        list.addLast(e);
    }

    public E dequeue(){
        if (list.isEmpty()) return null;
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

    public void displayQueue(){
        System.out.println();
        if (isEmpty()){
            System.out.println("Empty Queue");
        }
        for (int i = 0; i < getSize(); i++) {
            System.out.print(list.get(i) + " --> ");
        }
    }
}