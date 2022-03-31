package week2.Lab;
/*
In a class called CompareMax,
create a generic static method called maximum where the generic type extends the Comparable interface,
which receives three parameters. Find the maximum of three values invoked by the main method.
 */
public class L2Q3 {
    public static class compareMax {
        // want to compare type parameters always extends Comparable<>
        public static <T extends Comparable<T>> T maximum(T first, T second, T third) {
            if (first.compareTo(second) > 0 && first.compareTo(third) > 0)
                return first;
            else if (second.compareTo(first) > 0 && second.compareTo(third) > 0)
                return second;
            else
                return third;
            // this method also works
//            T max = first;
//            if ( second.compareTo(max) > 0){
//                max = second;
//            }
//            if (third.compareTo(max) > 0){
//                max = third;
//            }
//            return max;
        }

        public static void main(String[] args) {
            System.out.println(maximum(1, 2, 3));
            System.out.println(maximum('a', 'b', 'c'));
        }
    }
}
