package week9.labtest2.set1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.Stack;


public class Q2 {
    public static void main(String[] args) {

        //reading xml file
        try {
            File file1= new File("test.xml");
            Scanner fileReader= new Scanner(new BufferedReader(new FileReader(file1)));
            StringBuilder sb = new StringBuilder();
            while(fileReader.hasNext()){
                sb.append(fileReader.next());
            }
            String result = sb.toString();
            System.out.println("Contents of XML file");
            System.out.println(result);
            if (isXMLMatched(result))
                System.out.println("Valid");
            System.out.println("Not Valid");
            fileReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("File could not be found.");
        }
    }

    public static boolean isXMLMatched(String xml){
        Stack<String> tagStack = new Stack<>();
        int j = xml.indexOf('<'); // find first '<' char
        System.out.println(j);
        while (j!= 1){
            int k = xml.indexOf('>' , j+1);
            if (k == -1)
                return false;

            String tag = xml.substring(j+1, k);// to strip < >
            if(!tag.startsWith("/")) // for starting tags
                tagStack.push(tag);
            else {
                if(tagStack.isEmpty())
                    return false; // no tag to match
                if(!tag.substring(1).equals(tagStack.pop()))
                    return false; // for mismatched tag
            }
            j = xml.indexOf('<', k+1);
        }
        return tagStack.isEmpty(); // were all opening tags properly matched?
    }
}
