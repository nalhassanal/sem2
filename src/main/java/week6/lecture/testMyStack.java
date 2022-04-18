package week6.lecture;

public class testMyStack {
    public static void main(String[] args) {
        MyStack<String> stack = new MyStack<>();

        stack.push("Tom");
        System.out.println("(1) " + stack.toString());

        stack.push("Susan");
        System.out.println("(2) " + stack.toString());

        stack.push("Kim");
        stack.push("Michael");
        System.out.println("(3) " + stack.toString());

        System.out.println("(4) " + stack.pop());
        System.out.println("(5) " + stack.pop());
        System.out.println("(6) " + stack.toString());
    }
}
