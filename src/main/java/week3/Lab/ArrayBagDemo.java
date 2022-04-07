package week3.Lab;
/*
test the core methods add,
getCurrentSize() and toArray
 */
/*
the three methods that you
implemented in Question 2 to 4
(i.e. union, intersection and difference)
 */
public class ArrayBagDemo {
    public static void main(String[] args) {
        String [] contentsOfBag1 = {"A","A","B","A","C","A"};
        String [] contentsOfBag2 = {"A","B","A","C","B","C","D","another string"};

        ArrayBag<String> bag1 = new ArrayBag<>();
        ArrayBag<String> bag2 = new ArrayBag<>();

        System.out.println("Bag 1: ");
        testAdd(bag1, contentsOfBag1);
        displayBag(bag1);
        System.out.println("\nBag 2: ");
        testAdd(bag2, contentsOfBag2);
        displayBag(bag2);
        System.out.println("\nBag 3: ");
        displayBag(bag1.union(bag2));
        System.out.println("\nBag 4: ");
        displayBag(bag1.intersection(bag2));
        System.out.println("\nBag 5: ");
        displayBag(bag1.difference(bag2));
    }

    private static void testAdd(BagInterface<String> aBag, String[] content){
        System.out.print("Adding ");
        for ( String element : content)
            System.out.print(element + " ");
        for (int i=0;i<content.length;i++)
            aBag.add(content[i]);
        System.out.println();
    }

    private static void displayBag(BagInterface<String> Bag){
        System.out.println("This bag contains " +Bag.getCurrentSize() + " string(s), as follows: ");
        Object [] arr = Bag.toArray();
        for ( Object element : arr)
            System.out.print(element + ", ");
        System.out.println();
    }
}
