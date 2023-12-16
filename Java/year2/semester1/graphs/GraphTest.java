package Java.year2.semester1.graphs;
import java.util.List;

public class GraphTest {
    public static void main(String[] args) {
        List<Integer> vertices = List.of(0, 1, 2, 3, 4);
        int[][] edges = {{0, 1}, {0, 2}, {1, 4}, {2, 4}, {3, 4}};

        UnweightedGraph<Integer> graph = new UnweightedGraph<>(vertices, edges);

        System.out.println("BFS traversal: " + graph.bfs(0));
        System.out.println("DFS traversal: " + graph.dfs(0));
    }
}
