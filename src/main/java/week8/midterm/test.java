package week8.midterm;
import java.util.*;
public class test {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("Donkey");
        list.add("Monkey");
        doSomething(list);
    }
    public static void doSomething(List x){
        x.add(1, "Likes");
        System.out.println(x);
    }
}
