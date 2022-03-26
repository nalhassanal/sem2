package week2.Tutorial;

/*
    Create a generic class called Container that accepts one parameter, T.
    Create a no-arg constructor.
    Declare a private variable, t of type T.
    Create a method, add that returns nothing, accepting a parameter of generic type.
    Initialize this parameter to the initially declared variable.
    Create a generic method called retrieve() that returns the initially declared variable.

    Create a main method within the Container class.
    Create two containers of type Integer and String.
    Append two objects to the containers, one of type Integer having value 50,
    another of type String having value Java.
    Display the Integer and String objects from the respective containers.
 */

public class Container_T2Q1 <T>{
    private T t;

    public Container_T2Q1(){ }

    public void add(T t){
        this.t = t;
    }

    public T retrieve(){
        return t;
    }

    public static void main(String[] args) {
        Container_T2Q1<Integer> obj1 = new Container_T2Q1<>();
        Container_T2Q1<String> obj2 = new Container_T2Q1<>();

        obj1.add(50);
        obj2.add("Java");

        System.out.println("In obj1: " + obj1.retrieve());
        System.out.println("In obj2: " + obj2.retrieve());
    }
}
