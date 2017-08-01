import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static class Graph {
        private static int EDGE_DISTANCE = 6;
        private Node[] nodes;

        private class Node {
            private ArrayList<Integer> neighbors;
            public int data;
            public Node(int data) {
                this.data = data;
                neighbors = new ArrayList<Integer>();
            }
        }

        public Graph(int size) {
            nodes = new Node[size];
            for(int i = 0; i < size; i++)
                nodes[i] = new Node(i);
        }

        public Node getNode(int id) {
            return nodes[id];
        }

        public void addEdge(int first, int second) {
            nodes[first].neighbors.add(second);
            nodes[second].neighbors.add(first);
        }

        public int[] shortestReach(int startId) { //DFS
            LinkedList<Integer> queue = new LinkedList<Integer>();
            queue.add(startId);

            int[] paths = new int[nodes.length];
            Arrays.fill(paths, -1);
            paths[startId] = 0;

            while(!queue.isEmpty()) {
                int current = queue.poll();
                for(int neighbor : nodes[current].neighbors) {
                    if(paths[neighbor] == -1) { // not visited yet
                        paths[neighbor] = paths[current] + EDGE_DISTANCE;
                        queue.add(neighbor);
                    }
                }
            }
            return paths;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int queries = scanner.nextInt();

        for (int t = 0; t < queries; t++) {

            // Create a graph of size n where each edge weight is 6:
            Graph graph = new Graph(scanner.nextInt());
            int m = scanner.nextInt();

            // read and set edges
            for (int i = 0; i < m; i++) {
                int u = scanner.nextInt() - 1;
                int v = scanner.nextInt() - 1;

                // add each edge to the graph
                graph.addEdge(u, v);
            }

            // Find shortest reach from node s
            int startId = scanner.nextInt() - 1;
            int[] distances = graph.shortestReach(startId);

            for (int i = 0; i < distances.length; i++) {
                if (i != startId) {
                    System.out.print(distances[i]);
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        scanner.close();
    }
}
