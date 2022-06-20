package exam.Question6;

public class Edge <K extends Comparable<K>, V extends Comparable<V>>{
    Vertex<K, V> destination;

    V speed, distance;

    Edge<K, V> nextEdge;

    public Edge(){
        destination = null;
        speed = distance = null;
        nextEdge = null;
    }

    public Edge(Vertex<K, V> dest, V speed, V distance, Edge<K, V> nextEdge){
        this.destination = dest;
        this.speed = speed;
        this.distance = distance;
        this.nextEdge = nextEdge;
    }

    public Edge(Vertex<K, V> dest, V distance, Edge<K, V> nextEdge){
        this.destination = dest;
        this.speed = null;
        this.distance = distance;
        this.nextEdge = nextEdge;
    }

    public void setSpeed(V speed){
        this.speed = speed;
    }

    @Override
    public String toString(){
        return "Destination: " + destination + ", Distance: " + distance
                + ", Speed: " + speed;
    }
}
