package week6.lab;
import java.util.ArrayList;
public class L6Q5 {
    public static MyStack<Integer> [] tower = new MyStack[4];
    public static int N;
    public static void main(String[] args) {
        for (int i = 1; i < 4; i++) {
            tower[i] = new MyStack<>();
        }

        int numOfDisks = N = 3;

        for (int i = N; i > 0 ; i--) {
            tower[1].push(i);
        }
        System.out.println("The tower is: ");
        display();
        towerOfHanoi(numOfDisks);
    }

    public static void towerOfHanoi(int numOfDisks){
        moveDisks(numOfDisks, 1, 2, 3);
    }

    public static void moveDisks(int numOfDisks, int source, int middle, int destination){
        if (numOfDisks <= 0) return;
        // at end of recursion num of disks moved is 1 then restart with 2nd
        moveDisks(numOfDisks - 1, source, destination, middle);
        // moves the lone disk from source to the destination
        tower[destination].push(tower[source].pop());
        moveDisks(numOfDisks - 1, middle, source, destination); // this is the restart
    }

    public static void display(){
        ArrayList<ArrayList<Integer>> arrayList = new ArrayList<>();

        for ( int i = 1 ; i < 4; i++){
            arrayList.add(tower[i].elements());
        }

        // go by layer
        for (int layer = N; layer > 0 ; layer--) {
            // i represent tower
            // go by tower
            for (int i = 1; i < 4; i++) {
                if (layer < arrayList.get(i).size()){
                    System.out.printf(" %s  ", arrayList.get(i).get(layer));
                }
                else
                    System.out.print("    ");
            }
            System.out.println("");
        }
        System.out.println("--- --- ---");
        System.out.println(" A   B   C ");
        System.out.println("");
    }
}
