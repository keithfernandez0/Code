package Java.year2.semester1.graphs;
// GraphRepresentation.java

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class GraphRepresentation {

    public static void main(String[] args) {
        Integer[] vertices = {0, 1, 2, 3, 4};
        int[][] edges = {{0, 1}, {0, 2}, {1, 4}, {2, 4}, {3, 4}};

        // Edge Array Representation
        int[][] edgesArray = {{0, 1}, {0, 2}, {1, 4}, {2, 4}, {3, 4}};

        // ArrayList of Edge Objects Representation
        List<Edge> edgesList = new ArrayList<>();
        for (int[] edge : edgesArray) {
            edgesList.add(new Edge(edge[0], edge[1]));
        }

        // Adjacency Matrix Representation
        int[][] adjacencyMatrix = new int[vertices.length][vertices.length];
        for (int[] edge : edgesArray) {
            adjacencyMatrix[edge[0]][edge[1]] = 1;
            adjacencyMatrix[edge[1]][edge[0]] = 1;
        }

        // Adjacency List Representation
        List<Integer>[] adjacencyList = new List[vertices.length];
        for (int i = 0; i < vertices.length; i++) {
            adjacencyList[i] = new ArrayList<>();
        }

        for (int[] edge : edgesArray) {
            adjacencyList[edge[0]].add(edge[1]);
            adjacencyList[edge[1]].add(edge[0]);
        }

        // Perform BFS and DFS on the graph
        UnweightedGraph<Integer> graph = new UnweightedGraph<>(vertices, edges);
        ArrayList<Integer> bfsResult = graph.bfs(0);
        ArrayList<Integer> dfsResult = graph.dfs(0);

        // Display results
        System.out.println("Edge Array Representation: ");
        printArray(edgesArray);

        System.out.println("\nArrayList of Edge Objects Representation: ");
        edgesList.forEach(edge -> System.out.println(edge.u + " " + edge.v));

        System.out.println("\nAdjacency Matrix Representation: ");
        printArray(adjacencyMatrix);

        System.out.println("\nAdjacency List Representation: ");
        printList(adjacencyList);

        System.out.println("\nBFS Result: " + bfsResult);
        System.out.println("DFS Result: " + dfsResult);
    }

    private static void printArray(int[][] array) {
        for (int[] row : array) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

    private static void printList(List<Integer>[] list) {
        for (int i = 0; i < list.length; i++) {
            System.out.print(i + ": ");
            for (int value : list[i]) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}

class Edge {
    int u;
    int v;

    public Edge(int u, int v) {
        this.u = u;
        this.v = v;
    }
}


class Edge {
    int u;
    int v;

    public Edge(int u, int v) {
        this.u = u;
        this.v = v;
    }
}

