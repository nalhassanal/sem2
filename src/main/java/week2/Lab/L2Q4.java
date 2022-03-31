package week2.Lab;
/*
Provide a declaration and implementation of the generic method minmax()
that takes in an array of generic type and
returns a string with the following format: Min = Max = .
For instance, in your main method, create one object of type array
for integers and one object of type string:
    Integer[] intArray = {5,3,7,1,4,9,8,2};
    String[] strArray = {"red", "blue", "orange", "tan"};
minmax() method returns “Min = 1 Max = 9” For intArray
minmax() method returns “Min = blue Max = tan” for strArray
*Hint: use Comparable interface to compare the values
*Hint: compareTo() method:
• if a > b, it returns positive number
• if a < b, it returns negative number
• if a == b, it returns 0
 */
public class L2Q4 {
    public static <T extends Comparable <T> > String minmax(T[] arr){
        T Min = arr[0], Max = arr[0];
//        // for each loop
//        // left is each element in right side
//        // basically loop through each element in array
//        for (T element : arr){
//            if (element.compareTo(Min) < 0){
//                Min = element;
//            }
//            if (element.compareTo(Max) > 0){
//                Max = element;
//            }
//        }

        for (int i = 0 ; i < arr.length; i++){
            if (arr[i].compareTo(Min) < 0 )
                Min = arr[i];
            if (arr[i].compareTo(Max) > 0 )
                Max = arr[i];
        }
        String ret =  "Min = " +  Min + "  Max = " + Max;
        return ret;
    }

    public static void main(String[] args) {
        Integer[] intArray = {5,3,7,1,4,9,8,2};
        String[] strArray = {"red", "blue", "orange", "tan"};

        String intResult = minmax(intArray);
        String strResult = minmax(strArray);
        System.out.println(intResult);
        System.out.println(strResult);
    }
}
