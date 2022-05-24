package week9.lecture;

public class edgesLL <T extends Comparable<T> , N extends Comparable<N>>{

    // basically the destination vertex of the edge
    // because each edge must have a source so the source is in the vertexLL class
    vertexLL<T, N> destination;
    // weight of the edge itself
    N weight;
    // this will point to the next edge if present
    // like a list , this will help form the adjacency list
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
