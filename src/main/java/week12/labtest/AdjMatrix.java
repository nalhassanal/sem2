package week12.labtest;

import java.util.ArrayList;

public class AdjMatrix {
    private ArrayList<String> vertices;
    private int [][] matrix;

    public AdjMatrix(int size){
        matrix = new int[size][size];
        vertices = new ArrayList<>();
    }

    public void addVertex (String vertex){
        vertices.add(vertex);
    }

    public void addEdge(String source, String destination){
        matrix[vertices.indexOf(source)][vertices.indexOf(destination)] = 1;
        matrix[vertices.indexOf(destination)][vertices.indexOf(source)] = 1;
        matrix[vertices.indexOf(source)][vertices.indexOf(source)] = 1;
        matrix[vertices.indexOf(destination)][vertices.indexOf(destination)] = 1;

    }

    public void printGraph(){
        System.out.print("\t\t\t");
        for(String vertex: vertices){
            System.out.print(vertex + "|");
        }
        System.out.println();
        for(int i = 0; i < vertices.size(); i++){
            System.out.printf("%-15s | ", vertices.get(i));
            for (int j = 0; j < vertices.size(); j++) {
                System.out.print(matrix[i][j] + " | ");
            }
            System.out.println();
        }
    }

}