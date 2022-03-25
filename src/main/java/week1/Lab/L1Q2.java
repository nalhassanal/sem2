package week1.Lab;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class L1Q2 {
    public static void main(String[] args) {
        String [] FilePathArr = {"text1.txt", "text2.txt", "text3.txt", "text4.txt"};

        String [] delimiter = {",", ", " , "; ", "\\d+"}; // \d+ is regex for int

        Scanner sc;

        for ( int i = 0 ; i < FilePathArr.length; i++){
            try{
                System.out.println();
                System.out.println("text " + (i+1));
                int num = 0;
                sc = new Scanner(new FileReader(FilePathArr[i])); // reads from file

                while (sc.hasNextLine()){ // goes through file
                    String line = sc.nextLine(); // stores content of line from file
                    String [] items = line.split(delimiter[i]); // splits according to the delimiter

                    for (int j = 0; j < items.length; j++){ // pay attention to this
                        num += items[j].length(); // counts the number of char retrieved
                        System.out.print(items[j] + " "); // display all char retrieved
                    }
                    System.out.println();
                }
                System.out.println(num); // display the number of char retrieved without delimiter
                sc.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
    }
}
