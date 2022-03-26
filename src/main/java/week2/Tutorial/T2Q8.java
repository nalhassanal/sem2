package week2.Tutorial;

import java.util.ArrayList;

/*
8.	Assuming that two new object are created as follows:
        a.	ArrayList <Integer> numOfCars = new ArrayList<>();
        b.	ArrayList <Double> milesPerHour = new ArrayList<>();
    Using the wildcard, implement a generic method that displays the list
 */
public class T2Q8 {
    public static void main(String[] args) {
        ArrayList <Integer> numOfCars = new ArrayList<>();
        ArrayList <Double> milesPerHour = new ArrayList<>();
        displayList(numOfCars);
        displayList(milesPerHour);
        System.out.println();
        System.out.println(numOfCars.toString());
        System.out.println(milesPerHour.toString());
    }
    public static void displayList (ArrayList<?> list){
        for ( int i = 0 ; i < list.size(); i++)
            System.out.print(list.get(i) + " ");
        System.out.println();
    }
}
