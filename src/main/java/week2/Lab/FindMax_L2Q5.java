package week2.Lab;
/*
Create a class called FindMax that contains the following:
Create a Circle class that uses the Comparable interface.
Declare the radius variable and a single parameterized constructor that accepts this variable.
 */
/*
In your main program, create 3 different objects of type array
(a) for integers that stores the following values, 1,2,3;
(b) a list of string that stores red, green, blue and
(c) a circle object of radius 3, 2.9 and 5.9.
Invoke the max method as below:
	public static <E extends Comparable <E> > E max(E[] list)
The max method above returns the maximum value in an array

 */
public class FindMax_L2Q5 {
    public static class Circle implements Comparable<Circle>{
        private double radius;
        public Circle(double radius){
            this.radius = radius;
        }

        @Override
        public int compareTo(Circle o) {
            if (radius > o.radius) return 1;
            else if (radius < o.radius) return -1;
            else return 0;
        }

        @Override
        public String toString() {
            return "Circle radius= " + radius ;
        }
    }

    public static <E extends Comparable <E> > E max(E[] list){
        E max = list[0];
        for ( int i = 0; i < list.length; i++){
            if (list[i].compareTo(max) > 0)
                max = list[i];
        }
        return max;
    }

    public static void main(String[] args) {
        Integer [] a = {1, 2, 3};
        String [] b = {"red", "green", "blue"};
        Circle [] c = {new Circle(3), new Circle(2.9), new Circle(5.9)};

        System.out.println(max(a));
        System.out.println(max(b));
        System.out.println(max(c)); // why this line call the toString?
    }
}
