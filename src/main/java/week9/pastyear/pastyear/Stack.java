package week9.pastyear.pastyear;
import java.util.ArrayList;
import java.util.EmptyStackException;

public class Stack {
    private final String stack_name;
    private final ArrayList<person> list;

    public Stack (String stack_name){
        this.list = new ArrayList<>();
        this.stack_name = stack_name;
    }

    public void push(String name, int age){
        list.add(new person(name, age));
    }

    public void push(String name, int age, String gender){
        list.add(new person(name, age, gender));
    }

    public void push(String name, int age, String gender, String occupation){
        list.add(new person(name, age, gender, occupation));
    }

    public void push (person Person){
        list.add(Person);
    }

    public person pop (){
        return list.remove(this.getSize() - 1);
    }

    public person peek(){
        if (isEmpty()){
            throw new EmptyStackException();
        }
        return list.get(getSize() - 1); // bcs we want the last element in this list
    }

    public person get(int index){
        if (index >= getSize())
            throw new ArrayIndexOutOfBoundsException(index);
        return list.get(index);
    }

    public int getSize(){
        return list.size();
    }

    public boolean isEmpty(){
        return list.isEmpty();
    }

    @Override
    public String toString(){
        return "Stack{List= " + list.toString() + " }";
    }

    public void displayStack(){
        System.out.println("----" + stack_name + "----");
        if (isEmpty())
            System.out.println("Empty stack");
        else{
            for (int i = list.size() - 1; i>=0; i--){
                System.out.println(i + " " + list.get(i));
            }
        }
        System.out.println("-------------------\n");
    }
}