package week9.lecture;

public class vertexLL <T extends Comparable<T>, N extends Comparable<N>>{
    // this variable will store what each vertex node actually is
    T vertexObject;
    // in deg is how many edges are coming into the node
    int indeg;
    // out deg is how many edges are coming out of the node
    int outdeg;
    // will point to the next vertex if available
    // will help in creating the linked structure of a graph
    vertexLL<T, N> nextVertex;
    // stores the first edge information ie the destination vertex of the source vertex (vertexObject)
    edgesLL<T, N> firstEdge;

    public vertexLL(){
        vertexObject = null;
        indeg = outdeg = 0;
        nextVertex = null;
        firstEdge = null;
    }

    public vertexLL(T vertexInfo, vertexLL<T, N> nextVertex){
        this.vertexObject = vertexInfo;
        indeg = outdeg = 0;
        this.nextVertex = nextVertex;
        firstEdge = null;
    }
}
