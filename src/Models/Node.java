package Models;

import java.util.Set;
import java.util.TreeSet;

public class Node implements Comparable<Node> {
    private int value;
    public Set<Node> neighboards;

    public Node(int value) {
        this.value = value;
        this.neighboards = new TreeSet<>();
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Set<Node> getNeighboards() {
        return neighboards;
    }

    public void setNeighboards(Set<Node> neighboards) {
        this.neighboards = neighboards;
    }

    public Node addNeighboard(Node node) {
        this.neighboards.add(node);
        return this;

    }

    @Override
    public String toString() {
        return "Node [value=" + value + ", neighboards=" + neighboards + "]";
    }

    @Override
    public int compareTo(Node o) {
        return Integer.compare(this.value, o.value);

    }

}
