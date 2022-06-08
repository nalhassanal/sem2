package week12.lab.test3a;

import java.util.ArrayList;
import java.util.Stack;

public class UnweightedGraph <T extends Comparable<T>> extends WeightedGraph<T, Integer> {

    public boolean addEdge(T src, T dst){
        return super.addEdge(src, dst, null);
    }

    public boolean addUndirectedEdge(T src, T dst){
        return super.addUndirectedEdge(src, dst, null);
    }

    public void dfs(T source){
        Stack<T> stack = new Stack<>();
        ArrayList<T> adjVertex = super.getNeighbours(source);
        boolean [] isVisted = new boolean[adjVertex.size()];
        stack.push(source);
        while (!stack.isEmpty()){
            T current = stack.pop();
            if (!isVisted[adjVertex.indexOf(current)]){
                isVisted[adjVertex.indexOf(current)] = true;
                System.out.print(current + " , ");

                for(T dst : adjVertex){
                    if (!isVisted[adjVertex.indexOf(dst)])
                        stack.push(dst);
                }
            }
        }
        System.out.println();
    }

}
