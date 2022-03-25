package week1.Lab;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ReadMyLetter_U2102848 {
    static final String Filename = "C:\\Users\\Hassanal\\Java\\sem2\\HassanalHarriz_U2102848.txt";

    public static void main(String[] args) {
//        part_1();
//        if (part_2_Write())
//            System.out.println("Successfully added messages");
//        else
//            System.out.println("Failed to add messages");
        System.out.println();
        part_2_Show();

    }

    public static void part_1() {
        try {
            Scanner inputStream = new Scanner(new FileInputStream(Filename));
            while (inputStream.hasNext())
                System.out.println(inputStream.nextLine());
            inputStream.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static Boolean part_2_Write(){
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        final String date = "Thursday, 23 June 2022";
        try{
            PrintWriter outputStream = new PrintWriter(new FileOutputStream(Filename, true));
            outputStream.println();
            outputStream.println(date);
            outputStream.println();
            outputStream.close();
        } catch (IOException ex){
            System.out.println(ex.getMessage());
        }
        String message;

        while (true){
            System.out.println("Type in your message [Press 0 to exit] :");
            message = input.nextLine();
            if (message.equalsIgnoreCase("0")){
                return true;
            }
            else {
                try {
                    PrintWriter outputStream = new PrintWriter(new FileOutputStream(Filename,true));
                    outputStream.println(message);
                    outputStream.close();
                } catch (IOException ex){
                    System.out.println(ex.getMessage());
                    break;
                }
            }
        }
        return false;
    }

    public static void part_2_Show(){
        try {
            Scanner inputStream = new Scanner(new FileInputStream(Filename));
            while (inputStream.hasNext())
                System.out.println(inputStream.nextLine());
            inputStream.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}