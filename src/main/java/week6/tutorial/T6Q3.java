package week6.tutorial;

public class T6Q3 {
    public static void main(String[] args) {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        Stack<Integer> s3 = new Stack<>();
//        test1(s1,s2,s3);
        s1.push(1);
        s1.push(2);
        s1.push(3);
        s1.pop();
        s1.pop();
        s1.push(3);
        s1.push(2);
        System.out.println(s1);
    }

    public static void test1(Stack<Integer> s1, Stack<Integer> s2, Stack<Integer> s3){
        s1.push(1);
        s1.push(2);
        s1.push(3);
        System.out.println(s1.getSize());
        System.out.println(s1);
        s2.push(s1.pop());
        s3.push(s1.pop());
        s2.push(s1.pop());
        s1.push(s3.pop());
        s3.push(s2.pop());
        s1.push(s2.pop());
        s1.push(s3.pop());
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
