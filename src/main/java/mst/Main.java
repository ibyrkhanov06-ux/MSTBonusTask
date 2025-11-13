package mst;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Example graph with 6 vertices
        MST graph = new MST(6);

        graph.addEdge(0, 1, 4);
        graph.addEdge(0, 2, 3);
        graph.addEdge(1, 2, 1);
        graph.addEdge(1, 3, 2);
        graph.addEdge(2, 3, 4);
        graph.addEdge(3, 4, 2);
        graph.addEdge(4, 5, 6);

        // 1. Build MST
        List<Edge> mst = graph.buildMST();

        System.out.println("Original MST:");
        for (Edge e : mst) System.out.println(e);

        // 2. Remove one edge
        Edge removed = mst.remove(0);
        System.out.println("\nRemoved edge:");
        System.out.println(removed);

        // 3. Build connectivity after removal
        UnionFind uf = new UnionFind(graph.n);
        for (Edge e : mst) {
            uf.union(e.u, e.v);
        }

        // 4. Find replacement edge
        Edge replacement = null;

        for (Edge e : graph.edges) {
            int cu = uf.find(e.u);
            int cv = uf.find(e.v);

            if (cu != cv) { // connects two components
                if (replacement == null || e.weight < replacement.weight) {
                    replacement = e;
                }
            }
        }

        // 5. Add replacement edge
        mst.add(replacement);

        System.out.println("\nReplacement edge:");
        System.out.println(replacement);

        System.out.println("\nNew MST:");
        for (Edge e : mst) System.out.println(e);
    }
}
