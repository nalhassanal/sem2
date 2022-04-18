package week6.lecture;

import java.util.EmptyStackException;

public class MyStack <E>{
    private java.util.ArrayList<E> list = new java.util.ArrayList<>();

    public int getSize(){
        return list.size();
    }

    public E peek(){
        if (isEmpty()){
            throw new EmptyStackException();
        }
        return list.get(getSize() - 1); // bcs we want the last element in this list
    }

    public E pop(){
        if (isEmpty()){
            throw new EmptyStackException();
        }
        E poppedObj = list.get(getSize() - 1); // store last element in the list in variable
        list.remove(getSize() - 1); // removes last element in the list
        return poppedObj; // return popped object
    }

    public void push (E obj){
        list.add(obj); // adds element in the end of the list
    }

    public boolean isEmpty(){
        return list.isEmpty();
    }

    public String toString(){
        return "Stack: " + list.toString();
    }
}
