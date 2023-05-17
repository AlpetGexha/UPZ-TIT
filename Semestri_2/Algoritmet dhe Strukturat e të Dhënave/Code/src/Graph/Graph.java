package Graph;

public class Graph {

    public static void main(String[] args) {
        System.out.println("/*********************************** Array ***********************************/");
        Matric_2 graph = new Matric_2();

        graph.addNode(1);
        graph.addNode(3);
        graph.addNode(5);
        graph.addNode(6);
        graph.addNode(8);
        graph.addNode(10);
        graph.addNode(9);

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(0, 3);
        graph.addEdge(0, 4);
        graph.addEdge(0, 5);
        graph.addEdge(1, 2);
        graph.addEdge(1, 0);
        graph.addEdge(1, 3);
        graph.addEdge(2, 0);
        graph.addEdge(2, 1);
        graph.addEdge(2, 3);
        graph.addEdge(3, 2);
        graph.addEdge(3, 0);
        graph.addEdge(3, 4);
        graph.addEdge(4, 0);
        graph.addEdge(4, 3);
        graph.addEdge(4, 5);
        graph.addEdge(4, 6);
        graph.addEdge(5, 0);
        graph.addEdge(5, 4);
        graph.addEdge(6, 4);

        System.out.println("Graph:");
        graph.printGraph();
        System.out.println();

        int[][] matrix = graph.convertToMatrix();

        System.out.println("\nMatrix:");
        graph.printMatrix(matrix);

        int nodeWithMostEdges = graph.findNodeWithMostEdges();
        System.out.println("\nNode me em shumë edges: " + nodeWithMostEdges);

        System.out.println("/*********************************** LIST ***********************************/");

        List list = new List();

        list.addEdge(0, 1);
        list.addEdge(0, 2);
        list.addEdge(0, 3);
        list.addEdge(0, 4);
        list.addEdge(0, 5);
        list.addEdge(1, 2);
        list.addEdge(1, 0);
        list.addEdge(1, 3);
        list.addEdge(2, 0);
        list.addEdge(2, 1);
        list.addEdge(2, 3);
        list.addEdge(3, 2);
        list.addEdge(3, 0);
        list.addEdge(3, 4);
        list.addEdge(4, 0);
        list.addEdge(4, 3);
        list.addEdge(4, 5);
        list.addEdge(4, 6);
        list.addEdge(5, 0);
        list.addEdge(5, 4);
        list.addEdge(6, 4);

        list.printGraph();

        System.out.println("\nNode me em shumë edges: " + list.findNodeWithMostEdges());
    }
}
