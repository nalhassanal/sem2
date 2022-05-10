package week7.lab;

public class testMyQueue {
    public static void main(String[] args) {
        String[] initial = {"Durian" , "Blueberry"};
        MyQueue<String> fruitQ = new MyQueue<>(initial);
        fruitQ.enqueue("Apple");
        fruitQ.enqueue("Oranges");
        fruitQ.enqueue("Grapes");
        fruitQ.enqueue("Cherry");
        System.out.println(fruitQ);
        System.out.println("The top item is: " + fruitQ.peek());
        System.out.println("The size of the queue is:" + fruitQ.getSize());
        System.out.println("Removed: " + fruitQ.dequeue());
        System.out.println("Item in index 2 is: " + fruitQ.getElement(2));
        System.out.println("Does queue contain Cherry? " + fruitQ.contains("Cherry"));
        System.out.println("Does queue contain Durian? " + fruitQ.contains("Durian"));
        while(!fruitQ.isEmpty() || fruitQ.getSize() > 0) {
            if (fruitQ.getSize() <= 1) // when it gets to the last element
                System.out.print(fruitQ.dequeue() + "."); // prints element and "."
            else
                System.out.print(fruitQ.dequeue() + "->");
        }
    }
}
