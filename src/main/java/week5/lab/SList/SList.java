package week5.lab.SList;

public class SList <E>{
    SNode <E> head;
    SNode <E> tail;
    int size;

    public SList (){
        size = 0;
    }

    public void appendFirst (E e){
        SNode <E> newNode = new SNode<>(e);
        newNode.next = head;
        head = newNode;
        size++;

        if ( tail == null )
            tail = head;
    }

    /**
     * Append a new element at the end of the list.
     * @param e is the element to be added
     */
    public void appendEnd (E e){
        SNode <E> newNode = new SNode<>(e);
        if (tail == null)
            tail = head = newNode;
        else {
            tail.next = newNode;
            tail = newNode;
            size++;
        }
    }

    /**
     * Eliminate the first element in the list
     * @return the element that was removed
     */
    public E removeInitial () {
        if (size == 0 || head == null)
            return null;

        // store the current head node to a toBeRemoved node
        SNode <E> toBeRemoved = head;
        // replace the next node to the head
        head = head.next;
        size--; // decrease the size of the lise
        if (head == null) // if there was no next node beside the head
            tail = null; // tail is also null
        return toBeRemoved.element;
    }

    /**
     * Search for an element and returns true if the list contains
     * the searched element
     * @param e element to be searched
     * @return true if list contains parameter
     */
    public boolean contains (E e){
        SNode <E> current = head; // store current head value
        // stops loop when current is empty (end of the list)
        while ( current != null){
            // if the current node's element equal to the parameter
            if ( current.element.equals(e))
                return true;
            // update the current node for next iteration
            current = current.next;
        }
        return false;
    }

    /**
     * Empty all elements and returns a statement that reports that
     * the list is empty
     */
    public void clear(){
        head = tail = null;
        size = 0;
    }

    /**
     * Display all values from list in successive order.
     */
    public void display (){
        if ( head == null ) {
            System.out.println("\n\nlist is empty");
            return;
        }
        SNode<E> current = head;
        while (current != null){
            System.out.print(current.element + " >>");
            current = current.next;
        }
        System.out.println();
    }
}
