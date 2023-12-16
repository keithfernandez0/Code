package Java.year2.semester1.graphs;
// GraphTraversal.java
package Java.year2.semester1.graphs;

import java.util.ArrayList;

public class GraphTraversal {

    public static void main(String[] args) {
        int n = 5; // NUMBER OF VERTICES

        Integer[] v = new Integer[n]; // ARRAY FOR VERTICES
        for (int i = 0; i < n; i++) v[i] = i;

        int[][] aM = new int[n][n]; // ADJACENCY MATRIX

        int[][] e = {{0, 1}, {0, 2}, {1, 4}, {2, 4}, {3, 4}}; // EDGES

        for (int[] edge : e) { // POPULATE ADJACENCY MATRIX BASED ON EDGES
            int s = edge[0], d = edge[1];
            aM[s][d] = 1;
            aM[d][s] = 1; // UNDIRECTED GRAPH
        }

        UnweightedGraph<Integer> g = new UnweightedGraph<>(v, e); // CREATE GRAPH INSTANCE

        ArrayList<Integer> dfsR = g.dfs(0); // DFS TRAVERSAL
        ArrayList<Integer> bfsR = g.bfs(0); // BFS TRAVERSAL

        System.out.println("DFS Result: " + dfsR); // PRINT RESULTS
        System.out.println("BFS Result: " + bfsR);
    }
}

