package week6.lab;

public class TestMyStack {
    public static void main(String[] args) {
        MyStack <Character> stack = new MyStack<>();
        stack.push('a');
        stack.push('b');
        stack.push('c');
        System.out.println("Character stack: "+stack);
        System.out.println("is 'b' in stack? "+stack.search('b'));
        System.out.println("is 'k' in stack? "+stack.search('k'));

        MyStack<Integer> stack1 = new MyStack<>();
        stack1.push(1);
        stack1.push(2);
        stack1.push(3);
        System.out.println("Integer stack: "+stack1);
        System.out.println("is '6' in stack? " +stack1.search(6));
    }
}
