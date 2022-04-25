package week6.lab;
import java.util.Scanner;
public class TestIntMyStack {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        MyStack<Integer> stack = new MyStack<>();
        Integer intInput;
        System.out.println("Enter an integer value :");
        intInput = input.nextInt();
        for (int i = 1; i <= intInput; i++) {
            stack.push(i);
        }
        System.out.println("Size of stack: " + stack.getSize());

        while(!stack.isEmpty()){
            System.out.print(stack.pop() + " ");
        }
    }
}
