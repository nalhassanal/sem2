package week5.lab;

public class LinkedList <E>{
    Node <E> head;
    Node <E> tail;
    private int size;

    public LinkedList (){
        size = 0;
    }

    public void add(E e){
        Node<E> newNode = new Node<>(e); // Create a new for element e

        if (tail == null) {
            head = tail = newNode; // The new node is the only node in list
        }
        else {
            tail.next = newNode; // Link the new with the last node
            tail = tail.next; // tail now points to the last node
        }

        size++; // Increase size
    }

    public void removeElement(E e){
        int index = 0;
        Node<E> current = head;
        for (int i = 0; i < size; i++) {
            if (current.element.equals(e))
                index = i;
            current = current.next;
        }
        if (index == 0) {
            System.out.println("Element is not in list");
            return;
        }

        Node<E> previous = head;

        for (int i = 1; i < index; i++) {
            previous = previous.next;
        }

        current = previous.next;
        previous.next = current.next;
        size--;
    }

    public void printList(){
        if ( head == null ) {
            System.out.println("\n\nlist is empty");
            return;
        }
        Node<E> current = head;
        while (current!=null){
            System.out.print(current.element + ",");
            current = current.next;
        }
        System.out.println();
    }

    public int getSize(){
        return size;
    }

    public boolean contains(E e){
        Node<E> current = head;
        while (current!= null){
            if (current.element.equals(e))
                return true;
            current = current.next;
        }
        return false;
    }

    public void replace (E e, E newE){
        Node <E> current = head;
        while (current!=null){
            if(current.element.equals(e))
                current.element = newE;
            current = current.next;
        }
    }

}
