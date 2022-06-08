package week11.lab;

import java.util.Random;

/*
Suppose you have an integer array of eight elements ().
Your task is to sort this array in ascending
order using the insertion sort algorithm.
 */
public class L10Q4 {
    public static void main(String[] args) {
        int [] arr = new int[8];
        Random rand = new Random();
        for (int i = 0; i < 8; i++) {
            arr[i] = rand.nextInt(100) + 1;
        }
        for (int x : arr)
            System.out.print(x + " ");

        insertionSort(arr);
        System.out.println();
        for (int x : arr)
            System.out.print(x + " ");

        L10Q1.selectionSortLargest(arr);
        System.out.println();
        for (int x : arr)
            System.out.print(x + " ");

    }

    public static void insertionSort (int [] arr){
        for(int i = 1; i < arr.length; i++){
            int current = arr[i];
            int index;
            for (index = i - 1; index >= 0 && arr[index] > current; index--){
                arr[index + 1] = arr[index];
            }

            arr[index + 1] = current;
        }
    }
}
