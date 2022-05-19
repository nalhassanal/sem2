package week9.labtest2.set1;

import week9.Stack;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class set1Q2 {
    static Stack <String> fileStack = new Stack<>();

    public static void main(String[] args) {
        Stack<String> tagStack = new Stack<>();

        System.out.println(fileStack);
        String filename = "test.xml";
        String curLine;

        try{
            Scanner inputFile = new Scanner(new FileInputStream(filename));
            tagStack.push(inputFile.nextLine());
            while(inputFile.hasNextLine()){
                curLine = inputFile.nextLine();

                fileStack.push(curLine);
            }
            inputFile.close();
        }catch (FileNotFoundException ex){
            System.out.println(ex.getMessage());
        }


    }

}
