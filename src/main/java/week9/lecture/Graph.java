package week9.lecture;

import java.util.ArrayList;

public class Graph <T extends Comparable<T>, N extends Comparable<N>>{
    vertexLL <T, N> head;
    int size;

    public Graph (){
        head = null;
        size = 0;
    }

    public void clear() {
        head = null;
    }

    public int getSize(){
        return this.size;
    }

    public boolean hasVertex(T vertexNode){
        if (head == null) // if there is no head
            return false;
        vertexLL<T, N> current = head; // a vertex to help traverse the graph
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

    public int getIndeg(T vertexNode){
        if (hasVertex(vertexNode)){
            // if the graph has the given vertex
            vertexLL<T, N> current = head; // helper vertex object
            while (current != null){
                if (current.vertexObject.compareTo(vertexNode) == 0)
                    // if the current vertex is equal to the given vertex
                    // return the current in deg
                    return current.indeg;
                current = current.nextVertex; // update the helper vertex
            }
        }
        // if the graph does not have the given vertex
        return -1;
    }

    public int getOutdeg(T vertexNode){
        if (hasVertex(vertexNode)){
            // if the graph has the given vertex
            vertexLL<T, N> current = head; // helper vertex object
            while (current != null){
                if (current.vertexObject.compareTo(vertexNode) == 0)
                    // if the current vertex is equal to the given vertex
                    // return the current out deg
                    return current.outdeg;
                current = current.nextVertex; // update the helper vertex
            }
        }
        // if the graph does not have the given vertex
        return -1;
    }

    public boolean addVertex(T vertexNode){
        if(!hasVertex(vertexNode)){
            // if the graph does not have the given vertex
            vertexLL<T, N> temp = head; // temp for the head
            // new vertex to be added to the graph
            vertexLL<T, N> newVertex = new vertexLL<>(vertexNode, null);

            if (head == null) // base case (add first)
                head = newVertex;
            else {
                // traverse until end of the vertex nodes
                vertexLL<T, N> current = head;
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

    public int getIndex(T vertexNode){
        vertexLL<T, N> current = head;
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

    public ArrayList<T> getAllVertexObjects(){
        // creates the return object
        ArrayList<T> ls = new ArrayList<>();
        vertexLL<T, N> current = head; // helper vertex
        while (current != null){
            // adds every vertex node in the graph into the
            // array list
            ls.add(current.vertexObject);
            current = current.nextVertex; // updates the helper vertex
        }
        // when method exits the loop
        // returns the arraylist
        return ls;
    }

    public ArrayList<vertexLL<T,N>> getAllVertices(){
        // creates a list to hold the list representation of the graph
        ArrayList<vertexLL<T, N>> ls = new ArrayList<>();
        vertexLL<T, N> current = head;
        while (current != null){
            // adds the current vertex into the list
            ls.add(current);
            current = current.nextVertex;
        }
        // returns the arraylist
        return ls;
    }

    public T getVertex(int pos){
        if (pos > size -1 || pos < 0)
            // if given index is larger than size or less than 0
            return null;
        vertexLL<T, N> current = head;
        for (int i = 0; i < pos; i++)
            // traverse the graph until the given index
            current = current.nextVertex;
        // returns the vertex node of the given index
        return current.vertexObject;
    }

    public boolean hasEdge(T source, T destination){
        if (head == null)
            return false;
        if (!hasVertex(source) || !hasVertex(destination))
            return false;
        vertexLL<T, N> srcVertex = head;
        while (srcVertex != null){
            if (srcVertex.vertexObject.compareTo(source) == 0){
                edgesLL<T, N> currEdge = srcVertex.firstEdge;
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

    public boolean addEdge(T src, T dst, N weight){
        if (head == null) // if there is no head (no graph)
            return false;
        if (!hasVertex(src) || !hasVertex(dst)) // if the given src and dst doesn't exist
            return false;
        vertexLL<T, N> source = head; // keep track of source vertex
        while (source != null){
            if (source.vertexObject.compareTo(src) == 0){
                // if the source vertex is equal to the given source vertex
                vertexLL<T, N> dest = head; // keep track of dest vertex
                while (dest != null){
                    if (dest.vertexObject.compareTo(dst) == 0){
                        // if the dest vertex is equal to the given dst vertex
                        // keep track of current edge
                        // currEdge will be the next edge for the new edge
                        edgesLL<T, N> currEdge = source.firstEdge;
                        // create a new edge
                        edgesLL<T, N> newEdge = new edgesLL<>(dest, weight, currEdge);
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

    public N getEdgeWeight (T src, T dst){
        if (head == null)
            return null;
        if (!hasVertex(src) || !hasVertex(dst))
            return null;
        vertexLL<T, N> source = head; // keep track of source vertex
        while (source != null){
            // traverse through graph
            if (source.vertexObject.compareTo(src) == 0){
                // if source vertex is equal to the given src vertex
                // create an edge object to store the source vertex first edge
                edgesLL<T, N> curr = source.firstEdge;
                while (curr != null){
                    // traverse through all edges of the source vertex
                    if (curr.destination.vertexObject.compareTo(dst) == 0)
                        // if the destination vertex of the edge of the source vertex
                        // is equal to the dst vertex
                        // returns the edge weight
                        return curr.weight;
                    // update edge object for next itr
                    curr = curr.nextEdge;
                }
            }
            // update source object for next itr
            source = source.nextVertex;
        }
        // if method exits from loop
        // means that there is no edges between the given vertex
        // return null
        return null;
    }

    public ArrayList<T> getNeighbours (T source){
        if (!hasVertex(source))
            return null;
        ArrayList<T> ls = new ArrayList<>();
        vertexLL<T, N> curr = head;
        while (curr != null){
            // traverse the whole graph
            if (curr.vertexObject.compareTo(source) == 0){
                // if the current vertex is equal to the source vertex
                // create edge object to store current edge of the current vertex
                edgesLL<T, N> currentEdge = curr.firstEdge;
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
        vertexLL<T, N> curr = head;
        while (curr != null){
            System.out.print("# " + curr.vertexObject + " : ");
            edgesLL<T, N> currentEdge = curr.firstEdge;
            while (currentEdge != null){
                System.out.print("[" + curr.vertexObject + "," + currentEdge.destination.vertexObject + "] ")  ;
                currentEdge = currentEdge.nextEdge;
            }
            System.out.println();
            curr = curr.nextVertex;
        }
        System.out.println();
    }
}
