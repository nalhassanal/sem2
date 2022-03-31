package week2.Lab;

// use T extends Comparable<T> because we want T to also have Comparable attributes so we want to implement
// but for T cannot use implements, so we use extends
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
        return first.equals(another.getFirst());
    }

    @Override
    public int compareTo(StorePairGeneric<T> o) {
        return first.compareTo(o.first);
    }
}
