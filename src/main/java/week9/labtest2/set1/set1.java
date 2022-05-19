package week9.labtest2.set1;

import week9.Queue;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class set1 {
    static Queue<String> dataQueue = new Queue<>();
    public static void main(String[] args) {
        readFile();

        String [] elementSplit;

        Queue<String> pCode = new Queue<>();

        // create 4 queue for 4 codes
        Queue<String> p03 = new Queue<>();
        Queue<String> p02 = new Queue<>();
        Queue<String> p06 = new Queue<>();
        Queue<String> p04 = new Queue<>();

        while (!dataQueue.isEmpty()){
            String element = dataQueue.dequeue();
            // split at space to get the code
            elementSplit = element.split(" ");
            if (!pCode.contains("P02") || !pCode.contains("P03")
                || !pCode.contains("P06") || !pCode.contains("P04"))
                pCode.enqueue(elementSplit[0]);// place in Code queue

            if (element.contains("P03"))
                p03.enqueue(element);
            if (element.contains("P02"))
                p02.enqueue(element);
            if (element.contains("P06"))
                p06.enqueue(element);
            if (element.contains("P04"))
                p04.enqueue(element);
        }

        Queue<String> tempQ = new Queue<>();
        while(!pCode.isEmpty()){
            String temp = pCode.dequeue();
            // to eliminate duplicate P02 code
            if (temp.equals("P02") && pCode.getSize()<3){
                continue;
            }
            tempQ.enqueue(temp);
        }

        pCode = tempQ;
        printCode(pCode);
        System.out.println("List of product by categories");
        printProduct(p03);
        printProduct(p02);
        printProduct(p06);
        printProduct(p04);
    }

    public static void printProduct(Queue<String> product){
        String temp;
        int sizeTemp = product.getSize();
        while(!product.isEmpty()){
            temp = product.dequeue();
            if (product.getSize() >= sizeTemp-1) {
                String code = temp.substring(0, 3);
                System.out.println("Product : "+code);
            }
            String productName = temp.substring(4);
            System.out.print(productName + "-->");
        }
        System.out.println();
    }

    public static void printCode(Queue<String> pCode){
        System.out.print("Product Code in Queue : ");
        while (!pCode.isEmpty())
            System.out.print(pCode.dequeue() + "-->");
        System.out.println();
    }

    public static void readFile(){
        String filename = "labtest2.txt";
        String curLine;
        String [] data = {};
        try{
            Scanner read = new Scanner(new FileInputStream(filename));
            while (read.hasNextLine()){
                curLine = read.nextLine();
                // regex to split every 2 spaces
                data = curLine.split("(?<!\\G\\S+)\\s");
                // place each element in a queue
                for (String element: data) {
                    dataQueue.enqueue(element);
                }
            }
            read.close();
        } catch (FileNotFoundException ex){
            System.out.println(ex.getMessage());
        }
    }
}
