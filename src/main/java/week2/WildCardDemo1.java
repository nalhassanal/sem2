package week2;

import java.util.ArrayList;

public class WildCardDemo1 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(3);
        list1.add(6);
        list1.add(9);
        display(list1);
        System.out.println();

        ArrayList<Double> list2 = new ArrayList<>();
        list2.add(3.0);
        list2.add(6.0);
        list2.add(9.0);
        display(list2);
        System.out.println();
    }

    // if ArrayList<Number> list
    // will cause compile error
    // will also work if makes it the method with a generic method
    // alternative to generic methods is using wildcard
    // wildcard is the "?"
    // wildcard means it is something replaceable with something else
    public static void display(ArrayList<?> list){
        for(int i = 0; i<=2;i++)
            if (list.get(i).equals(6.0))
                System.out.println("Yes");
            else
                System.out.println("No");
    }
}
