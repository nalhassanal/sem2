package week3.Lab;
/*
Write an ArrayBag class that implement the BagInterface, as shown in the UML diagram
below. Set the DEFAULT_CAPACITY to 25.
_________________________________________
|               ArrayBag                |
|_______________________________________|
|- bag: T[]                             |
|- DEFAULT_CAPACITY: integer            |
|- numberOfEntries: integer             |
|_______________________________________|
|+ getCurrentSize(): integer            |
|+ isFull(): boolean                    |
|+ isEmpty(): boolean                   |
|+ add(newEntry: T): boolean            |
|+ remove(): T                          |
|+ clear(): void                        |
|+ getFrequencyOf(anEntry: T): integer  |
|+ contains(anEntry: T): boolean        |
|+ toArray(): T[]                       |
|_______________________________________|
 */
import java.util.Random;
public class ArrayBag <T> implements BagInterface<T>{

    private T [] bag;
    private int DEFAULT_CAPACITY;
    private int numberOfEntries;

    public ArrayBag(){
        DEFAULT_CAPACITY = 25;
        bag =(T[]) new Object[DEFAULT_CAPACITY];
        numberOfEntries = 0;
    }


    @Override
    public int getCurrentSize() {
        return numberOfEntries;
    }

    @Override
    public boolean isFull() {
        return numberOfEntries == DEFAULT_CAPACITY;
    }

    @Override
    public boolean isEmpty() {
        return numberOfEntries == 0;
    }

    @Override
    public boolean add(T newEntry) {
        boolean result = true;
        if ( isFull() )
            result = false;
        else{
            bag[numberOfEntries] = newEntry;
            numberOfEntries++;
        }
        return result;
    }

    @Override
    public T remove() {
        Random rand = new Random();
        T result = null;
        if (isEmpty()) // if bag is empty returns null
            return result;
        else{
            if (isFull()){ // if bag is full remove the last index
                bag [numberOfEntries] = null;
                result = bag [numberOfEntries];
            }
            // else remove at a random index
            int index = rand.nextInt(numberOfEntries);
            bag [index] = null;

            for ( int i = index ; i < numberOfEntries ; i++)
                // fixing the index
                bag[i] = bag[i+1];

            result = bag[index];
        }
        return result;
    }

    @Override
    public boolean remove(T anEntry) {
        boolean result = false;
        for ( int i = 0; i < bag.length; i++){
            if (bag [i] == anEntry){
                // removes the element
                bag[i] = null;
                for ( int j = i ; j < numberOfEntries ; j++) {
                    // fixing the index
                    bag[j] = bag[j + 1];
                    result = true;
                }
                numberOfEntries--;
            }
        }
        return result;
    }

    @Override
    public void clear() {
        for (T element : bag)
            element = null;

        for ( int i = 0; i < numberOfEntries ; i++)
            bag[i] = null;
    }

    @Override
    public int getFrequencyOf(T anEntry) {
        int frequency = 0;
        for ( int i = 0; i< numberOfEntries ; i++){
            if ( bag[i].equals(anEntry) )
                frequency++; // end if
        }// end for
        return frequency;
    }// end getFrequencyOf

    @Override
    public boolean contains(T anEntry) {
        boolean result = false;
        for ( int i = 0; i< numberOfEntries ; i++){
            if ( bag[i] == anEntry )
                return true; // end if
        }// end for
        return result;
    }

    @Override
    public T[] toArray() {
        T[] result = (T[])new Object[numberOfEntries]; // Unchecked cast

        for (int i = 0; i < numberOfEntries; i++)
            result[i] = bag[i];// end for

//        for ( T element : result )
//            System.out.println(element);

        return result;
    } // end toArray

    // L3Q2
    @Override
    public BagInterface<T> union(BagInterface<T> o) {
//        ArrayBag<T> bag2 = (ArrayBag<T>) o;
        BagInterface<T> result = new ArrayBag<>();
        T [] first = this.toArray();
        T [] second = o.toArray();
        for (T element: first)
            result.add(element);
        for (T element: second)
            result.add(element);
        return result;
    }

    // L3Q3
    @Override
    public BagInterface<T> intersection(BagInterface<T> o) {
        ArrayBag<T> bag2 = (ArrayBag<T>) o;

        BagInterface<T> result = new ArrayBag<>();
        for (int i = 0; i < getCurrentSize(); i++){
            if (result.contains(bag[i])){
                continue;
            }
            if ( bag2.contains(bag[i])){
                int count = Math.min(getFrequencyOf(bag[i]) , o.getFrequencyOf(bag[i]));
                for ( int j = 0 ; j < count; j++){
                    result.add(bag[i]);
                }
            }
        }
        return result;
//        T [] first = this.toArray();
//        T [] second = o.toArray();
//
//        for (int i = 0; i < first.length; i++)
//            for (T element: second) {
//                if (first[i] == element) {
//                    if ( result.contains(element)){
//                        if (result.getFrequencyOf(element) < getFrequencyOf(element)){
//                            result.add(element);
//                        }
//                    }
//                    else
//                        result.add(element);
//                }
//            }
//        return result;
    }

    //L3Q4
    @Override
    public BagInterface<T> difference(BagInterface<T> o) {
        ArrayBag<T> bag2 = (ArrayBag<T>) o;
        BagInterface<T> result = new ArrayBag<>();
        for ( int i = 0; i < getCurrentSize(); i++){
            if ( result.contains(bag[i]))
                continue;
            if (!bag2.contains(bag[i])){
                result.add(bag[i]);
            }
            else {
                int difference = getFrequencyOf(bag[i]) - bag2.getFrequencyOf(bag[i]);
                for (int j = 0; j< difference; j++){
                    result.add(bag[i]);
                }
            }
        }
//
//        T [] first = this.toArray();
//        T [] second = o.toArray();
//        for ( T element : second){
//            result.add(element);
//        }
//        for ( int i = 0 ; i < first.length ; i++){
//            for ( T element : second){
//                if (first[i] == element){
//                    result.remove(element);
//                }
//            }
//        }
        return result;
    }
}
