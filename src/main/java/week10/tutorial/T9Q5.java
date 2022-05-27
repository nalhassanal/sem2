package week10.tutorial;
/*
Write a recursive method printDigit that prints an integer argument as its constituent digits,
 with a blank space separates each digit with the next.
 For example, if the argument is 4567, this method will print 4 5 6 7 on the screen.
 */
public class T9Q5 {
    public static void main(String[] args) {
        int input = 4567;
        System.out.println(input + " " + printDigit(input));
    }

    public static String printDigit (int num){
        String input = String.valueOf(num);
        if (input.length() <= 1) // base case where the string input is less than or equal to 1
            return input;
        // returns the case where places the first digit then calls the method with one digit less
        return input.charAt(0) + " " + printDigit(Integer.parseInt(input.substring(1))) ;
    }
}
