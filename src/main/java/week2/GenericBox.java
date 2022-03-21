package week2;

public class GenericBox<T> {
    private T item;
    boolean full;

    public GenericBox(){
        full = false;
    }

    public void store(T a){
        this.item = a;
        full = true;
    }

    public void remove(){
        item = null;
        full = false;
    }

    public String toString(){
        if(full)
            return item.toString();
        else
            return "Nothing";
    }
}
