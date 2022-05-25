package week9.lab;

public class Graph <T extends Comparable<T>> extends WeightedGraph<T, Integer>  {

    public boolean addEdge(T src, T dst){
        return super.addEdge(src, dst, null);
    }

    public boolean addUndirectedEdge(T src, T dst){
        return super.addUndirectedEdge(src, dst, null);
    }
}
