package week12.lab.test3a;

public class aQ1 {
    public static void main(String[] args) {
        UnweightedGraph<String> graph = new UnweightedGraph<>();
        graph.addVertex("Ben Wishaw");
        graph.addVertex("Jeffrey Wright");
        graph.addVertex("Joseph Mazzallo");
        graph.addVertex("Nick Frost");
        graph.addVertex("Rami Malek");
        graph.addVertex("Robert Popper");
        graph.addVertex("Simon Pegg");
        graph.addVertex("Ving Rhames");

        // because every actor has appeared with himself in movies
        graph.addUndirectedEdge("Ben Wishaw","Ben Wishaw");
        graph.addUndirectedEdge("Jeffrey Wright","Jeffrey Wright");
        graph.addUndirectedEdge("Joseph Mazzallo","Joseph Mazzallo");
        graph.addUndirectedEdge("Nick Frost","Nick Frost");
        graph.addUndirectedEdge("Rami Malek","Rami Malek");
        graph.addUndirectedEdge("Robert Popper","Robert Popper");
        graph.addUndirectedEdge("Simon Pegg","Simon Pegg");
        graph.addUndirectedEdge("Ving Rhames","Ving Rhames");

        // pairs of actors which appeared together in movies
        graph.addUndirectedEdge("Ben Wishaw", "Jeffrey Wright");
        graph.addUndirectedEdge("Ben Wishaw", "Rami Malek");
        graph.addUndirectedEdge("Jeffrey Wright", "Rami Malek");
        graph.addUndirectedEdge("Joseph Mazzallo", "Rami Malek");
        graph.addUndirectedEdge("Nick Frost", "Robert Popper");
        graph.addUndirectedEdge("Nick Frost", "Simon Pegg");
        graph.addUndirectedEdge("Robert Popper", "Simon Pegg");
        graph.addUndirectedEdge("Simon Pegg", "Ving Rhames");

        System.out.println("Adjacency list of the relation");
        graph.printEdges();

        System.out.println("dfs from Ben Wishaw");
        graph.dfs("Ben Wishaw");
        System.out.println("dfs from Rami Malek");
        graph.dfs("Rami Malek");
        System.out.println("dfs from Joseph Mazzallo");
        graph.dfs("Joseph Mazzallo");
        System.out.println("dfs from Jeffrey Wright");
        graph.dfs("Jeffrey Wright");

        System.out.println("dfs from Nick Frost");
        graph.dfs("Nick Frost");
        System.out.println("dfs from Simon Pegg");
        graph.dfs("Simon Pegg");
        System.out.println("dfs from Robert Popper");
        graph.dfs("Robert Popper");
        System.out.println("dfs from Ving Rhames");
        graph.dfs("Ving Rhames");

        // e)
        // all actors are not connected
        // loops are between Ben -> Rami -> Joseph -> Jeffrey
        // and between Nick -> Simon - > Ving -> Robert

//        usingMatrix();
    }

    public static void usingMatrix(){
        AdjMatrix matrix = new AdjMatrix(8);
        matrix.addVertex("Ben Wishaw");
        matrix.addVertex("Jeffrey Wright");
        matrix.addVertex("Joseph Mazzallo");
        matrix.addVertex("Nick Frost");
        matrix.addVertex("Rami Malek");
        matrix.addVertex("Robert Popper");
        matrix.addVertex("Simon Pegg");
        matrix.addVertex("Ving Rhames");

        matrix.addEdge("Ben Wishaw", "Jeffrey Wright");
        matrix.addEdge("Ben Wishaw", "Rami Malek");
        matrix.addEdge("Jeffrey Wright", "Rami Malek");
        matrix.addEdge("Joseph Mazzallo", "Rami Malek");
        matrix.addEdge("Nick Frost", "Robert Popper");
        matrix.addEdge("Nick Frost", "Simon Pegg");
        matrix.addEdge("Robert Popper", "Simon Pegg");
        matrix.addEdge("Simon Pegg", "Ving Rhames");

        System.out.println("\nAdjacency matrix of the relation");
        matrix.printGraph();
    }
}
