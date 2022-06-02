package week10.lab;

public class L9Q3 {
    public static void main(String[] args) {
        int [] x = {9}, y = {0,1,2,3,4,5,6,7,8,9};
        for (int base : x){
            for (int power : y){
                System.out.println(base + "^" + power + "= " + exponent(base, power));
            }
        }
    }

    public static long exponent(int x, int m){
        if (m < 0) {
            System.out.println("wrong input for y");
            return -1;
        }
        if (m != 0){
//            System.out.println(x + "^" + m );
            return (x * exponent(x, m - 1));
        }
        else
            return 1;
    }
}
