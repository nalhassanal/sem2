package exam.Question6;

import week12.labtest.vertex;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class RoutingGraph <K extends Comparable<K>, V extends Comparable<V>>{
    private int size;
    Vertex<K, V> head;
    public RoutingGraph(){
        head = null;
        size = 0;
    }

    public void clear() {
        head = null;
    }

    public int getSize(){
        return this.size;
    }

    public ArrayList<K> getVertex(){
        ArrayList<K> ls = new ArrayList<>();
        Vertex<K, V> curr = head;
        while (curr != null){
            ls.add(curr.vertexObject);
            curr = curr.nextVertex;
        }
        return ls;
    }

    public int getIndex(K vertexNode){
        Vertex<K, V> current = head;
        int pos = 0;
        while (current != null){
            if (current.vertexObject.compareTo(vertexNode) == 0)
                // if current vertex is equal to the given vertex
                // return the position of the current vertex
                return pos;
            current = current.nextVertex; // update helper vertex
            pos += 1; // increment each loop
        }
        // if method exits loop
        // means that no such vertex exists returns -1
        return -1;
    }

    public boolean hasVertex(K vertexNode){
        if (head == null) // if there is no head
            return false;
        Vertex<K, V> current = head; // a vertex to help traverse the graph
        while (current != null){
            if (current.vertexObject.compareTo(vertexNode) == 0) {
                // if the current vertex is equal to the given vertex
                // then returns true
                return true;
            }
            current = current.nextVertex; // update the helper vertex
        }
        // if method exits the loop return false
        return false;
    }

    public boolean hasEdge(K source, K destination){
        if (head == null)
            return false;
        if (!hasVertex(source) || !hasVertex(destination))
            return false;
        Vertex<K, V> srcVertex = head;
        while (srcVertex != null){
            if (srcVertex.vertexObject.compareTo(source) == 0){
                Edge<K, V> currEdge = srcVertex.firstEdge;
                while (currEdge != null){
                    if (currEdge.destination.vertexObject.compareTo(destination) == 0)
                        return true;
                    currEdge = currEdge.nextEdge;
                }
            }
            srcVertex = srcVertex.nextVertex;
        }
        return false;
    }

    public boolean addVertex(K vertexNode){
        if(!hasVertex(vertexNode)){
            // if the graph does not have the given vertex
            Vertex<K, V> temp = head; // temp for the head
            // new vertex to be added to the graph
            Vertex<K, V> newVertex = new Vertex<>(vertexNode, null);

            if (head == null) // base case (add first)
                head = newVertex;
            else {
                // traverse until end of the vertex nodes
                Vertex<K, V> current = head;
                while (temp != null){
                    current = temp;
                    temp = temp.nextVertex;
                }
                // add a link from end of current graph to the new vertex
                current.nextVertex = newVertex;
            }
            size++; // increase the size regardless of cases and returns true
            return true;
        }
        // if the vertex is already in the graph.
        return false;
    }

    public boolean addEdge(K src, K dst, V distance){
        if (head == null) // if there is no head (no graph)
            return false;
        if (!hasVertex(src) || !hasVertex(dst)) // if the given src and dst doesn't exist
            return false;
        Vertex<K, V> source = head; // keep track of source vertex
        while (source != null){
            if (source.vertexObject.compareTo(src) == 0){
                // if the source vertex is equal to the given source vertex
                Vertex<K, V> dest = head; // keep track of dest vertex
                while (dest != null){
                    if (dest.vertexObject.compareTo(dst) == 0){
                        // if the dest vertex is equal to the given dst vertex
                        // keep track of current edge
                        // currEdge will be the next edge for the new edge
                        Edge<K, V> currEdge = source.firstEdge;
                        // create a new edge
                        Edge<K, V> newEdge = new Edge<>(dest, distance, currEdge);
                        // replace the first edge of the source vertex with the new edge
                        source.firstEdge = newEdge;
                        source.outdeg++; // increase the out deg of the source vertex
                        dest.indeg++; // increaset the in deg of the dest vertex
                        return true;
                    }
                    // otherwise update the dest vertex
                    dest = dest.nextVertex;
                }
            }
            // otherwise update the source vertex
            source = source.nextVertex;
        }
        // if the method exits the loops return false
        return false;
    }

    public boolean addEdge(K src, K dst, V distance, V speed){
        if (head == null) // if there is no head (no graph)
            return false;
        if (!hasVertex(src) || !hasVertex(dst)) // if the given src and dst doesn't exist
            return false;
        Vertex<K, V> source = head; // keep track of source vertex
        while (source != null){
            if (source.vertexObject.compareTo(src) == 0){
                // if the source vertex is equal to the given source vertex
                Vertex<K, V> dest = head; // keep track of dest vertex
                while (dest != null){
                    if (dest.vertexObject.compareTo(dst) == 0){
                        // if the dest vertex is equal to the given dst vertex
                        // keep track of current edge
                        // currEdge will be the next edge for the new edge
                        Edge<K, V> currEdge = source.firstEdge;
                        // create a new edge
                        Edge<K, V> newEdge = new Edge<>(dest, speed, distance, currEdge);
                        // replace the first edge of the source vertex with the new edge
                        source.firstEdge = newEdge;
                        source.outdeg++; // increase the out deg of the source vertex
                        dest.indeg++; // increaset the in deg of the dest vertex
                        return true;
                    }
                    // otherwise update the dest vertex
                    dest = dest.nextVertex;
                }
            }
            // otherwise update the source vertex
            source = source.nextVertex;
        }
        // if the method exits the loops return false
        return false;
    }

    public ArrayList<K> getNeighbours (K source){
        if (!hasVertex(source))
            return null;
        ArrayList<K> ls = new ArrayList<>();
        Vertex<K, V> curr = head;
        while (curr != null){
            // traverse the whole graph
            if (curr.vertexObject.compareTo(source) == 0){
                // if the current vertex is equal to the source vertex
                // create edge object to store current edge of the current vertex
                Edge<K, V> currentEdge = curr.firstEdge;
                while (currentEdge != null){
                    // traverse the edges in the vertex
                    // add each destination vertex of each edge into the list
                    ls.add(currentEdge.destination.vertexObject);
                    // update edge object for next itr
                    currentEdge = currentEdge.nextEdge;
                }
                break;
            }
            // update current vertex for next itr
            curr = curr.nextVertex;
        }
        // returns the ls after the loop is exited
        return ls;
    }

    public void printEdges(){
        Vertex<K, V> curr = head;
        while (curr != null){
            System.out.print("# " + curr.vertexObject + " : ");
            Edge<K, V> currentEdge = curr.firstEdge;
            while (currentEdge != null){
                System.out.print("[" + curr.vertexObject + "," + currentEdge.destination.vertexObject + "(speed=" +currentEdge.speed+ " , distance=" +currentEdge.distance +")" + "] ")  ;
                currentEdge = currentEdge.nextEdge;
            }
            System.out.println();
            curr = curr.nextVertex;
        }
        System.out.println();
    }

    public void bfs(K root) {
        System.out.println("At city / town " + root + " : ");
        ArrayList<K> related = getNeighbours(root);
        System.out.println("Can go to : " + related);

        boolean [] visited = new boolean[size];
        Queue<K> q = new LinkedList<>();
        q.offer(root);
        visited[getIndex(root)] = true;
        while (!q.isEmpty()){
            K next = q.poll();

            ArrayList<K> relatedNext = getNeighbours(next);
            if (relatedNext == null)
                break;

            for (K element : relatedNext){
                if (!visited[getIndex(element)]) {
                    visited[getIndex(element)] = true;
                    q.offer(element);
                }
            }
            System.out.println("Queue: " + q);
        }
    }

}
