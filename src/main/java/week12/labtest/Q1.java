package week12.labtest;

import java.util.*;

public class Q1 {
    public static void main(String[] args) {

        AdjMatrix matrix = usingMatrix();
        matrix.printGraph();

        WeightedGraph<String, Integer> graph = usingGraph(matrix);
        graph.printEdges();


        graph.bfs("` Bentong");
        System.out.println("Can Bentong reach Ayer Keroh? "+canReach("Bentong", "Ayer Keroh" , graph));

    }

    public static boolean canReach (String source, String destination, WeightedGraph<String,Integer> graph) {
        boolean [] isVisited = new boolean[graph.size];
        Queue<String> queue = new LinkedList<>();
        queue.offer(source);
        isVisited[graph.getIndex(source)] = true;

        while (!queue.isEmpty()) {
            String next = queue.poll();

            ArrayList<String> relatedNext = graph.getNeighbours(next);
            if (relatedNext == null || next.equals(destination)) {
                // no other city / town relate to last movie info in stack
                return true;
            }

            for (String element : relatedNext) {
                if (!isVisited[graph.getIndex(element)]) {
                    isVisited[graph.getIndex(element)] = true;
                    queue.offer(element);
                }
            }
        }

        return false;
    }

    public static WeightedGraph<String, Integer> usingGraph(AdjMatrix matrix){
        ArrayList<String> vertex = matrix.getVertices();

        WeightedGraph<String, Integer> graph = new WeightedGraph<>();
        for (String vertices: vertex)
            graph.addVertex(vertices);

        int [][] adj = matrix.getMatrix();
        for (int i = 0; i < adj.length; i++)
            for (int j = 0 ; j < adj.length; j++)
                if (adj[i][j] == 1)
                    graph.addEdge(vertex.get(i), vertex.get(j), 1);

        return graph;
    }

    public static AdjMatrix usingMatrix(){
        String [] cities = {"Ayer Keroh", "Bentong", "Chukai", "Dungun","Endau","Gerik","Hulu Yam", "Iskandar Puteri", "Jitra", "Kajang"};
        AdjMatrix matrix = new AdjMatrix(cities.length);
        for (String city : cities)
            matrix.addVertex(city);

        matrix.addEdge("Ayer Keroh", "Bentong");
        matrix.addEdge("Ayer Keroh", "Chukai");
        matrix.addEdge("Ayer Keroh", "Hulu Yam");

        matrix.addEdge("Bentong", "Ayer Keroh");
        matrix.addEdge("Bentong", "Gerik");
        matrix.addEdge("Bentong", "Kajang");

        matrix.addEdge("Chukai", "Ayer Keroh");
        matrix.addEdge("Chukai", "Bentong");
        matrix.addEdge("Chukai", "Gerik");
        matrix.addEdge("Chukai", "Hulu Yam");

        matrix.addEdge("Endau", "Bentong");
        matrix.addEdge("Endau", "Gerik");
        matrix.addEdge("Endau", "Jitra");

        matrix.addEdge("Gerik", "Bentong");
        matrix.addEdge("Gerik", "Chukai");

        matrix.addEdge("Iskandar Puteri", "Chukai");
        matrix.addEdge("Iskandar Puteri", "Gerik");
        matrix.addEdge("Iskandar Puteri", "Hulu Yam");
        matrix.addEdge("Iskandar Puteri", "Jitra");

        matrix.addEdge("Jitra", "Ayer Keroh");
        matrix.addEdge("Jitra", "Hulu Yam");

        matrix.addEdge("Kajang", "Gerik");
        matrix.addEdge("Kajang", "Jitra");

        return matrix;
    }
}
