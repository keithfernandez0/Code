// UnweightedGraph.java
package Java.year2.semester1.graphs;
import java.util.ArrayList;
import java.util.List;

class UnweightedGraph<V> {
    private List<V> vertices;
    private List<List<Integer>> adjacencyList;

    public UnweightedGraph(List<V> vertices, int[][] edges) {
        this.vertices = vertices;
        createAdjacencyList(edges);
    }

    private void createAdjacencyList(int[][] edges) {
        adjacencyList = new ArrayList<>(vertices.size());

        for (int i = 0; i < vertices.size(); i++) {
            adjacencyList.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
            int source = edge[0];
            int destination = edge[1];
            adjacencyList.get(source).add(destination);
            adjacencyList.get(destination).add(source); // For undirected graph
        }
    }

    public List<Integer> bfs(int startVertex) {
        List<Integer> result = new ArrayList<>();
        boolean[] visited = new boolean[vertices.size()];
        java.util.Queue<Integer> queue = new java.util.LinkedList<>();

        queue.offer(startVertex);
        visited[startVertex] = true;

        while (!queue.isEmpty()) {
            int currentVertex = queue.poll();
            result.add(currentVertex);

            for (int neighbor : adjacencyList.get(currentVertex)) {
                if (!visited[neighbor]) {
                    queue.offer(neighbor);
                    visited[neighbor] = true;
                }
            }
        }

        return result;
    }

    public List<Integer> dfs(int startVertex) {
        List<Integer> result = new ArrayList<>();
        boolean[] visited = new boolean[vertices.size()];
        dfsRecursive(startVertex, visited, result);
        return result;
    }

    private void dfsRecursive(int currentVertex, boolean[] visited, List<Integer> result) {
        visited[currentVertex] = true;
        result.add(currentVertex);

        for (int neighbor : adjacencyList.get(currentVertex)) {
            if (!visited[neighbor]) {
                dfsRecursive(neighbor, visited, result);
            }
        }
    }
}