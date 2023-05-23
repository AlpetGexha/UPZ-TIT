package Java_14_Graph;

public class App {

    public static void main(String[] args) {
        Graph g = new Graph(8);
        g.addVertex('A'); //0
        g.addVertex('B'); //1
        g.addVertex('C'); //2
        g.addVertex('D'); //3
        g.addVertex('E'); //4
        g.addVertex('F'); //5
        g.addEdge(0, 1); //AB
        g.addEdge(0, 3); //AD
        g.addEdge(1, 2); //BC
        g.addEdge(1, 4); //BE
        g.addEdge(2, 3); //CD
        g.addEdge(2, 4); //CE
        g.addEdge(2, 5); //CF
        g.addEdge(4, 5); //EF

        System.out.print("display vertex: ");
        g.displayVertex(2); //C
        System.out.println();
        g.dfs();
        g.bfs();
    }
}
