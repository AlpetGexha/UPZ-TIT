package Java_14_Graph;

public class App2 {

    public static void main(String[] args) {
        Graph g = new Graph(9);
        g.addVertex('A'); //0
        g.addVertex('B'); //1
        g.addVertex('C'); //2
        g.addVertex('D'); //3
        g.addVertex('E'); //4
        g.addVertex('F'); //5
        g.addVertex('G'); //6
        g.addVertex('H'); //7
        g.addVertex('I'); //8

        g.addEdge(0, 1); //AB
        g.addEdge(0, 3); //AD
        g.addEdge(1, 2); //BC
        g.addEdge(1, 4); //BE
        g.addEdge(2, 3); //CD
        g.addEdge(2, 4); //CE
        g.addEdge(2, 5); //CF
        g.addEdge(2, 6); //CG
        g.addEdge(3, 8); //DI
        g.addEdge(4, 5); //EF
        g.addEdge(5, 7); //FH
        g.addEdge(6, 7); //GH
        g.addEdge(6, 8); //GI
        g.addEdge(7, 8); //HI

        g.dfs();
        g.bfs();
    }
}