package pizza;
import java.util.*;

class dij {
    static class ListNode {
        int vertex, weight;
        ListNode(int v, int w) {
            vertex = v;
            weight = w;
        }
        int getVertex() {
            return vertex;
        }
        int getWeight() {
            return weight;
        }
    }
    public static int[] dijkstra(int V, ArrayList<ArrayList<ListNode>> graph,int src) {
        int[] distance = new int[V];
        for (int i = 0; i < V; i++) {
            distance[i] = Integer.MAX_VALUE;
        }
        distance[src] = 0;

        PriorityQueue<ListNode> pq = new PriorityQueue<>((v1, v2) -> v1.getWeight() - v2.getWeight());
        pq.add(new ListNode(src, 0));

        while (!pq.isEmpty()) {
            ListNode current = pq.poll();
            for (ListNode n : graph.get(current.getVertex())) {
                if (distance[current.getVertex()] + n.getWeight() < distance[n.getVertex()]) {
                    distance[n.getVertex()] = n.getWeight() + distance[current.getVertex()];
                    pq.add(new ListNode(n.getVertex(),distance[n.getVertex()]));
                }
            }
        }
        return distance;
    }

    
    public static int draw(int s){
        int V = 6;
        ArrayList<ArrayList<ListNode>> graph = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            graph.add(new ArrayList<>());
        }
        int source = 0;
        graph.get(0).add(new ListNode(1, 10));
        graph.get(0).add(new ListNode(4, 15));
        graph.get(1).add(new ListNode(1, 20));
        graph.get(1).add(new ListNode(4, 30));
        graph.get(1).add(new ListNode(0, 40));
        graph.get(2).add(new ListNode(1, 15));
        graph.get(2).add(new ListNode(5, 80));
        graph.get(2).add(new ListNode(5, 70));
        graph.get(2).add(new ListNode(3, 10));
        graph.get(3).add(new ListNode(2, 30));
        graph.get(3).add(new ListNode(5, 40));
        graph.get(3).add(new ListNode(0, 10));
        graph.get(4).add(new ListNode(2, 20));
        graph.get(4).add(new ListNode(3, 30));
        graph.get(4).add(new ListNode(4, 20));
        graph.get(5).add(new ListNode(5, 60));
        graph.get(5).add(new ListNode(3, 30));
        graph.get(5).add(new ListNode(0, 20));

        int[] distance = dijkstra(V, graph, source);
        return distance[s];
    }
}
