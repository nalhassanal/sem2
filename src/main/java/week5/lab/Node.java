package week5.lab;

public class Node <E>{
    E element;
    Node <E> next;

    public Node (E e){
        element = e;
        next = null;
    }
}