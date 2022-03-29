package week2.Lab;

public class StorePairGeneric <T extends Comparable <T> > implements Comparable <StorePairGeneric <T> >{
    private T first, second;

    public StorePairGeneric (T first, T second){
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public T getSecond() {
        return second;
    }

    public void setPair (T first, T second){
        this.first = first;
        this.second = second;
    }

    @Override
    public String toString(){
        return "first = " + first + " second = " + second;
    }

    @Override
    public boolean equals (Object o){
        StorePairGeneric <T> another = (StorePairGeneric<T>) o;
        return (first == another.getFirst());
    }

    @Override
    public int compareTo(StorePairGeneric<T> o) {
        return 0;
    }
}
