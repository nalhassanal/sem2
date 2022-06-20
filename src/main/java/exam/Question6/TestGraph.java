package exam.Question6;

import java.util.ArrayList;

public class TestGraph {
    public static void main(String[] args) {
        RoutingGraph<String, Double> graph = new RoutingGraph<>();
        String [] locations = {"A", "B", "C", "D", "E", "F", "G"};
        for(String location: locations)
            graph.addVertex(location);

//        System.out.println("The number of vertices in MyCityGraph: " + graph.getSize());
//
//        System.out.println("List all vertices:");
//        ArrayList<String> vertices = graph.getVertex();
//        for (int i = 0; i < vertices.size(); i++){
//            System.out.print(i + ": " + vertices.get(i) + "\t");
//        }
//        System.out.println();

        // adding edges
        graph.addEdge("A", "C", 10.1, 1.0);
        graph.addEdge("A", "B", 7.0, 1.0);
        graph.addEdge("B", "A", 7.0, 1.0);
        graph.addEdge("B", "C", 5.5, 1.0);
        graph.addEdge("C", "B", 5.5, 1.0);
        graph.addEdge("B", "E", 3.2, 1.25);
        graph.addEdge("C", "D", 8.3, 1.0);
        graph.addEdge("E", "D", 2.9, 1.25);
        graph.addEdge("E", "G", 6.0, 1.5);
        graph.addEdge("G", "E", 6.0, 1.5);
        graph.addEdge("E", "F", 4.0, 1.5);
        graph.addEdge("D", "G", 4.9, 1.5);
        graph.addEdge("F", "G", 2.3, 3.0);

//        System.out.println("Has edge from B TO A? " + graph.hasEdge("B", "A"));
//        System.out.println("Has edge from A TO D? " + graph.hasEdge("A", "D"));

        // get neighbours
//        System.out.println();
//        System.out.println("Find all neighbours of B : " + graph.getNeighbours("B"));

        // print all edges
//        System.out.println();
//        graph.printEdges();

        // ques b
        graph.bfs("A");
    }
}
