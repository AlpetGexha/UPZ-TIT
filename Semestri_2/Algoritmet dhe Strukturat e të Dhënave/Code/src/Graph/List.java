package Graph;

import java.util.LinkedList;

public class List {
    private final LinkedList<Node> nodes;
    private final LinkedList<LinkedList<Node>> List;

    public List() {
        nodes = new LinkedList<>();
        List = new LinkedList<>();
    }

    public void addEdge(int source, int destination) {
        Node sourceNode = getNode(source);
        Node destinationNode = getNode(destination);

        if (sourceNode == null) {
            sourceNode = new Node(source);
            nodes.add(sourceNode);
            List.add(new LinkedList<>());
        }

        if (destinationNode == null) {
            destinationNode = new Node(destination);
            nodes.add(destinationNode);
            List.add(new LinkedList<>());
        }

        LinkedList<Node> sourceList = List.get(nodes.indexOf(sourceNode));
        LinkedList<Node> destinationList = List.get(nodes.indexOf(destinationNode));

        if (!sourceList.contains(destinationNode))
            sourceList.add(destinationNode);


        if (!destinationList.contains(sourceNode))
            destinationList.add(sourceNode);

    }

    public void printGraph() {
        for (int i = 0; i < nodes.size(); i++) {
            Node node = nodes.get(i);
            LinkedList<Node> list = List.get(i);

            System.out.print("Node " + node.getValue() + " -> ");
            for (Node neighbor : list) {
                System.out.print(neighbor.getValue() + " ");
            }
            System.out.println();
        }
    }

    public int findNodeWithMostEdges() {
        int max = 0;
        int nodeValue = 0;

        for (Node node : nodes) {
            int count = 0;
            for (LinkedList<Node> list : List) {
                if (list.contains(node)) {
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

    private Node getNode(int value) {
        for (Node node : nodes) {
            if (node.getValue() == value) {
                return node;
            }
        }
        return null;
    }

//    Mundemi edhe te mos e perdorim node, por te perdorim direkt int, pra te kthejme int
    private static class Node {
        private final int value;

        public Node(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

}
