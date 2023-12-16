package Java.year2.semester1.graphs;

public class GraphLab {

    public static void main(String[] args) 
    {
        // DEFINE NUMBER OF VERTICES
        int numVertices = 5;

        // CREATE ARRAY FOR VERTICES
        Integer[] vertices = new Integer[numVertices];
        for (int i = 0; i < numVertices; i++) vertices[i] = i;

        // CREATE ADJACENCY MATRIX
        int[][] adjacencyMatrix = new int[numVertices][numVertices];

        // DEFINE EDGES
        int[][] edges = {{0, 1}, {0, 2}, {1, 3}, {2, 4}, {3, 4}};

        // POPULATE ADJACENCY MATRIX BASED ON EDGES
        for (int[] edge : edges) 
        {
            int src = edge[0], dest = edge[1];
            adjacencyMatrix[src][dest] = 1;
            adjacencyMatrix[dest][src] = 1; // UNDIRECTED GRAPH
        }

        // PRINT ADJACENCY MATRIX
        System.out.println("ADJACENCY MATRIX:");
        for (int i = 0; i < numVertices; i++) 
        {
            for (int j = 0; j < numVertices; j++) System.out.print(adjacencyMatrix[i][j] + " ");
            System.out.println();
        }

    }
}

