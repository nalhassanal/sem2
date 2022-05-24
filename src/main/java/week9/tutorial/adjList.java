package week9.tutorial;
import java.util.LinkedList;
public class adjList {
    static class Graph <T>{
        class Edge <E>{
            E vertex, weight;
            public Edge(E vertex, E weight){
                this.vertex = vertex;
                this.weight = weight;
            }

            @Override
            public String toString(){
                return "( " + vertex +", " + weight +" )";
            }
        }
        private LinkedList <Edge<T>> [] ls;
        public Graph(int size){
            ls = new LinkedList[size];
            for (int i = 0; i < size; i++)
                ls[i] = new LinkedList<>();
        }

        public void addEdge(T src, T dst, T weight){
            ls[(Integer)src].add(0, new Edge<>(dst, weight));
        }

        @Override
        public String toString(){
            String result = "";
            for (int i = 0 ; i < ls.length; i++)
                result += i + "=> " +ls[i] + "\n";
            return result;
        }
    }

    public static void main(String[] args) {
        Graph<Integer> G = new Graph<>(7);

        G.addEdge(0, 2, 5);
        G.addEdge(2, 5, 9);
        G.addEdge(1, 2, 2);
        G.addEdge(3, 6, 4);
        G.addEdge(3, 3, 2);
        G.addEdge(5, 1, 3);
        G.addEdge(6, 5, 8);
        G.addEdge(4, 5, 7);

        System.out.println(G);
    }
}
