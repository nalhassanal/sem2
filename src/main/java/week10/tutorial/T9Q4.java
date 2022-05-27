package week10.tutorial;

public class T9Q4 {
    public static void main(String[] args) {
        int input = 5;
        System.out.println(input + " " + sum(input));
    }

    public static int sum(int in){
        int result;
        if (in == 1)
            result = 1;
        else
            result = in + sum(in - 1);
        return result;
    }
}
