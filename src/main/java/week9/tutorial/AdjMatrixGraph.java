package week9.tutorial;

public class AdjMatrixGraph {
    private int vertices;
    private int [][] matrix;

    public AdjMatrixGraph(int vertices){
        this.vertices = vertices;
        matrix = new int[vertices][vertices];
    }

    public void addEdge(int source, int destination){
        matrix[source][destination] = 1;
        matrix[destination][source] = 1;
    }

    public void printGraph(){
        for(int i = 0; i < vertices; i++){
            System.out.print("|");
            for (int j = 0; j < vertices; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.print("|");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        AdjMatrixGraph amg = new AdjMatrixGraph(5);
        amg.addEdge(1, 0);
        amg.addEdge(0, 4);
        amg.addEdge(3, 2);

        amg.printGraph();
    }
}
