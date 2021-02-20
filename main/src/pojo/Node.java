package pojo;

import java.util.ArrayList;
import java.util.Objects;

public class Node {

    private String name;             //Name of nodes
    private ArrayList<Node> child;

    public String getName(){
        return name;
    }

    public ArrayList<Node> getChild(){
        return child;
    }

    public void setName(String name){
        this.name = name;
    }

    public void addChild(Node node)
    {
        if(child==null) child = new ArrayList<>();
        child.add(node);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Node node = (Node) o;
        return name.equals(node.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
