package week8.pastyear;
import java.util.List;
import java.util.ArrayList;
public class ListDemo {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("D");
        list.add(1);
        list.clear();
        m(list);
    }
    public static void m(List list){
        System.out.println(list);
    }
}
