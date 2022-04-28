package week6.lab;
/*
Assuming that an unknown number of positive integers are stored in a stack, S.
Using only stack ADT operations write an algorithm/function to find sum of every
element in S.
 */
public class L6Q3 {
    public static void main(String[] args) {
        MyStack<Integer> s = new MyStack<>();
        for (int i = 1; i <= 5; i++) {
            s.push(i);
        }

        System.out.println(s);
        System.out.println("Sum of element in stack is: " + sumOfStack(s));

    }

    public static int sumOfStack(MyStack<Integer> s){
        int sum = 0;
        while(!s.isEmpty())
            sum += s.pop();
        return sum;
    }
}
