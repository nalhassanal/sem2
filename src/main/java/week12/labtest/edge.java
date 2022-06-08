package week12.labtest;

public class edge <T extends Comparable<T> , N extends Comparable<N>>{

    // basically the destination vertex of the edge
    // because each edge must have a source so the source is in the vertexLL class
    vertex<T, N> destination;
    // weight of the edge itself
    N weight;
    // this will point to the next edge if present
    // like a list , this will help form the adjacency list
    edge<T, N> nextEdge;

    public edge() {
        destination = null;
        weight = null;
        nextEdge = null;
    }

    public edge(vertex<T, N> destination, N weight, edge<T, N> nextEdge){
        this.destination = destination;
        this.weight = weight;
        this.nextEdge = nextEdge;
    }

    @Override
    public String toString(){
        return "Destination: " + destination + ", Weight: " + weight;
    }
}
