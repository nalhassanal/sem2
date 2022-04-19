package week5.lab.DList;

public class testDoublyLinkedList {
    public static void main(String[] args) {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
        list.addFirst(1);
        list.addLast(10);
        list.addLast(100);
        list.add(2,2);
        list.remove(3);
        System.out.println();

        list.iterateForward();
        list.iterateBackward();
        System.out.println("Size of current Doubly Linked List :"+list.getSize());
        list.clear();

        System.out.println();
        System.out.println("Size of current Doubly Linked List :"+list.getSize());
    }
}
