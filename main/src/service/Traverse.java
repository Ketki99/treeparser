package service;

import pojo.Node;

import java.util.LinkedHashSet;
import java.util.Set;

public class Traverse {

    public Set<Node> accessTo(Node root){
        Set<Node> S = new LinkedHashSet<>();
        accessTo(root,S);
        return S;
    }

    public void accessTo(Node root, Set S) {
        if (root.getChild() == null) {
            S.add(root);
            return;
        }

        S.add(root);
        for(Node i: root.getChild()) {
            accessTo(i, S);
        }
    }

}
