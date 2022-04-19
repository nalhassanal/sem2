package week5.lab.DList;

import java.util.NoSuchElementException;

public class DoublyLinkedList <E>{
    private Node<E> head;
    private Node<E> tail;
    private int size;

    public DoublyLinkedList(){
        size = 0;
        head = null;
        tail = null;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public int getSize() {
        return size;
    }

    public void addFirst(E element){
        Node<E> toBeAdded = new Node<>(element, head, null);
        if (head != null){
            head.prev = toBeAdded;
        }
        head = toBeAdded;
        if (tail == null){
            tail = toBeAdded;
        }
        size++;
        System.out.println("Adding : " + element);
    }

    public void addLast (E element){
        Node <E> toBeAdded = new Node<>(element, null, tail);
        if (tail != null){
            tail.next = toBeAdded;
        }
        tail = toBeAdded;
        if (head == null){
            head = toBeAdded;
        }
        size++;
        System.out.println("Adding : " + element);
    }

    public void add(int index, E element){
        if (index < 0 || index > size)
            throw new IndexOutOfBoundsException();
        if (index == 0)
            addFirst(element);
        else if (index == size)
            addLast(element);
        else{
            Node<E> current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            Node <E> toBeAdded = new Node<>(element, current, current.prev);
            current.prev.next = toBeAdded;
            current.prev = toBeAdded;
            size++;
        }
    }

    public void iterateForward(){
        System.out.println("Iterating forward...");
        Node<E> current = head;
        while (current != null){
            System.out.print(current.element + ">>");
            current = current.next;
        }
        System.out.println();
    }

    public void iterateBackward(){
        System.out.println("Iterating backward...");
        Node<E> current = tail;
        while (current != null){
            System.out.print(current.element + "<<");
            current = current.prev;
        }
        System.out.println();
    }

    public E removeFirst(){
        if (size == 0)
            throw new NoSuchElementException();

        Node<E> temp = head;
        head = head.next;
        head.prev = null;
        size--;
        System.out.println("Deleted : " + temp.element);
        return temp.element;
    }

    public E removeLast(){
        if (size == 0)
            throw new NoSuchElementException();

        Node<E> temp = tail;
        tail = tail.prev;
        tail.next = null;
        size--;
        System.out.println("Deleted : " + temp.element);
        return temp.element;
    }

    public E remove (int index){
        E element = null;
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException();
        if (index == 0)
            element = removeFirst();
        else if (index == size - 1)
            element = removeLast();
        else {
            Node<E> current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            element = current.element;
            current.next.prev = current.prev;
            current.prev.next = current.next;
            current.next = null;
            current.prev = null;
            size--;
        }
        return element;
    }

    public void clear(){
        Node<E> current = head;
        while (head != null){
            current = head.next;
            head.prev = head.next = null;
            head = current;
        }
        current = null;
        tail.prev = tail.next = null;
        System.out.println("Successfully cleared " +size+" node (s)");
        size = 0;
    }
}
