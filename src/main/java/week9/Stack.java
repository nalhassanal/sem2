package week9;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class Stack <E>{
    private final ArrayList<E> list;

    public Stack (){
        this.list = new ArrayList<>();
    }

    public int getSize(){return list.size();}

    public boolean isEmpty(){return list.isEmpty();}

    public void push (E e){
        list.add(e);
    }

    public E pop(){
        if (isEmpty()){
            throw new EmptyStackException();
        }
        return list.remove(this.getSize() - 1);
    }

    public E peek(){
        if (isEmpty()){
            throw new EmptyStackException();
        }
        return list.get(getSize() - 1);
    }

    public E get(int index){
        if (index >= getSize())
            throw new ArrayIndexOutOfBoundsException(index);
        return list.get(index);
    }

    public String toString(){
        return "Stack: " + list.toString();
    }

    public void displayStack(){
        System.out.println();
        if (isEmpty())
            System.out.println("Empty stack");
        for(int i = list.size() - 1; i>=0 ; i--){
            System.out.print(list.get(i) + "-->");
        }
        System.out.println();
    }

}
