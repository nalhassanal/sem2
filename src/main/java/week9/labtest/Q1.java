package week9.labtest;
import java.util.Scanner;
/*
D 400 | W 300 | W 700 | D 200 | D 450 | W 120
 */
public class Q1 {
    public static void main(String[] args) {
        Queue<String> transaction = new Queue<>();
        Scanner input = new Scanner(System.in);

        System.out.print("Enter transactions: ");
        // ask for input
        String inputString = input.nextLine();
        String [] data = inputString.split("\\|");

        for (String element: data) {
            transaction.enqueue(element.strip());
        }

        // display the queue
        transaction.displayQueue();

        int initialB = 500; // initialize balance
        System.out.println();

        System.out.println("Initial Balance:  " + initialB);

        while (!transaction.isEmpty()){
            String temp = transaction.dequeue(); // dequeue first element
            String [] info = temp.split(" "); // split the info into 2, 0 is type , 1 is amount
            if (temp.contains("D")){
                System.out.print("Deposit " + info[1] + "\t\t\t\t\t");
                initialB += Integer.parseInt(info[1]); // increase balance by amount
                System.out.print("New balance " + initialB);
            }
            else if (temp.contains("W")){
                if (Integer.parseInt(info[1]) > initialB){ // if the amount is more than balance
                    System.out.print("Withdraw " + info[1] + " Rejected \t\t");
                    System.out.print("New Balance " + initialB);
                }
                else {
                    System.out.print("Withdraw " + info[1] + " \t\t\t\t");
                    initialB-= Integer.parseInt(info[1]); // decrease the balance by amount
                    System.out.print("New Balance " + initialB);
                }
            }
            System.out.println();
        }
    }
}
