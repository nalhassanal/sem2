package week9.labtest;
import java.util.ArrayList;
public class Stack <E>{
    private ArrayList<E> ls;
    private int size;

    public Stack(){
        this.ls = new ArrayList<>();
        size = 0;
    }

    public Stack (E[] e){
        this.ls = new ArrayList<>();
        for (E element: e) {
            ls.add(element);
        }
        size = ls.size();
    }

    public int getSize(){return ls.size();}

    public boolean isEmpty(){
        return ls.isEmpty();
    }

    public boolean contains(E e){
        if (size == 0){
            return false;
        }
        return ls.contains(e);
    }

    public void push (E e){
        if (size == 0){
            size++;
            ls.add(e);
        }
        size++;
        ls.add(e);
    }

    public E pop(){
        if (isEmpty()){
            return null;
        }
        return ls.remove(this.getSize() - 1);
    }

    public E peek(){
        if (isEmpty()){
            return null;
        }
        return ls.get(getSize() - 1);
    }

    public E get(int index){
        if (index >= getSize())
            return null;
        return ls.get(index);
    }

    public String toString(){
        return "Stack: " + ls.toString();
    }

    public void clearStack(){
        ls.clear();
    }

    public void removeLast(){
        ls.remove(1);
    }

    public void displayStack(){
        System.out.println();
        if(isEmpty())
            System.out.println("Empty Stack");
        for(int i = ls.size() - 1; i>=0; i--){
            System.out.print(ls.get(i) + " --> ");
        }
        System.out.println();
    }
}
