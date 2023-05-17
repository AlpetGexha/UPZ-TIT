package Graph;

public class Matric {
    public static void main(String[] args) {

//       G(N,E)
//        N - nodes (Vetex)
//        E - edges

        int[] nodes = {1, 3, 5, 6, 8, 10, 9};

        int[][] edges = {
                {1, 3},
                {1, 5},
                {1, 6},
                {1, 8},
                {1, 10},

                {3, 5},
                {3, 1},
                {3, 6},

                {5, 1},
                {5, 3},
                {5, 6},

                {6, 5},
                {6, 1},
                {6, 8},

                {8, 1},
                {8, 6},
                {8, 10},
                {8, 9},

                {10, 1},
                {10, 8},

                {9, 8}
        };


        System.out.println("Graph: ");
        printGraph(nodes, edges);
        System.out.println();

//        System.out.println("nodes: "    + nodes.length);
//        System.out.println("edges: "    + edges.length);

        int[][] matrix = makeMatrix2(nodes, edges);

        System.out.println("\nMatrix: ");
        printMatrix(matrix);


        int node = findNodeWithMostEdges(nodes, edges);
        System.out.println("\nNode me më shumë edges: " + node);

    }

    /**
     * Krijimi i Matrices bazuar në nodes dhe edges
     *
     * @param nodes - nodes
     * @param edges - edges
     * @return matricën Simetrike (NxN) e cila përmban 1 nëse nodes[i] dhe nodes[j] janë të lidhura, 0 nëse jo
     */


    public static int[][] makeMatrix(int[] nodes, int[][] edges) {
        int[][] matrix = new int[nodes.length][nodes.length]; // krijimi i matricës

        for (int i = 0; i < nodes.length; i++) {
            for (int j = 0; j < edges.length; j++) {
//                Shiko nëse ka ndonjë lidhje mes nodes[i] dhe edges[j][0] (edge qe fillona a eshte e njejt me node)
                if (edges[j][0] == nodes[i])

                    for (int k = 0; k < nodes.length; k++) {
                        if (nodes[k] == edges[j][1]) { // shiko nese ka ndonje lidhje mes nodes[k] dhe edges[j][1] (edge qe perfundon a eshte e njejt me node)
                            matrix[i][k] = 1; // nese po, atehere vendos 1 ne poziten [i][k] (sepse jane te lidhura)
                        }
                    }
            }
        }

        return matrix;
    }


    public static int[][] makeMatrix2(int[] nodes, int[][] edges) {
        int[][] matrix = new int[nodes.length][nodes.length];

        for (int i = 0; i < edges.length; i++) {
//          [4,5]
            int source = edges[i][0]; // 4
            int destination = edges[i][1];// 5

            int sourceIndex = findIndex(nodes, source);
            int destinationIndex = findIndex(nodes, destination);

//          Nese sourceIndex dhe destinationIndex jane te gjetura ne 'nodes' array, atehere vendos 1 ne matrix
            if (sourceIndex != -1 && destinationIndex != -1) { // shiko nese jane te gjetura (eksistojn)
                matrix[sourceIndex][destinationIndex] = 1;
            }
        }

        return matrix;
    }


    /**
     * Gjeje node qe ka më se shumit edges (lidhje)
     * <p>
     * Se pari e llogarit sa lidhje i ka nyja e par (nodes[0]) dhe e vendos ne max
     * Pastaj e krahason me lidhjet e nyjeve tjera dhe nese ndonjera nga ato ka me shume lidhje se max, atehere i zevendeson numrat
     *
     * @param nodes - nodes
     * @param edges - edges
     * @return (int) node me më shumë edges
     */

    public static int findNodeWithMostEdges(int[] nodes, int[][] edges) {
        int max = 0;
        int node = 0;

        for (int i = 0; i < nodes.length; i++) {
            int count = 0;
            for (int j = 0; j < edges.length; j++) {
                if (edges[j][0] == nodes[i]) {
                    count++;
                }
            }

            if (count > max) {
                max = count;
                node = nodes[i];
            }
        }

        System.out.print(max + " edges -> ");
        return node;
    }


    public static void printGraph(int[] nodes, int[][] edges) {
        for (int i = 0; i < nodes.length; i++) {
            System.out.print(nodes[i] + " -> ");
            for (int j = 0; j < edges.length; j++) {
                if (edges[j][0] == nodes[i]) {
                    System.out.print(edges[j][1] + " ");
                }
            }
            System.out.println();
        }
    }


    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }


    /**
     * Gjej indeksin elementin e kerkuar ne Node
     *
     * @param nodes  - nodes
     * @param target - elementi qe po kerkohet
     * @return (int) index i elementit te kerkuar
     */
    private static int findIndex(int[] nodes, int target) {
        for (int i = 0; i < nodes.length; i++) {
            if (nodes[i] == target) {
                return i;
            }
        }
        return -1;
    }


//    public static void addEdge(int[][] edges, int source, int destination) {
//        int[] newEdge = {source, destination};
//        edges[edges.length - 1] = newEdge;
//    }
//
//    public static void removeEdge(int[][] edges, int source, int destination) {
//        for (int i = 0; i < edges.length; i++) {
//            if (edges[i][0] == source && edges[i][1] == destination) {
//                edges[i][0] = 0;
//                edges[i][1] = 0;
//            }
//        }
//    }

}
