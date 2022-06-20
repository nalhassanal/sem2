package week12.lab.test3a;

public class bQ1 {
    public static void main(String[] args) {
        String [] Movies = {"Alice In Wonderland", "Chitty Chitty Bang Bang", "Mary Poppins",
        "What a Way to Go", "The Sound of Music", "The Apartment", "The Old Gun", "Triple Cross"};
        String [] Actors = {"Barbara Windsor", "Dick Van Dyke", "Julie Andrews", "Shirley MacLaine",
                "Romy Schneider", "Christopher Plummer"};

        UnweightedGraph<String> graph = new UnweightedGraph<>();
        for(String movies: Movies) {
            graph.addVertex(movies);
            graph.addUndirectedEdge(movies,movies);
        }
//        for(String actors: Actors)
//            graph.addVertex(actors);

//        graph.addUndirectedEdge("Alice In Wonderland", "Barbara Windsor");
//        graph.addUndirectedEdge("Chitty Chitty Bang Bang", "Barbara Windsor");
//        graph.addUndirectedEdge("Chitty Chitty Bang Bang", "Dick Van Dyke");
//        graph.addUndirectedEdge("Mary Poppins", "Dick Van Dyke");
//        graph.addUndirectedEdge("Mary Poppins", "Julie Andrews");
//        graph.addUndirectedEdge("What a Way to Go", "Dick Van Dyke");
//        graph.addUndirectedEdge("What a Way to Go", "Shirley MacLaine");
//        graph.addUndirectedEdge("The Sound of Music", "Julie Andrews");
//        graph.addUndirectedEdge("The Sound of Music", "Christopher Plummer");
//        graph.addUndirectedEdge("The Apartment", "Shirley MacLaine");
//        graph.addUndirectedEdge("The Old Gun", "Romy Schneider");
//        graph.addUndirectedEdge("Triple Cross", "Romy Schneider");
//        graph.addUndirectedEdge("Triple Cross", "Christopher Plummer");

        graph.addUndirectedEdge("Alice In Wonderland", "Chitty Chitty Bang Bang");
        graph.addUndirectedEdge("Chitty Chitty Bang Bang", "Mary Poppins");
        graph.addUndirectedEdge("Chitty Chitty Bang Bang", "What a Way to Go");
        graph.addUndirectedEdge("Mary Poppins", "What a Way to Go");
        graph.addUndirectedEdge("Mary Poppins", "The Sound of Music");
        graph.addUndirectedEdge("What a Way to Go", "The Apartment");
        graph.addUndirectedEdge("The Sound of Music", "Triple Cross");
        graph.addUndirectedEdge("The Old Gun", "Triple Cross");

        graph.printEdges();

        System.out.println(graph.getNeighbours("The Sound of Music"));
        graph.dfs("The Sound of Music");


    }
}
