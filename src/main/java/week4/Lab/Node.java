package week4.Lab;

public class Node <E>{
    E element;
    Node<E> next;

    public Node (){

    }

    public Node (E element) {
        this.element = element;
        next = null;
    }
}
