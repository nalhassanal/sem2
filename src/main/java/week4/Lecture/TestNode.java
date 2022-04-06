package week4.Lecture;

import java.util.LinkedList;

public class TestNode {
    public static void main(String[] args) {
        Node<String> node1 = new Node<>("abc");
        Node<String> head = null;
        Node<String> tail = null;
        head = node1;
        tail = head;
        tail.next = new Node<>("def");
        tail = tail.next;
        tail.next = new Node<>("ghi");
        tail = tail.next;

        Node<String > current = head;
        while (current != null){
            System.out.println(current.element);
            current = current.next;
        }
    }
}
