package exam;

import java.util.Stack;

/*
Write a program that contains a generic method that reverses
the order of the elements within a stack data structure using recursion.
In addition, write the main method to test the static method.
*/
/*
Two sets of test data should be used in the main method:
i) {“Switch”, “Motherboard”, “RAM”, “SSD”, “CPU”, “GPU”, “Router”};
and
ii) {17, 21, 45, 23, 1, 99, 16}.
No marks will be awarded if the stack and recursion concepts are not applied in the program
 */
public class q2 {

    public static void main(String[] args) {
        Stack<String> strings = new Stack<>();
        Stack<Integer> integers = new Stack<>();
        String [] elements = {"Switch", "Motherboard", "RAM", "SSD", "CPU", "GPU", "Router"};
        int [] elems = {17, 21, 45, 23, 1, 99, 16};
        for (String element : elements)
            strings.push(element);
        for(int integer: elems)
            integers.push(integer);

        System.out.println(strings);
        System.out.println(integers);
        reverse(strings);
        reverse(integers);
        System.out.println(strings);
        System.out.println(integers);
    }

    public static <T> void reverse(Stack<T> st){
        if (st.size() > 0){
            // hold each element
            // in call stack until reach last element
            T x = st.peek();
            st.pop();
            reverse(st);

            // insert all element in call stack
            // at the bottom of the stack
            insert_at_bottom(x, st);
        }

    }

    public static <T> void insert_at_bottom(T x, Stack<T> st)
    {

        // base case where the stack size is 0 so
        // just add the element
        if(st.isEmpty())
            st.push(x);

        else
        {
            // pop the element within
            // to make space at bottom
            // so that can insert each element at bottom
            T a = st.pop();
            insert_at_bottom(x, st);

            // after every element has been push at the bottom
            // the last element in original stack will be pushed
            // to the bottom
            st.push(a);
        }
    }
}
