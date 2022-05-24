package week9.lecture;

public class vertexLL <T extends Comparable<T>, N extends Comparable<N>>{
    T vertexObject;
    int indeg;
    int outdeg;
    vertexLL<T, N> nextVertex;
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
