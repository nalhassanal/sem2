package week6.lab;
import java.util.Stack;
/*
trace for n = 3:
source - > dest
src - > middle
dest - > middle
src - > dest
middle - > src
middle - > dest
src - > dest
 */
public class toh {
    public static Stack<Integer> [] stacks = new Stack[4];

    public static void main(String[] args) {
        for (int i = 1; i < 4; i++) {
            stacks[i] = new Stack<>();
        }
        int numOfDisks = 3;

        // first in is the largest disks
        for (int i = numOfDisks; i > 0; i--) {
            stacks[1].push(i);
        }
        System.out.println("Before");
        System.out.println(stacks[1]);
        System.out.println(stacks[2]);
        System.out.println(stacks[3]);
        towerOfHanoi(numOfDisks);
        System.out.println("After");
        System.out.println(stacks[1]);
        System.out.println(stacks[2]);
        System.out.println(stacks[3]);
    }

    public static void towerOfHanoi(int numOfDisks){
        moveDisks(numOfDisks, 1, 2, 3);
    }

    public static void moveDisks(int numOfDisks, int source, int middle, int destination){
        if (numOfDisks <= 0) return;
        // at end of recursion num of disks moved is 1 then restart with 2nd
        moveDisks(numOfDisks - 1, source, destination, middle);
        // moves the lone disk from source to the destination
        stacks[destination].push(stacks[source].pop());
        moveDisks(numOfDisks - 1, middle, source, destination); // this is the restart
    }
}
