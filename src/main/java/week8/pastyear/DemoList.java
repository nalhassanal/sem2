package week8.pastyear;
import java.util.*;
public class DemoList {
    public static void main(String[] args) {
        List list = new ArrayList();
        List x = new ArrayList();
        x.add(1);
        list.add(1);
        list.add(2);
        list.add(3);
//        list.remove(3);
//        list.remove(1);
//        list.removeAll(x);
        list.remove(x);
        list.add(1);
        System.out.println(list.size());
    }
}
