package week6.lab;
import java.util.ArrayList;
import java.util.EmptyStackException;

public class MyStack <E>{
    private final ArrayList <E> list ;

    public MyStack (){
        list = new ArrayList<>();
    }

    public int getSize(){
        return list.size();
    }

    public boolean isEmpty(){
        return list.isEmpty();
    }

    public String toString(){
        return "Stack : " + list.toString();
    }

    public boolean search (E o){
        return list.contains(o);
    }

    public void push (E o){
        list.add(o);
    }

    public E pop(){
        if (isEmpty()){
            throw new EmptyStackException();
        }
        E poppedObj = list.get(getSize() - 1); // store last element in the list in variable
        list.remove(getSize() - 1); // removes last element in the list
        return poppedObj; // return popped object
    }

    public E peek(){
        if (isEmpty()){
            throw new EmptyStackException();
        }
        return list.get(getSize() - 1); // bcs we want the last element in this list
    }

    public E get(int index){
        if (index >= getSize())
            throw new ArrayIndexOutOfBoundsException(index);
        return list.get(index);
    }
}
