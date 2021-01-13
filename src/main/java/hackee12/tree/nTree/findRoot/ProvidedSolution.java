package hackee12.tree.nTree.findRoot;

import hackee12.tree.nTree.Node;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ProvidedSolution {

    public Node findRoot(List<Node> tree) {
        // set that contains all the child nodes.
        Set<Integer> seen = new HashSet<>();

        // add all the child nodes into the set
        for (Node node : tree) {
            for (Node child : node.children)
                // we could either add the value or the node itself.
                seen.add(child.val);
        }

        Node root = null;
        // find the node that is not in the child node set.
        for (Node node : tree) {
            if (!seen.contains(node.val)) {
                root = node;
                break;
            }
        }
        return root;
    }
}
