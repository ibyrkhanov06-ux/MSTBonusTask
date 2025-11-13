package mst;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MST {
    public int n;                     // number of vertices
    public List<Edge> edges;          // all edges in the graph

    public MST(int n) {
        this.n = n;
        this.edges = new ArrayList<>();
    }

    public void addEdge(int u, int v, int w) {
        edges.add(new Edge(u, v, w));
    }

    public List<Edge> buildMST() {
        Collections.sort(edges);
        UnionFind uf = new UnionFind(n);
        List<Edge> mst = new ArrayList<>();

        for (Edge e : edges) {
            if (uf.find(e.u) != uf.find(e.v)) {
                uf.union(e.u, e.v);
                mst.add(e);
            }
        }
        return mst;
    }
}
