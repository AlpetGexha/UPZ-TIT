package Java_14_Graph;

import java.util.LinkedList;
import java.util.Stack;

public class Graph {

    Vertex[] vertices;
    int[][] adjacencyMatrix;
    int maxSize, size;
    Stack<Integer> stack;
    LinkedList<Integer> queue;
    public Graph(int max) {
        maxSize = max;
        size = 0;
        vertices = new Vertex[maxSize];
        adjacencyMatrix = new int[maxSize][maxSize];

        stack = new Stack<>();
        queue = new LinkedList<>();
    }

    public boolean isFull() {
        return (size == maxSize);
    }

    public void addVertex(char v) {
        if (isFull())
            System.out.println("Nuk ka vend te lire per nyje te re!");
        else {
            //ka hapesire te pakten edhe per nje nyje te re
//			Vertex n = new Vertex(v);
//			vertices[size] = n;
//			size++;
            //OSE
            vertices[size++] = new Vertex(v);
        }
    }

    public void addEdge(int i, int j) {
        if (i >= 0 && i < size && j >= 0 && j < size) {
            adjacencyMatrix[i][j] = 1;
            adjacencyMatrix[j][i] = 1;
        } else
            System.out.println("Indeksi nuk eshte valid!");
    }

    public void displayVertex(int v) {
        if (v >= 0 && v < size)
            System.out.print(vertices[v].value);
        else
            System.out.println("Indeksi nuk eshte valid!");
    }

    public int getAdjUnvisitedVertex(int i) {
        if (i < 0 || i >= size)
            return -1;
        for (int j = 0; j < size; j++) {
            if (adjacencyMatrix[i][j] == 1 && !vertices[j].wasVisted)
                return j;
        }
        return -1;
    }

    public void dfs() {
        //se pari selektojme nyjen startuese dhe kryejme procesin 3-hapesh
        //1. vizito nyjen
        //2. sheno ate si te vizituar
        //3. shtoje ate ne stack
        System.out.print("DFS: ");
        displayVertex(0);
        vertices[0].wasVisted = true;
        stack.push(0);
        while (!stack.isEmpty()) {
            int a = getAdjUnvisitedVertex(stack.peek());
            if (a == -1)
                stack.pop();
            else {
                displayVertex(a);
                vertices[a].wasVisted = true;
                stack.push(a);
            }
        }

        for (int i = 0; i < size; i++)
            vertices[i].wasVisted = false;
        System.out.println();
    }

    //Algoritmet e kerkimit ne graf
    //DFS & BFS

    public void bfs() {
        //se pari selektojme nyjen startuese dhe kryejme procesin 3-hapesh
        //1. vizito nyjen
        //2. sheno ate si te vizituar
        //3. shtoje ate ne queue
        System.out.print("BFS: ");
        displayVertex(0);
        vertices[0].wasVisted = true;
        queue.addLast(0);
        while (!queue.isEmpty()) {
            int a = queue.removeFirst();
            int v;
            while ((v = getAdjUnvisitedVertex(a)) != -1) {
                displayVertex(v);
                vertices[v].wasVisted = true;
                queue.addLast(v);
            }
        }

        for (int i = 0; i < size; i++)
            vertices[i].wasVisted = false;
        System.out.println();
    }

    public class Vertex {
        char value;
        boolean wasVisted;

        public Vertex(char v) {
            value = v;
            wasVisted = false;
        }
    }
}
