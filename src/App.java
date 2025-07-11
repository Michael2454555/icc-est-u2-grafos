import Models.Node;

import Controllers.Graph;

public class App {
    public static void main(String[] args) throws Exception {
        Graph grafo1 = new Graph();
        Node n0 = grafo1.addNode(0);
        Node n1 = grafo1.addNode(1);
        Node n2 = grafo1.addNode(2);
        Node n3 = grafo1.addNode(3);
        Node n4 = grafo1.addNode(4);
        Node n5 = grafo1.addNode(5);
        Node n7 = grafo1.addNode(7);
        Node n8 = grafo1.addNode(8);
        Node n9 = grafo1.addNode(9);
        grafo1.addEdge(n0, n5);
        grafo1.addEdge(n0, n3);
        grafo1.addEdge(n0, n1);
        grafo1.addEdge(n0, n5);
        grafo1.addEdge(n2, n1);
        grafo1.addEdge(n2, n3);
        grafo1.addEdge(n1, n4);
        grafo1.addEdge(n3, n4);
        grafo1.addEdge(n3, n9);
        grafo1.addEdge(n3, n7);
        grafo1.addEdge(n8, n7);
        grafo1.addEdge(n1, n8);
        grafo1.printGraph();

    }
}
