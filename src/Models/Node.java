 
package Models;

import java.util.HashSet;
import java.util.Set;

public class Node {
    private int value;
    public Set<Node> neighboards;

    public Node(int value) {
        this.value = value;
        this.neighboards = new HashSet<>();
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

}