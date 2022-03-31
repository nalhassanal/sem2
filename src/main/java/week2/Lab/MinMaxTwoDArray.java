package week2.Lab;
// when to use T when to use E as generic type??
public class MinMaxTwoDArray {
    public static <E extends Comparable<E> > E min(E[][] list){
        E min = list [0][0];
        for (int i = 0; i < list.length; i++){
            // be aware of the incrementsss and condition
            for (int j = 0 ; j < list[i].length  ; j++){
                if (list[i][j].compareTo(min) < 0)
                    min = list[i][j];
            }
        }

        // for each for 2d array
        for (E[] arr : list){
            for (E element : arr){
                if ( element.compareTo(min) < 0)
                    min = element;
            }
        }

        return min;
    }

    public static <E extends Comparable<E> >  E max(E[][] list){
        E max = list [0][0];
        for (int i = 0; i < list.length; i++){
            for (int j = 0 ; j < list[i].length ; j++){
                if (list[i][j].compareTo(max) > 0)
                    max = list[i][j];
            }
        }
        return max;
    }
}
