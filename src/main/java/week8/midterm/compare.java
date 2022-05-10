package week8.midterm;
import java.util.*;
public class compare {
    public static void main(String[] args) {
        String[] ar = {"c","d","b","a","e"};
        SomeClass in = new SomeClass();

        Arrays.sort(ar, in);
        for (String str:
             ar) {
            System.out.print(str + " ");
        }
    }
    static class SomeClass implements Comparator<String>{
        public int compare(String s1, String s2){
            return s2.compareTo(s1);
        }
    }
}
