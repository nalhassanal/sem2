package week2.Lab;
/*
a) Modify the following program to become a generic class called StorePairGeneric
b) Override the Object equals() method in the StorePair class to compare
   the first values of two objects for equality.
c) Have the StorePair class implement Comparable interface.
   Override the compareTo() method to compare the first values of two objects.
d) Create a test program that creates object of the StorePair generic class
   called a, b and c. Set the first and second values of a, b ,c as (6,4), (2,2), (6,3)
e) Invoke the compareTo() and equals() methods that compares the
   three objects created in (d) in the test program
 */
public class Test_L2Q1 {
    public static void main(String[] args) {
        StorePairGeneric<Integer> a = new StorePairGeneric<>(6, 4);
        StorePairGeneric<Integer> b = new StorePairGeneric<>(2, 2);
        StorePairGeneric<Integer> c = new StorePairGeneric<>(6, 3);
        System.out.println(a.equals(b));
        System.out.println(a.equals(c));
        System.out.println(c.equals(b));
        System.out.println(a.compareTo(b));
        System.out.println(a.compareTo(c));
        System.out.println(b.compareTo(c));
    }
}
