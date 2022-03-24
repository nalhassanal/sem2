package week1.Lab;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class ReadMyLetter_U2102848 {
    public static void main(String[] args) {
        part_1();
    }

    public static void part_1(){
        String Filename = "C:\\Users\\Hassanal\\Java\\sem2\\HassanalHarriz_U2102848.txt";
        try {
            Scanner inputStream = new Scanner(new FileInputStream(Filename));
            while (inputStream.hasNext())
                   System.out.println(inputStream.nextLine());
        } catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
