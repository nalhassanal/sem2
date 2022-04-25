package week6.lab;
/*
The tower of hanoi is a mathematical game or puzzle. It consists of
three rods, and a number of disks of different sizes which can slide onto
any rod. The puzzle starts with the disks in a neat stack in ascending
order of size on one rod, the smallest at the top, thus making a
conical shape. The objective of the puzzle is to move the entire
stack to another rod, obeying the following rules:
 */
/*
i.  Only one disk may be moved at a time
ii. Each move consists of taking the upper disk from one of the rods
    and sliding it onto another rod, on top of the other disks that
    may already be present on that rods
iii.No disk may be placed on top of a smaller disk.
 */
import java.util.Stack;
public class TowerOfHanoi {
//    public static Stack<Integer> [] towerx = new Stack[4];
    public static MyStack<Integer>[] tower = new MyStack[4];
    public static int N;

    public static void main(String[] args) {
        for (int i = 1; i < 4; i++) {
            tower[i] = new MyStack<>();
        }
        int num = 2;
        N = num;
        toh(num);
    }

    public static void toh(int n){
        for ( int i = n; i > 0 ; i--)
            tower[1].push(i);
        display();
        move(n , 1 , 2 , 3);
    }

    public static void move(int n, int a, int b , int c){
        if ( n > 0){
            move(n - 1, a , c, b);
            int d = tower[a].pop();
            tower[c].push(d);
            display();
            move(n - 1, b ,a , c);
        }
    }

    public static void display(){
        System.out.println("  A  |  B  |  C");
        System.out.println("---------------");
        for (int i = N; i >= 0 ; i--) {
            String d1 = " ", d2 = " ", d3 = " ";
            try {
                d1 = String.valueOf(tower[1].get(i));
            }catch (Exception e){
            }
            try {
                d2 = String.valueOf(tower[2].get(i));
            }catch (Exception e){
            }
            try {
                d3 = String.valueOf(tower[3].get(i));
            }catch (Exception e){
            }
            System.out.println("  "+d1+"  |  "+d2+"  |  "+d3);
        }
        System.out.println("\n");
    }
}
