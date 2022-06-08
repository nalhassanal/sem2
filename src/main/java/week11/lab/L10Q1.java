package week11.lab;
/*
1.	Scan list, find the smallest value in the list
2.	Switch it with the value in the first position
3.	Find the next smallest value in the list
4.	Switch it with the value in the second position
5.	Repeat until all values are in their proper places

 */
public class L10Q1 {
    // L10Q3
    public static void main(String[] args) {
        int [] arr = {45, 7, 2, 8, 19, 3};
        selectionSortSmallest(arr);
        for(int x : arr)
            System.out.print(x + " ");
        selectionSortLargest(arr);
        System.out.println();
        for(int x : arr)
            System.out.print(x + " ");
    }
    // L102
    public static void selectionSortLargest(int [] arr){
        for (int i = 0; i < arr.length - 1 ; i++){
            int max = arr[i];
            int maxIndex = i;

            // scan list to find the smallest value in list
            for (int j = i + 1; j <arr.length; j++){
                if (max < arr[j]){
                    max = arr[j];
                    maxIndex = j;
                }
            }

            // reassign the smallest value to its corresponding index
            if (maxIndex != i){
                arr[maxIndex] = arr[i];
                arr[i] = max;
            }
        }
    }

    // L10Q1
    public static void selectionSortSmallest(int [] arr){
        for (int i = 0; i < arr.length - 1 ; i++){
            int min = arr[i];
            int minIndex = i;

            // scan list to find the smallest value in list
            for (int j = i + 1; j <arr.length; j++){
                if (min > arr[j]){
                    min = arr[j];
                    minIndex = j;
                }
            }

            // reassign the smallest value to its corresponding index
            if (minIndex != i){
                arr[minIndex] = arr[i];
                arr[i] = min;
            }
        }
    }
}
