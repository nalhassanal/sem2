package week4.Lab;

public class MyLinkedList <E> {
    Node <E> head;
    Node <E> tail;
    int size;

    public MyLinkedList() {
        size = 0;
    }

    public void addFirst (E e){
        Node <E> newNode = new Node<>(e);
        // this is to assign a node as head
        newNode.next = head;
        head = newNode;

        size++;

        if ( tail == null)
            tail = head;
    }

    public void addLast (E e){
        Node <E> newNode = new Node<>(e);
        if ( tail == null)
            tail = head = newNode;
        else{
            // this to assign a node as tail
            tail.next = newNode;
            tail = newNode;

            size++;
        }
    }

    public void add (int index, E e){
        Node<E> newNode = new Node<>(e);
        if ( index == 0)
            addFirst(e);
        else if ( index >= size)
            addLast(e);
        else {
            // to assign current node as head
            Node<E> current = head;
            // traverse list to find index required
            // until before required index
            for (int i = 0; i < index - 1; i++)
                current = current.next;

            // add a new node in between current node and required index
            // and swap
            Node<E> temp = current.next;
            current.next = newNode;
            newNode.next = temp;

            size++;
        }
    }

    public E removeFirst(){
        if (size == 0 || head == null)
            return null;

        Node <E> toBeRemoved = head;
        // new head will be equal to the next node of old head
        head = head.next;
        size--;
        if (head == null)
            tail = null;
        return toBeRemoved.element;
    }

    public E removeLast(){
        if (size == 0 || head == null)
            return null;
        else if (size == 1){
            Node<E> toBeRemoved = head;
            head = tail = null;
            size = 0;
            return toBeRemoved.element;
        }
        else{
            Node<E> current = head;//Copy the head element to current node

            // last node is the target index
            // traverse until end of list
            for (int i = 0; i < size - 2 ; i++)
                current = current.next;

            Node<E> toBeRemoved = tail; // Copy the tail element to temporary node before deletion
            tail = current;// Assign tail node become current node
            current.next = null;// Reset the next for the tail as null
            size--; // Decrease the size of list by 1
            return toBeRemoved.element; //Return temp.element to know what we had deleted
        }
    }

    public E remove(int index){
        if (index < 0 || index >= size) //If the index of the node is not in the range of the list
            return null;
        else if (index == 0)
            return removeFirst();
        else if (index == size - 1)
            return removeLast();
        else{
            Node<E> previous = head; //Set the head to be previous

            for (int i = 1; i < index ; i++)
                previous = previous.next;

            Node<E> current = previous.next;
            previous.next = current.next; //Set new point to from previous.next to current.next
               size--;
            return current.element;
        }
    }

    /** Return nothing, but adds an element to the list */
    public void add (E e){
        addLast(e);
    }

    /** Return true if list contains the element e */
    public boolean contains (E e){
        // for looping usage or current pos
        Node <E> current = head;
        while (current != null){
            if (current.element.equals(e)){
                return true;
            }
            current = current.next;
        }
        return false;
    }

    /** Return element at the specified index */
    public E get(int index){
        if (index < 0 || index >= size)
            return null; // invalid index
        if ( index == 0)
            return head.element;
        else{
            Node <E> current = head;
            for ( int i = 0; i < index ; i++){
                current = current.next;
            }
            return current.element;
        }
    }

    /** Return the value of the first item */
    public E getFirst(){
        if ( head == null)
            return null;
        return head.element;
    }

    /** Return the value of the last item */
    public E getLast(){
        if ( tail == null)
            return null;
        return tail.element;
    }

    /** Return the index of the head matching element in this list.
     * Return -1 of no match */
    public int indexOf(E e){
        Node<E> current = head;
        for (int i = 0; i < size; i++) {
            if (current.element.equals(e))
                return i;
            current = current.next;
        }
        return -1;
    }

    /**
     * Return the index of the last matching element in this list.
     * Return -1 of no match */
    public int lastIndexOf(E e){
        Node<E> current = head;
        int index = -1 ;
        for (int i = 0; i < size; i++) {
            if (current.element.equals(e)) {
                index = i;
            }
            current = current.next;
        }
        return index;
    }

    /** Replace the element at the
     *  specified position in this list with the specified element */
    public E set(int index, E e){
        if (index < 0 || index >= size)
            return null; // invalid index
        Node<E> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        E toBeReplaced = current.element;
        current.element = e; // changing of elements
        return toBeReplaced;
    }

    /** Clear the list */
    public void clear(){
        head = tail = null;
        size = 0;
    }

    /** Print all the element in the list */
    public void print(){
        Node <E> current = head;
        while (current != null){
            System.out.print(current.element + "-->");
            current = current.next;
        }
        System.out.println();
    }

    /** Print all elements in reverse order */
    public void reverse(){
        Node<E> current = head;
        Object [] arr = new Object[size + 1];
        int i = 0;
        while (current != null){
            arr[i++] = current.element;
            current = current.next;
        }
        for (int j = arr.length - 1;j >= 0; j--) {
            System.out.print("<--" + arr[j]);
        }
        System.out.println();
    }

    public E getMiddleValue() {
        Node<E> current = head;
        for (int i = 0; i < size / 2; i++) {
            current = current.next;
        }
        return current.element;
    }
}
