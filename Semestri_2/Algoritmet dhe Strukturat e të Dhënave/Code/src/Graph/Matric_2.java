package Graph;

import java.util.ArrayList;
import java.util.List;

public class Matric_2 {
    private final List<Node> nodes;
    private final List<Edge> edges;

    public Matric_2() {
        nodes = new ArrayList<>();
        edges = new ArrayList<>();
    }

    public void addNode(int value) {
        nodes.add(new Node(value));
    }


    public void addEdge(int sourceIndex, int destinationIndex) {
        if (isValidRange(sourceIndex, destinationIndex)) {
            edges.add(new Edge(nodes.get(sourceIndex), nodes.get(destinationIndex)));
        }
    }

    public int[][] convertToMatrix() {
        int[][] matrix = new int[nodes.size()][nodes.size()];

        for (Edge edge : edges) {
            int sourceIndex = nodes.indexOf(edge.getSource());
            int destinationIndex = nodes.indexOf(edge.getDestination());

            if (sourceIndex != -1 && destinationIndex != -1) {
                matrix[sourceIndex][destinationIndex] = 1;
            }
        }

        return matrix;
    }

    public int findNodeWithMostEdges() {
        int max = 0;
        int nodeValue = 0;

        for (Node node : nodes) {
            int count = 0;
            for (Edge edge : edges) {
                if (edge.getSource() == node) {
                    count++;
                }
            }
            if (count > max) {
                max = count;
                nodeValue = node.getValue();
            }
        }

        System.out.print(max + " edges -> ");
        return nodeValue;
    }

    public void printGraph() {
        for (Node node : nodes) {
            System.out.print(node.getValue() + " -> ");
            for (Edge edge : edges) {
                if (edge.getSource() == node) {
                    System.out.print(edge.getDestination().getValue() + " ");
                }
            }
            System.out.println();
        }
    }

    public void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }

    private boolean isValidRange(int sourceIndex, int destinationIndex) {
        return sourceIndex >= 0 && sourceIndex < nodes.size() &&
                destinationIndex >= 0 && destinationIndex < nodes.size();
    }

    private static class Node {
        private final int value;

        public Node(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

    private static class Edge {
        private final Node source;
        private final Node destination;

        public Edge(Node source, Node destination) {
            this.source = source;
            this.destination = destination;
        }

        public Node getSource() {
            return source;
        }

        public Node getDestination() {
            return destination;
        }
    }
}
