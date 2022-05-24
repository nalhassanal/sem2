package week9.lecture;

public class edgesLL <T extends Comparable<T> , N extends Comparable<N>>{
    vertexLL<T, N> destination;
    N weight;
    edgesLL<T, N> nextEdge;

    public edgesLL() {
        destination = null;
        weight = null;
        nextEdge = null;
    }

    public edgesLL(vertexLL<T, N> destination, N weight, edgesLL<T, N> nextEdge){
        this.destination = destination;
        this.weight = weight;
        this.nextEdge = nextEdge;
    }
}
