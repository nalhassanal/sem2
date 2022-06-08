package week12.lab.test3a;

public class vertex <T extends Comparable<T>, N extends Comparable<N>>{
    // this variable will store what each vertex node actually is
    T vertexObject;
    // in deg is how many edges are coming into the node
    int indeg;
    // out deg is how many edges are coming out of the node
    int outdeg;
    // will point to the next vertex if available
    // will help in creating the linked structure of a graph
    vertex<T, N> nextVertex;
    // stores the first edge information ie the destination vertex of the source vertex (vertexObject)
    edge<T, N> firstEdge;

    public vertex(){
        vertexObject = null;
        indeg = outdeg = 0;
        nextVertex = null;
        firstEdge = null;
    }

    public vertex(T vertexInfo, vertex<T, N> nextVertex){
        this.vertexObject = vertexInfo;
        indeg = outdeg = 0;
        this.nextVertex = nextVertex;
        firstEdge = null;
    }

    @Override
    public String toString(){
        return "Vertex: " + vertexObject;
    }
}
