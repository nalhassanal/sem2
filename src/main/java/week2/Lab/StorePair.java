package week2.Lab;

public class StorePair implements Comparable<StorePair>{
    private int first, second;

    public StorePair(int first, int second) {
        this.first = first;
        this.second = second;
    }

    public int getFirst() {
        return first;
    }

    public int getSecond() {
        return second;
    }

    public void setPair(int first, int second){
        this.first = first;
        this.second = second;
    }

    @Override
    public boolean equals(Object obj) {
        StorePair another = (StorePair) obj;
        return (first == another.getFirst());
    }

    @Override
    public String toString() {
        return "first = " + first + " second = " + second;
    }

    @Override
    public int compareTo(StorePair o) {
        if (first > o.getFirst()) return 1;
        else if ( first < o.getFirst()) return -1;
        else return 0;
    }
}