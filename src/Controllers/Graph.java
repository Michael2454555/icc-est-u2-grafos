package Controllers;

import java.util.HashSet;
import java.util.Set;

import Models.Node;

public class Graph {
    private Set<Node> nodes;

    public Graph() {
        this.nodes = new HashSet<>();
    }

    // Añadir un nodo
    public Node addNode(int value) {
        Node newNode = new Node(value);
        nodes.add(newNode);
        return newNode;
    }

    // Añadir una Arista/Conexion
    public void addEdge(Node src, Node dest) {
        src.addNeighboard(dest);
        dest.addNeighboard(src);
    }

    public void addEdgeUni(Node src, Node dest) {
        src.neighboards.add(dest);
    }

    public void printGraph() {
        for (Node node : nodes) {
            Set<Node> newSet = node.getNeighboards();
            System.out.println("Vertex:"+node.getValue());
            for (Node node2 : newSet) {
                System.out.print(node2.getValue()+ "-->");
            }
        }

    }

    public void getDFS(Node startNode) {

    }

    private void getDFSUtil(Node node, boolean[] visited) {

    }

    public void getBFS(Node startNode) {

    }

    public int[][] getAdjacencyMatrix() {
        return null;
    }

    public void printAdjacencyMatrix() {

    }

}