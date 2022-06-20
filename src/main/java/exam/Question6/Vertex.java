package exam.Question6;

public class Vertex <K extends Comparable<K>, V extends Comparable<V>>{
    K vertexObject;

    int indeg;
    int outdeg;

    Vertex<K, V> nextVertex;

    Edge<K, V> firstEdge;

    public Vertex(){
        vertexObject = null;
        outdeg = indeg = 0;
        nextVertex = null;
        firstEdge = null;
    }

    public Vertex(K vertexInfo, Vertex<K, V> nextVertex){
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
